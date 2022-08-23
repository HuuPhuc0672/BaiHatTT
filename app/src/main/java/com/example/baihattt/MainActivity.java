package com.example.baihattt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout conLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        conLayout = (ConstraintLayout) findViewById(R.id.conLayout);
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                conLayout.setVisibility(View.GONE);
                Intent intent=new Intent(MainActivity.this,LitsBaiHat.class);
                startActivity(intent);
                finish();
            }
        },6680);

    }
}