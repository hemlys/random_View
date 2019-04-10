package com.view.sample;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context mContext;
    private int myData;
    private CustomItemClickListener listener;
 //   private List<Boolean> isClicks;

    public RecyclerViewAdapter(Context context, int datas, CustomItemClickListener listener) {
        this.mContext = context;
        this.myData = datas;
        this.listener = listener;
//        isClicks = new ArrayList<>();
//        for(int i = 0;i<myData;i++){
//            isClicks.add(false);
//        }

    }



    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext
        ).inflate(R.layout.activity_item, parent,
                false);
        final  ViewHolder holder = new ViewHolder(view);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(v, holder.getAdapterPosition());
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewAdapter.ViewHolder holder, int position) {
        //顯示資料的地方

//        holder.cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                int position = holder.getLayoutPosition(); // 1
//                for(int i = 0; i <isClicks.size();i++){
//                    isClicks.set(i,false);
//                }
//                isClicks.set(position,true);
//                notifyDataSetChanged();
//                listener.onItemClick(v, holder.getAdapterPosition());
//            }
//        });
//
//        if(isClicks.get(position)){
//            holder.cardView.setBackground(mContext.getResources().getDrawable(R.drawable.select));
//        }else{
//            holder.cardView.setBackground(mContext.getResources().getDrawable(R.drawable.unselect));
//        }


        for(int i=0;i<myData;i++){
            Random random = new Random();
            int r = random.nextInt(256);
            int g = random.nextInt(256);
            int b = random.nextInt(256);

            TextView child = new TextView(mContext);
            child.setTextSize(20);
         //   int num= (int)(Math.random()* 10);
        //    child.setText(position+"");
            child.setBackgroundColor(Color.rgb(r,g,b));
            holder.container.addView(child);
        }
    }

    @Override
    public int getItemCount() {
        return myData;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout container;
        private LinearLayout cardView;
        public ViewHolder(View itemView) {
            super(itemView);

            container = (LinearLayout) itemView.findViewById(R.id.container);
            cardView= (LinearLayout) itemView.findViewById(R.id.cardView);
        }
    }

    public void addView(View view) {
//        TextView child = new TextView(mContext);
//        child.setTextSize(20);
//       // child.setTextColor(getResources().getColor(R.color.colorAccent));
//        // 获取当前的时间并转换为时间戳格式, 并设置给TextView
//        String currentTime = dateToStamp(System.currentTimeMillis());
//        child.setText(currentTime);
//        // 调用一个参数的addView方法
//        cardView.addView(child);
    }


    public String dateToStamp(long s) {
        String res;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date(s);
            res = simpleDateFormat.format(date);
        } catch (Exception e) {
            return "";
        }
        return res;
    }
}
