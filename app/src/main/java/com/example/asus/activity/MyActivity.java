package com.example.asus.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
//        获取应用中的bn按钮
        Button bn=(Button) findViewById(R.id.bn);
//        为按钮绑定事件监听器
        bn.setOnClickListener(new MyClickListener());
    }

    private class MyClickListener implements View.OnClickListener {
//        实现监听器类必须实现的方法，该方法将会作为事件处理器
        @Override
        public void onClick(View v){
            EditText txt = (EditText)findViewById(R.id.txt);
            txt.setText("bn按钮被单击了！");
        }
    }
//    定义一个单击事件的监听器
}
