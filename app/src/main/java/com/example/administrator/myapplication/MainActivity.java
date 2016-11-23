package com.example.administrator.myapplication;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationBar bottomNavigationBar;
    private Fragment[] fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}
