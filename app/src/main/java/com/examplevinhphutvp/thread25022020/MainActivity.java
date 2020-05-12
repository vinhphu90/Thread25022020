package com.examplevinhphutvp.thread25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // khoi tao ra luong
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1 ; i <= 20 ; i ++){
                    Log.d("BBB","A running at position:" + i);
                }

            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1 ; i <= 20 ; i ++){
                    Log.d("BBB","B running at position:" + i);
                }

            }
        });
        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1 ; i <= 20 ; i ++){
                    Log.d("BBB","C running at position:" + i);
                }

            }
        });
        threadA.start();
        threadB.start();
        threadC.start();
    }
    // cach 1 : dong bo thread theo ham
    public void printFor(String name){
        for (int i = 1 ; i <= 1000 ; i++){
            Log.d("BBB",name + "running at position:"+ i);
        }
    }
}
