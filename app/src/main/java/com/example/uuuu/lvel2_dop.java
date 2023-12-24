package com.example.uuuu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class lvel2_dop extends AppCompatActivity {
    Dialog dialog;
    int i12, i11, i21, i22, i23, i33, i43;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvel2_dop);

        ImageView imageView12 = findViewById(R.id.p12);
        ImageView imageView11 = findViewById(R.id.p11);
        ImageView imageView21 = findViewById(R.id.p21);
        ImageView imageView22 = findViewById(R.id.p22);
        ImageView imageView23 = findViewById(R.id.p23);
        ImageView imageView33 = findViewById(R.id.p33);
        ImageView imageView43 = findViewById(R.id.p43);
        imageView12.setRotation(90);
        imageView11.setRotation(180);
        imageView21.setRotation(270);
        imageView22.setRotation(90);
        imageView23.setRotation(90);
        imageView33.setRotation(90);
        imageView43.setRotation(270);

        ImageView imageView14 = findViewById(R.id.p14);
        ImageView imageView24 = findViewById(R.id.p24);
        ImageView imageView31 = findViewById(R.id.p31);
        ImageView imageView32 = findViewById(R.id.p32);
        ImageView imageView34 = findViewById(R.id.p34);
        ImageView imageView41 = findViewById(R.id.p41);
        ImageView imageView42 = findViewById(R.id.p42);
        ImageView imageView44 = findViewById(R.id.p44);

        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    imageView14.setRotation(90 + imageView14.getRotation());
                }catch (Exception e){

                }
            }
        });
        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    imageView24.setRotation(90 + imageView24.getRotation());
                }catch (Exception e){

                }
            }
        });
        imageView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    imageView31.setRotation(90 + imageView31.getRotation());
                }catch (Exception e){

                }
            }
        });
        imageView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    imageView32.setRotation(90 + imageView32.getRotation());
                }catch (Exception e){

                }
            }
        });
        imageView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    imageView34.setRotation(90 + imageView34.getRotation());
                }catch (Exception e){

                }
            }
        });
        imageView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    imageView41.setRotation(90 + imageView41.getRotation());
                }catch (Exception e){

                }
            }
        });
        imageView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    imageView42.setRotation(90 + imageView42.getRotation());
                }catch (Exception e){

                }
            }
        });
        imageView44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    imageView44.setRotation(90 + imageView44.getRotation());
                }catch (Exception e){

                }
            }
        });


        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    imageView12.setRotation(90 + imageView12.getRotation());
                    if (imageView12.getRotation() % 360 == 0) i12 = 1;
                    else i12=0;
                    if (i12*i11*i21*i22*i23*i33*i43 == 1) func_btn(i12,i11,i21,i22,i23,i33,i43);
                }catch (Exception e){
                    System.out.println("Error12");
                }
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    imageView11.setRotation(90 + imageView11.getRotation());
                    if (imageView11.getRotation() % 360 == 0) i11 = 1;
                    else i11=0;
                    if (i12*i11*i21*i22*i23*i33*i43 == 1) func_btn(i12,i11,i21,i22,i23,i33,i43);
                }catch (Exception e){
                    System.out.println("Error11");
                }
            }
        });
        imageView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    imageView21.setRotation(90 + imageView21.getRotation());
                    if (imageView21.getRotation() % 360 == 0) i21 = 1;
                    else i21=0;
                    if (i12*i11*i21*i22*i23*i33*i43 == 1) func_btn(i12,i11,i21,i22,i23,i33,i43);
                }catch (Exception e){
                    System.out.println("Error21");
                }
            }
        });
        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    imageView22.setRotation(90 + imageView22.getRotation());
                    if (imageView22.getRotation() % 180 == 0) i22 = 1;
                    else i22=0;
                    if (i12*i11*i21*i22*i23*i33*i43 == 1) func_btn(i12,i11,i21,i22,i23,i33,i43);
                }catch (Exception e){
                    System.out.println("Error22");
                }
            }
        });
        imageView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    imageView23.setRotation(90 + imageView23.getRotation());
                    if (imageView23.getRotation() % 360 == 0) i23 = 1;
                    else i23=0;
                    if (i12*i11*i21*i22*i23*i33*i43 == 1) func_btn(i12,i11,i21,i22,i23,i33,i43);
                }catch (Exception e){
                    System.out.println("Error23");
                }
            }
        });
        imageView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    imageView33.setRotation(90 + imageView33.getRotation());
                    if (imageView33.getRotation() % 180 == 0) i33 = 1;
                    else i33=0;
                    if (i12*i11*i21*i22*i23*i33*i43 == 1) func_btn(i12,i11,i21,i22,i23,i33,i43);
                }catch (Exception e){
                    System.out.println("Error33");
                }
            }
        });
        imageView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    imageView43.setRotation(90 + imageView43.getRotation());
                    if (imageView43.getRotation() % 180 == 0) i43 = 1;
                    else i43=0;
                    if (i12*i11*i21*i22*i23*i33*i43 == 1) func_btn(i12,i11,i21,i22,i23,i33,i43);
                }catch (Exception e){
                    System.out.println("Error43");
                }
            }
        });
        System.out.println(i12*i11*i21*i22*i23*i33*i43);

    }
    void func_btn(int i12, int i11, int i21, int i22, int i23, int i33, int i43){
        if (i12*i11*i21*i22*i23*i33*i43 == 1){
            dialog = new Dialog(lvel2_dop.this);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setContentView(R.layout.menudialog);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.setCancelable(false);

            //кнопка
            TextView btn_close = (TextView) dialog.findViewById(R.id.btnclose);
            btn_close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        Intent intent = new Intent(lvel2_dop.this, GameLevels.class);
                        startActivity(intent);
                        finish();
                    }catch (Exception e){

                    }
                }
            });
            //
//                    Button btn_next = dialog.findViewById(R.id.btnnext);
//                    btn_next.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View view) {
//                            try {
//                                Intent intent = new Intent(Level2.this, Level2.class);
//                                startActivity(intent);
//                                finish();
//                            }catch (Exception e){
//
//                            }
//                        }
//                    });

            dialog.show();
        }
    }
}