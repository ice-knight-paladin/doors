package com.example.uuuu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Level1 extends AppCompatActivity {

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level1);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        TextView textView = findViewById(R.id.text_level);
        textView.setText(getString(R.string.level) + "1");

        Button btn_back = findViewById(R.id.button_ba);
        Level1 a = this;
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(Level1.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){

                }
            }
        });
        ImageView image = findViewById(R.id.door1);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog = new Dialog(a);
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
                            Intent intent = new Intent(Level1.this, GameLevels.class);
                            startActivity(intent);
                            finish();
                        }catch (Exception e){

                        }
                    }
                });
                //
                Button btn_next = dialog.findViewById(R.id.btnnext);
                btn_next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            dialog.dismiss();
                            Intent intent = new Intent(Level1.this, Level2.class);
                            startActivity(intent);
                            finish();
                        }catch (Exception e){

                        }
                    }
                });

                dialog.show();
            }   
        });
    }
}