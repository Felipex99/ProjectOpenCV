package com.example.projectopencv;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.opencv.android.OpenCVLoader;

public class Main extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (OpenCVLoader.initDebug()) Toast.makeText(this, "OpenCV Instalado", Toast.LENGTH_SHORT).show();
        else Toast.makeText(this, "Instalation Failed", Toast.LENGTH_SHORT).show();
    }
}
