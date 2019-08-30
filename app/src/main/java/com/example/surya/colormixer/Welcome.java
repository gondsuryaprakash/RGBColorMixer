package com.example.surya.colormixer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Thread t =new Thread(){
            public void run(){
                try {
                    sleep(4*1000);
                    Intent i=new Intent(Welcome.this,Color2.class);
                    startActivity(i);
                    finish();
                }
                catch (Exception e){
                    e.printStackTrace();
                }

            }

        };
        t.start();

    }
}
