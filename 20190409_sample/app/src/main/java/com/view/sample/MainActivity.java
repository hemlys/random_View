package com.view.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private Button iv_add;
    private RecycleAdapter adapter;
    private List<String> list = new ArrayList<String>();
    private int rowlist=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initRecycle();
        iv_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("hemly","list.size()= "+list.size());
               adapter.addData(list.size());
             //   adapter.addData(6);
            }
        });
    }
    private void initRecycle() {
        Random ran = new Random();
        rowlist= ran.nextInt(10)+1;
        Log.e("hemly","rowlist= "+rowlist);
        //  纵向滑动
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
//      获取数据，向适配器传数据，绑定适配器
        list = initData();
        adapter = new RecycleAdapter(MainActivity.this, list,rowlist);

        LinearLayoutManager ms= new LinearLayoutManager(this);
        ms.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(ms);

        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
    }
    private void initView() {
        iv_add = (Button) findViewById(R.id.iv_add);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    }

    protected ArrayList<String> initData() {
        ArrayList<String> mDatas = new ArrayList<String>();
        for (int i = 0; i < 8; i++) {
            mDatas.add("我是商品" + i);
        }
        return mDatas;
    }
}
