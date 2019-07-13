package com.t3h.buoi9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.t3h.buoi9.adapters.FaceAdapter;
import com.t3h.buoi9.models.Face;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements FaceAdapter.ItemFaceClickListener {

    private RecyclerView lvFace;
    private FaceAdapter adapter;
    private ArrayList<Face> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initViews();
    }

    private void initViews() {
        lvFace = findViewById(R.id.lv_face);
        adapter = new FaceAdapter(this);
        lvFace.setAdapter(adapter);
        adapter.setData(data);
        adapter.setListener(this);
    }

    private void initData() {
        data = new ArrayList<>();
        data.add(new Face(R.drawable.cry, "Cry"));
        data.add(new Face(R.drawable.grimace, "Grimace"));
        data.add(new Face(R.drawable.love, "Love"));
        data.add(new Face(R.drawable.victory, "Victory"));
        data.add(new Face(R.drawable.what, "What"));
        data.add(new Face(R.drawable.cry, "Cry"));
        data.add(new Face(R.drawable.grimace, "Grimace"));
        data.add(new Face(R.drawable.love, "Love"));
        data.add(new Face(R.drawable.victory, "Victory"));
        data.add(new Face(R.drawable.what, "What"));
        data.add(new Face(R.drawable.cry, "Cry"));
        data.add(new Face(R.drawable.grimace, "Grimace"));
        data.add(new Face(R.drawable.love, "Love"));
        data.add(new Face(R.drawable.victory, "Victory"));
        data.add(new Face(R.drawable.what, "What"));
        data.add(new Face(R.drawable.cry, "Cry"));
        data.add(new Face(R.drawable.grimace, "Grimace"));
        data.add(new Face(R.drawable.love, "Love"));
        data.add(new Face(R.drawable.victory, "Victory"));
        data.add(new Face(R.drawable.what, "What"));
        data.add(new Face(R.drawable.cry, "Cry"));
        data.add(new Face(R.drawable.grimace, "Grimace"));
        data.add(new Face(R.drawable.love, "Love"));
        data.add(new Face(R.drawable.victory, "Victory"));
        data.add(new Face(R.drawable.what, "What"));
        data.add(new Face(R.drawable.cry, "Cry"));
        data.add(new Face(R.drawable.grimace, "Grimace"));
        data.add(new Face(R.drawable.love, "Love"));
        data.add(new Face(R.drawable.victory, "Victory"));
        data.add(new Face(R.drawable.what, "What"));
    }

    @Override
    public void onItemFaceClicked(int position) {
        Toast.makeText(this, data.get(position).getName(),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemFaceLongClicked(int position) {
        data.remove(position);
        adapter.setData(data);
    }
}
