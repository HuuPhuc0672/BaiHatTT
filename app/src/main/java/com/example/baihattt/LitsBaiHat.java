package com.example.baihattt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.baihattt.Adapter.Adepter_BaiHat;
import com.example.baihattt.Mode.BaiHat;

import java.util.ArrayList;

public class LitsBaiHat extends AppCompatActivity {
    private RecyclerView revNhac;
    Adepter_BaiHat adepter_baiHat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lits_bai_hat);
        revNhac = (RecyclerView) findViewById(R.id.revNhac);


        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        revNhac.setLayoutManager(linearLayoutManager);

        adepter_baiHat=new Adepter_BaiHat(getListBaiHat(),this);
        revNhac.setAdapter(adepter_baiHat);


    }

    private ArrayList<BaiHat> getListBaiHat() {
        ArrayList<BaiHat>list=new ArrayList<>();
        list.add(new BaiHat(R.drawable.anh1,"Cháu yêu bà.",getString(R.string.bai1),"Xuân Mai"));
        list.add(new BaiHat(R.drawable.anh2,"Cả nhà thương nhau.",getString(R.string.bai2),"Xuân Mai"));

        list.add(new BaiHat(R.drawable.anh3,"Trái đất này là của chúng mình.",getString(R.string.bai3),"Bảo An vs Phi Long"));
        list.add(new BaiHat(R.drawable.anh4,"Ngày đầu tiên đi học.",getString(R.string.bai4),"Xuân Mai"));

        list.add(new BaiHat(R.drawable.anh1,"Em Là Hoa Hồng Nhỏ.",getString(R.string.bai5),"Đoan Trang"));
        list.add(new BaiHat(R.drawable.anh2,"Happy Birthday to you.",getString(R.string.bai6),"Tú Anh"));

        list.add(new BaiHat(R.drawable.anh3,"Một Con Vịt",getString(R.string.bai7),"Khanh Ly"));




        return list;
    }
}