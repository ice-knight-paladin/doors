package com.example.uuuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.ListFormatter;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Level1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universel);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        Button btn_back = findViewById(R.id.button_ba);
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
    }
}