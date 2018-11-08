package com.wildma.mqttandroidclient;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyMqttService.startService(this); //开启服务
    }

    public void publish(View view) {
        //模拟闸机设备发送消息过来
        MyMqttService.publish("tourist enter");
    }
}
