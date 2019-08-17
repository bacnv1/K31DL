package com.t3h.buoi16;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;

import com.t3h.buoi16.adapter.FileAdapter;
import com.t3h.buoi16.utils.FileManager;

import java.io.File;

public class MainActivity extends AppCompatActivity implements FileAdapter.FileItemListener, Runnable {
    private RecyclerView lvFile;
    private FileAdapter adapter;
    private FileManager manager = new FileManager();
    private String currentPath;
    private ProgressDialog dialog;

    private final String[] PERMISSIONS = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (checkPermissions() == true) {
            initViews();
        }
    }

    private boolean checkPermissions() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            for (String p: PERMISSIONS) {
                if (checkSelfPermission(p) ==
                        PackageManager.PERMISSION_DENIED) {
                    requestPermissions(PERMISSIONS, 0);
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (checkPermissions()) {
            initViews();
        }else {
            finish();
        }
    }

    private void initViews() {
        dialog = new ProgressDialog(this);
        dialog.setMessage("Loading...");
        dialog.setCancelable(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        lvFile = findViewById(R.id.lv_file);
        adapter = new FileAdapter(this);
        adapter.setListener(this);
        lvFile.setAdapter(adapter);
        getFile(FileManager.PATH);
    }

    private void getFile(String path) {
        currentPath = path;
        File f = new File(path);
        setTitle(f.getName());
        adapter.setData(manager.getFiles(path));
    }

    @Override
    public void onItemFileClicked(File file) {
        if (file.isDirectory()) {
            getFile(file.getPath());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.download, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
            case R.id.menu_download:
                dialog.show();
                Thread t = new Thread(this);
                t.start();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if (currentPath.equals(FileManager.PATH)) {
            super.onBackPressed();
        }else {
            File f = new File(currentPath);
            getFile(f.getParent());
        }
    }

    @Override
    public void run() {
        String link = "https://s72-stream.nixcdn.com/PreNCT12/DieuAnhMuonNoi-QuangHa-4594547.mp4?st=HHrwKpgw2ZGy2oIuYLMiaA&e=1566099797&t=1566013398546";
        manager.download(link);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                getFile(currentPath);
                dialog.dismiss();
            }
        });
    }
}
