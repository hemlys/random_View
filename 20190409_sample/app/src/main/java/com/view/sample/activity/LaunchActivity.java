package com.view.sample.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.view.sample.R;

public class LaunchActivity extends AppCompatActivity {
    private EditText column,row;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);


        initView();
    }
    private void initView(){
        column = (EditText)findViewById(R.id.column);
        row = (EditText)findViewById(R.id.row);
        btn = (Button)findViewById(R.id.show);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if("".equals(column.getText().toString().trim()) || "".equals(row.getText().toString().trim()))
                {
                    Toast.makeText(LaunchActivity.this, "必須輸入值,而且大於 1" , Toast.LENGTH_LONG).show();
                    return;
                }
                int mcolumn = Integer.parseInt(column.getText().toString().trim());
                int mrow = Integer.parseInt(row.getText().toString().trim());

                if(mcolumn<=0||mrow<=0){
                    Toast.makeText(LaunchActivity.this, "必須輸入值,而且大於 1" , Toast.LENGTH_LONG).show();
                    return;
                }

                if (mrow >=11) {

                    Toast.makeText(LaunchActivity.this, "row 只支援最大 10" , Toast.LENGTH_LONG).show();
                    return;
                }

                Intent intent = new Intent(LaunchActivity.this, MainActivity.class);
                intent.putExtra("column", mcolumn);
                intent.putExtra("row", mrow);
                startActivity(intent);
                finish();
            }
        });
    }


}
