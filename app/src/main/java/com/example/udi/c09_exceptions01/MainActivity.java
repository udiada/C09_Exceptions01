package com.example.udi.c09_exceptions01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    public static final String  TAG="excp1";
    EditText etNum;
    Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum=(EditText)findViewById(R.id.etnum);
        btnPlay=(Button) findViewById(R.id.btnplay);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n=etNum.length();
                etNum.setText("len:"+n);
            }
        });
        int a;
        String str=null;
        try {
            str=etNum.getText().toString();
            Log.d(TAG, "str:"+str);
            a = 4 / 0;
         } catch (ArithmeticException  e) {
            Log.d(TAG,  e.getMessage());
         }
         catch (NullPointerException e){
             Log.d(TAG,  e.getMessage());
         }
        Log.d(TAG,"Final line");
    }
}
