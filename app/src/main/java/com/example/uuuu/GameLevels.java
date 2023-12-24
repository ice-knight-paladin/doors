package com.example.uuuu;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {

    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);
        mediaPlayer = MediaPlayer.create(this, R.raw.back_main);
        mediaPlayer.start();


        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){

                }
            }
        });

        TextView textView1 = findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level1.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){

                }
            }
        });
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level2.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){

                }
            }
        });

        TextView textView3 = findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level3.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){

                }
            }
        });

    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try{
            Intent intent = new Intent(GameLevels.this, MainActivity.class);
            startActivity(intent);
            finish();
        }catch (Exception e){

        }
    }
}