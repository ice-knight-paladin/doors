package com.example.uuuu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Level2 extends AppCompatActivity {
    Dialog dialog;
    Dialog dialog1;
    int i12, i11, i21, i22, i23, i33, i43;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);


        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        Button btn_back = findViewById(R.id.button_back);
        Level2 a = this;
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level2.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });
        ImageView image = findViewById(R.id.door1);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog = new Dialog(a);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.lines);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.setCancelable(false);
                ImageView imageView12 = dialog.findViewById(R.id.p12);
                ImageView imageView11 = dialog.findViewById(R.id.p11);
                ImageView imageView21 = dialog.findViewById(R.id.p21);
                ImageView imageView22 = dialog.findViewById(R.id.p22);
                ImageView imageView23 = dialog.findViewById(R.id.p23);
                ImageView imageView33 = dialog.findViewById(R.id.p33);
                ImageView imageView43 = dialog.findViewById(R.id.p43);
                imageView12.setRotation(90);
                imageView11.setRotation(180);
                imageView21.setRotation(270);
                imageView22.setRotation(90);
                imageView23.setRotation(90);
                imageView33.setRotation(90);
                imageView43.setRotation(270);

                imageView12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try{
                            imageView12.setRotation(90 + imageView12.getRotation());
                            if (imageView12.getRotation() % 360 == 0) i12 = 1;
                            else i12=0;
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
                            System.out.println(i12 + " " + " " + i11 + " " + i21 + " " + i22 + " " + i23 + " " + i33 + " " + i43);
                        }catch (Exception e){
                            System.out.println("Error43");
                        }
                    }
                });

                if (i12*i11*i21*i22*i23*i33*i43 == 1){
                    dialog1 = new Dialog(a);
                    dialog1.requestWindowFeature(Window.FEATURE_NO_TITLE);
                    dialog1.setContentView(R.layout.menudialog);
                    dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialog1.setCancelable(false);

                    //кнопка
                    TextView btn_close = (TextView) dialog1.findViewById(R.id.btnclose);
                    btn_close.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            try{
                                Intent intent = new Intent(Level2.this, GameLevels.class);
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

                    dialog1.show();
                }


                dialog.show();
            }
        });
    }
}

