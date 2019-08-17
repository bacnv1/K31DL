package com.t3h.buoi16.utils;

import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileManager {
    public static final String PATH =
            Environment.getExternalStorageDirectory().getPath();

    public File[] getFiles(String path) {
        File f = new File(path);
        return f.listFiles();
    }

    public String download(String link) {
        try {
            // ghi
            String path = PATH + "/K31/" + System.currentTimeMillis() +".mp4";
            File f = new File(path);
            f.getParentFile().mkdirs();
            f.createNewFile();
            FileOutputStream out = new FileOutputStream(f);
            // doc
            URL url = new URL(link);
            URLConnection connection = url.openConnection();
            InputStream in = connection.getInputStream();

            byte[] b = new byte[1024];
            int count = in.read(b);
            while (count != -1) {
                out.write(b, 0, count);
                count = in.read(b);
            }
            out.close();
            in.close();
            return path;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
