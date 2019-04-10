package com.view.sample.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.view.sample.R;
import com.view.sample.adapter.RecycleAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<String> aaa = new ArrayList<String>();
    //-----------------------
    private RecyclerView mRecyclerView;
    private RecycleAdapter adapter;
    private List<String> list = new ArrayList<String>();
    private int column, row, ranrow = 1;

    private Button iv_add;

    private int x, y;
    private Handler handlerse = new Handler();
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Random ran = new Random();
            x = ran.nextInt(10) + 1;
            Random rans = new Random();
            y = rans.nextInt(10) + 1;
            //  Log.e("hemly", "x= " + x + " y= " + y);

            boolean isok = false;
            //-----------------------
            list = initData();
            aaa.clear();
            for (int i = 0; i < list.size(); i++) {

                if (i == x) {
                    aaa.add("random");
                    isok = true;
                }
                aaa.add("我是商品" + i);


            }
            if (!isok) {
                aaa.add("random");
            }
            adapter.UpdateData(aaa, y);


            handlerse.postDelayed(this, 10000);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_add = (Button) findViewById(R.id.iv_add);
        iv_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random ran = new Random();
                int unmx = ran.nextInt(10) + 1;
                Random rans = new Random();
                int unmy = rans.nextInt(10) + 1;


                boolean isok = false;
                //-----------------------
                list = initData();
                aaa.clear();
                for (int i = 0; i < list.size(); i++) {

                    if (i == unmx) {
                        aaa.add("random");
                        isok = true;
                    }
                    aaa.add("我是商品" + i);


                }
                if (!isok) {
                    aaa.add("random");
                }
                adapter.UpdateData(aaa, unmy);
            }
        });

        handlerse.postDelayed(runnable, 10000);
        Intent intent = getIntent();
        column = intent.getIntExtra("column", 0);
        row = intent.getIntExtra("row", 0);
        initView();
        initRecycle();

    }

    private void initRecycle() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        list = initData();

        adapter = new RecycleAdapter(MainActivity.this, list, row);

        LinearLayoutManager ms = new LinearLayoutManager(this);
        ms.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(ms);

        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    }

    protected ArrayList<String> initData() {
        ArrayList<String> mDatas = new ArrayList<String>();
        for (int i = 0; i < column; i++) {
            mDatas.add("我是商品" + i);
        }
        return mDatas;
    }

    @Override
    protected void onDestroy() {
        handlerse.removeCallbacks(runnable);


        super.onDestroy();
    }

}
