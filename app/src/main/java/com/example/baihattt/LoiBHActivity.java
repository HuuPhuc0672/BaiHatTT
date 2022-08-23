package com.example.baihattt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.baihattt.Mode.BaiHat;

public class LoiBHActivity extends AppCompatActivity {
    private TextView txtBaiHat;
    private TextView txtloiBH;
    private TextView txtCasi;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loi_bhactivity);

        txtBaiHat = (TextView) findViewById(R.id.txt_BaiHat);
        txtloiBH = (TextView) findViewById(R.id.txtloiBH);
        txtCasi = (TextView) findViewById(R.id.txtCasi);

        Bundle bundle=getIntent().getExtras();
        BaiHat duLich= (BaiHat) bundle.get("object_Dulieu");


        txtBaiHat.setText(duLich.getTenBH());
        txtloiBH.setText(duLich.getLoiBH());
        txtCasi.setText("Ca sĩ: "+duLich.getNguoiTheH());


    }
}