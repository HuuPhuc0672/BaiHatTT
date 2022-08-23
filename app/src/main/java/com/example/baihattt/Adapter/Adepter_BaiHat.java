package com.example.baihattt.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baihattt.LoiBHActivity;
import com.example.baihattt.Mode.BaiHat;
import com.example.baihattt.R;

import java.util.ArrayList;

public class Adepter_BaiHat extends  RecyclerView.Adapter<Adepter_BaiHat.BaiHaiHolder> {
    ArrayList<BaiHat> baiHats;
    Context context;

    public Adepter_BaiHat( ArrayList<BaiHat> baiHats,Context context){
        this.baiHats=baiHats;
        this.context=context;

    }

    @NonNull
    @Override
    public BaiHaiHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bai_hat,parent,false);
        return  new BaiHaiHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BaiHaiHolder holder, int position) {
        BaiHat baiHat=baiHats.get(position);
        holder.iViewAnhBh.setImageResource(baiHat.getAnhBH());
        holder.txtTenBH.setText(baiHat.getTenBH());
        holder.txtTenCS.setText("Ca Sĩ: "+baiHat.getNguoiTheH());
        holder.carVie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickdata(baiHat);

            }
        });


    }

    private void onClickdata(BaiHat baiHat) {
        Intent intent=new Intent(context,LoiBHActivity.class);
        Bundle bundle=new Bundle();
        bundle.putSerializable("object_Dulieu",baiHat);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        if (baiHats != null){
            return  baiHats.size();
        }return 0;
    }

    public class BaiHaiHolder extends RecyclerView.ViewHolder{
        private CardView carVie1;
        private ImageView iViewAnhBh;
        private TextView txtTenBH;
        private TextView txtTenCS;



        public BaiHaiHolder(@NonNull View itemView) {
            super(itemView);
            carVie1 = (CardView) itemView.findViewById(R.id.carVie1);
            iViewAnhBh = (ImageView) itemView.findViewById(R.id.iViewAnhBh);
            txtTenBH = (TextView) itemView.findViewById(R.id.txtTenBH);
            txtTenCS = (TextView) itemView.findViewById(R.id.txtTenCS);

        }
    }
}
