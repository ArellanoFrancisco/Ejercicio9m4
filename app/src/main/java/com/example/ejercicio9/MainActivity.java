package com.example.ejercicio9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ejercicio9.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mBinding.getRoot();
        setContentView(view);

        mBinding.icecream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose(""+R.mipmap.icecream);
            }
        });
        mBinding.headset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose(""+R.mipmap.headset);
            }
        });
        mBinding.like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose(""+R.mipmap.like);
            }
        });
        mBinding.wine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose(""+R.mipmap.wine);
            }
        });
        mBinding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }

    protected void choose(String image){

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("imagen", image);
        startActivity(intent);

    }

}