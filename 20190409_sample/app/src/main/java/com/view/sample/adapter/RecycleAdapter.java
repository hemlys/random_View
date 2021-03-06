package com.view.sample.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.view.sample.R;

import java.util.List;
import java.util.Random;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder> {
    private Context context;
    private List<String> list;
    private int rowlist;
    private  int unmy;

    public RecycleAdapter(Context context, List<String> list, int rowlist) {
        this.context = context;
        this.list = list;
        this.rowlist = rowlist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                context).inflate(R.layout.item_home, parent,
                false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.tv2.setVisibility(View.GONE);
        holder.tv3.setVisibility(View.GONE);
        holder.tv4.setVisibility(View.GONE);
        holder.tv5.setVisibility(View.GONE);
        holder.tv6.setVisibility(View.GONE);
        holder.tv7.setVisibility(View.GONE);
        holder.tv8.setVisibility(View.GONE);
        holder.tv9.setVisibility(View.GONE);
        holder.tv10.setVisibility(View.GONE);

        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);





        holder.tv1.setText(list.get(position));
        holder.tv_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (list.size() == 1) {
                    Snackbar.make(v, "此条目不能删除", Snackbar.LENGTH_SHORT).show();
                } else {
                    //               删除自带默认动画
                    removeData(position);
                }
            }
        });

        if(list.get(position).equals("random")){
            holder.layout.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
         //   Log.e("hemly","unmy= "+unmy);
            switch (unmy) {
                case 1:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    break;
                case 2:

                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv3.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    holder.tv3.setVisibility(View.VISIBLE);
                    break;
                case 4:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv3.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv4.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    holder.tv3.setVisibility(View.VISIBLE);
                    holder.tv4.setVisibility(View.VISIBLE);
                    break;
                case 5:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv3.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv4.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv5.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    holder.tv3.setVisibility(View.VISIBLE);
                    holder.tv4.setVisibility(View.VISIBLE);
                    holder.tv5.setVisibility(View.VISIBLE);
                    break;
                case 6:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv3.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv4.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv5.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv6.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    holder.tv3.setVisibility(View.VISIBLE);
                    holder.tv4.setVisibility(View.VISIBLE);
                    holder.tv5.setVisibility(View.VISIBLE);
                    holder.tv6.setVisibility(View.VISIBLE);
                    break;

                case 7:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv3.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv4.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv5.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv6.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv7.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    holder.tv3.setVisibility(View.VISIBLE);
                    holder.tv4.setVisibility(View.VISIBLE);
                    holder.tv5.setVisibility(View.VISIBLE);
                    holder.tv6.setVisibility(View.VISIBLE);
                    holder.tv7.setVisibility(View.VISIBLE);
                    break;
                case 8:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv3.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv4.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv5.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv6.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv7.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv8.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    holder.tv3.setVisibility(View.VISIBLE);
                    holder.tv4.setVisibility(View.VISIBLE);
                    holder.tv5.setVisibility(View.VISIBLE);
                    holder.tv6.setVisibility(View.VISIBLE);
                    holder.tv7.setVisibility(View.VISIBLE);
                    holder.tv8.setVisibility(View.VISIBLE);
                    break;
                case 9:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv3.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv4.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv5.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv6.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv7.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv8.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv9.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    holder.tv3.setVisibility(View.VISIBLE);
                    holder.tv4.setVisibility(View.VISIBLE);
                    holder.tv5.setVisibility(View.VISIBLE);
                    holder.tv6.setVisibility(View.VISIBLE);
                    holder.tv7.setVisibility(View.VISIBLE);
                    holder.tv8.setVisibility(View.VISIBLE);
                    holder.tv9.setVisibility(View.VISIBLE);
                    break;
                case 10:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv3.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv4.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv5.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv6.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv7.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv8.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv9.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv10.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    holder.tv3.setVisibility(View.VISIBLE);
                    holder.tv4.setVisibility(View.VISIBLE);
                    holder.tv5.setVisibility(View.VISIBLE);
                    holder.tv6.setVisibility(View.VISIBLE);
                    holder.tv7.setVisibility(View.VISIBLE);
                    holder.tv8.setVisibility(View.VISIBLE);
                    holder.tv9.setVisibility(View.VISIBLE);
                    holder.tv10.setVisibility(View.VISIBLE);
                    break;
            }
        }else {
            holder.layout.setBackgroundColor(context.getResources().getColor(R.color.white));
            switch (rowlist) {
                case 1:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    break;
                case 2:

                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv3.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    holder.tv3.setVisibility(View.VISIBLE);
                    break;
                case 4:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv3.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv4.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    holder.tv3.setVisibility(View.VISIBLE);
                    holder.tv4.setVisibility(View.VISIBLE);
                    break;
                case 5:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv3.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv4.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv5.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    holder.tv3.setVisibility(View.VISIBLE);
                    holder.tv4.setVisibility(View.VISIBLE);
                    holder.tv5.setVisibility(View.VISIBLE);
                    break;
                case 6:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv3.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv4.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv5.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv6.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    holder.tv3.setVisibility(View.VISIBLE);
                    holder.tv4.setVisibility(View.VISIBLE);
                    holder.tv5.setVisibility(View.VISIBLE);
                    holder.tv6.setVisibility(View.VISIBLE);
                    break;

                case 7:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv3.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv4.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv5.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv6.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv7.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    holder.tv3.setVisibility(View.VISIBLE);
                    holder.tv4.setVisibility(View.VISIBLE);
                    holder.tv5.setVisibility(View.VISIBLE);
                    holder.tv6.setVisibility(View.VISIBLE);
                    holder.tv7.setVisibility(View.VISIBLE);
                    break;
                case 8:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv3.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv4.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv5.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv6.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv7.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv8.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    holder.tv3.setVisibility(View.VISIBLE);
                    holder.tv4.setVisibility(View.VISIBLE);
                    holder.tv5.setVisibility(View.VISIBLE);
                    holder.tv6.setVisibility(View.VISIBLE);
                    holder.tv7.setVisibility(View.VISIBLE);
                    holder.tv8.setVisibility(View.VISIBLE);
                    break;
                case 9:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv3.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv4.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv5.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv6.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv7.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv8.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv9.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    holder.tv3.setVisibility(View.VISIBLE);
                    holder.tv4.setVisibility(View.VISIBLE);
                    holder.tv5.setVisibility(View.VISIBLE);
                    holder.tv6.setVisibility(View.VISIBLE);
                    holder.tv7.setVisibility(View.VISIBLE);
                    holder.tv8.setVisibility(View.VISIBLE);
                    holder.tv9.setVisibility(View.VISIBLE);
                    break;
                case 10:
                    holder.tv1.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv3.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv4.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv5.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv6.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv7.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv8.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv9.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv10.setBackgroundColor(Color.rgb(r, g, b));
                    holder.tv2.setVisibility(View.VISIBLE);
                    holder.tv3.setVisibility(View.VISIBLE);
                    holder.tv4.setVisibility(View.VISIBLE);
                    holder.tv5.setVisibility(View.VISIBLE);
                    holder.tv6.setVisibility(View.VISIBLE);
                    holder.tv7.setVisibility(View.VISIBLE);
                    holder.tv8.setVisibility(View.VISIBLE);
                    holder.tv9.setVisibility(View.VISIBLE);
                    holder.tv10.setVisibility(View.VISIBLE);
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public void UpdateData(List<String> lista, int unmy) {
       this.list= lista;
       this.unmy = unmy;
        notifyDataSetChanged();
    }




    public void removeData(int position) {
        list.remove(position);
        //删除动画
        notifyItemRemoved(position);
        notifyDataSetChanged();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10;
        private Button tv_delete;
        private LinearLayout layout;
        public MyViewHolder(View view) {
            super(view);
            tv1 = (TextView) view.findViewById(R.id.id_num1);
            tv2 = (TextView) view.findViewById(R.id.id_num2);
            tv3 = (TextView) view.findViewById(R.id.id_num3);
            tv4 = (TextView) view.findViewById(R.id.id_num4);
            tv5 = (TextView) view.findViewById(R.id.id_num5);
            tv6 = (TextView) view.findViewById(R.id.id_num6);
            tv7 = (TextView) view.findViewById(R.id.id_num7);
            tv8 = (TextView) view.findViewById(R.id.id_num8);
            tv9 = (TextView) view.findViewById(R.id.id_num9);
            tv10 = (TextView) view.findViewById(R.id.id_num10);

            tv_delete = (Button) view.findViewById(R.id.tv_delete);
            layout = (LinearLayout)view.findViewById(R.id.Layout);
        }
    }
}
