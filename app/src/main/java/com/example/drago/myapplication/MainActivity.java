package com.example.drago.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private Button btn_pulsa;
    private TextView tv_contador;
    private ImageView Img_eevee;
    private int num=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inflar();

        btn_pulsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_contador.getText().toString().equals("Contador"))
                    tv_contador.setText("1");
                else {
                    tv_contador.setText((Integer.parseInt(tv_contador.getText().toString().trim()) + 1) + "");

                }
            }
        });

        btn_pulsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    private void inflar() {
        btn_pulsa = (Button)findViewById(R.id.bt_pulsa);
        tv_contador = (TextView)findViewById(R.id.txt_contador);
        Img_eevee = (ImageView) findViewById(R.id.Img_eevee);
    }
}
