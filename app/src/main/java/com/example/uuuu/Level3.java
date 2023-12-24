package com.example.uuuu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Level3 extends AppCompatActivity {
    Dialog dialog;
    Dialog dialog_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
        TextView textView = findViewById(R.id.text3);
        textView.setText(getString(R.string.level) + "3");

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        Button btn_back = findViewById(R.id.button_back3);
        Level3 a = this;
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(Level3.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){

                }
            }
        });
        ImageView image = findViewById(R.id.door3);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog = new Dialog(a);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.level3);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.setCancelable(false);

                EditText code = dialog.findViewById(R.id.code);
                Button button = dialog.findViewById(R.id.OK);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (code.getText().toString().equals("4519")){
                            dialog.dismiss();

                            dialog_next = new Dialog(a);
                            dialog_next.requestWindowFeature(Window.FEATURE_NO_TITLE);
                            dialog_next.setContentView(R.layout.menudialog);
                            dialog_next.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                            dialog_next.setCancelable(false);

                            //кнопка
                            TextView btn_close = (TextView) dialog_next.findViewById(R.id.btnclose);
                            btn_close.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    try{
                                        Intent intent = new Intent(Level3.this, GameLevels.class);
                                        startActivity(intent);
                                        finish();
                                    }catch (Exception e){

                                    }
                                }
                            });
                            //
//                            Button btn_next = dialog_next.findViewById(R.id.btnnext);
//                            btn_next.setOnClickListener(new View.OnClickListener() {
//                                @Override
//                                public void onClick(View view) {
//                                    try {
//                                        Intent intent = new Intent(Level3.this, Level2.class);
//                                        startActivity(intent);
//                                        finish();
//                                    }catch (Exception e){
//
//                                    }
//                                }
//                            });

                            dialog_next.show();
                        }
                    }
                });
                TextView close = dialog.findViewById(R.id.btnclose3);

                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
    }

}