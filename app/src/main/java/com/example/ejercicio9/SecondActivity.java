package com.example.ejercicio9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ejercicio9.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding sBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sBinding =ActivitySecondBinding.inflate(getLayoutInflater());
        View view = sBinding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        String imagen = intent.getStringExtra("imagen");
        sBinding.ImageChoose.setImageResource(Integer.parseInt(imagen));


        sBinding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(back);
            }
        });
    }
}