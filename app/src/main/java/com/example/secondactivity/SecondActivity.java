package com.example.secondactivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import static com.example.secondactivity.MainActivity.EXTRA_NAMA;
import static com.example.secondactivity.MainActivity.EXTRA_Institusi;

public class SecondActivity extends AppCompatActivity {
    TextView tvNama,tvInstitusi;
    Button btnActivity3;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvNama = findViewById(R.id.tv_nama);
        tvInstitusi = findViewById(R.id.tv_institusi);
        btnActivity3 = findViewById(R.id.btn_activity3);
        String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);
        String institusi = getIntent().getStringExtra(MainActivity.EXTRA_Institusi);
        Log.d("EXTRA_Institusi",EXTRA_Institusi);
        if(TextUtils.isEmpty(nama)){
            tvNama.setText("KOSONG");
        }
        else{
            tvNama.setText("Nama : "+nama);
        }
        if(TextUtils.isEmpty(institusi))
        {
            tvInstitusi.setText("KOSONG");
        }
        else{
            tvInstitusi.setText("Asal Institusi : "+institusi);
        }

        btnActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(moveIntent);
            }
        });
    }

}
