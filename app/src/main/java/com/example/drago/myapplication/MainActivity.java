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
    private Button btn_borrar_todo,btn_borrar_caracter,btn_9,btn_8,btn_7,btn_6,btn_5,btn_4,btn_3,btn_2,btn_1,btn_0,btn_x,btn_menos,btn_mas,btn_bividir,btn_coma,btn_igual;
    private TextView tv_contador;
    private ImageView Img_eevee;
    private int num=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inflar();

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_contador.getText().toString().equals("0"))
                    tv_contador.setText("1");
                else
                    tv_contador.setText((Integer.parseInt(tv_contador.getText().toString().trim()) + 1) + "");
            }
        });


    }

    private void inflar() {
        btn_0 = (Button)findViewById(R.id.btn_0);
        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_8 = (Button)findViewById(R.id.btn_8);
        btn_9 = (Button)findViewById(R.id.btn_9);
        btn_borrar_todo = (Button)findViewById(R.id.btn_borrar_todo);
        btn_borrar_caracter = (Button)findViewById(R.id.btn_borrar_caracter);
        tv_contador = (TextView)findViewById(R.id.txt_contador);
        btn_x = (Button)findViewById(R.id.btn_x)
    }
}
