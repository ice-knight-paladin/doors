package com.example.uuuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private long backPressedTime;
    private Toast backtoast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button_start=(Button) findViewById(R.id.btn_start);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(MainActivity.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){

                }//
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(backPressedTime + 2000 > System.currentTimeMillis()){
            backtoast.cancel();
            super.onBackPressed();
            return;
        }
        else{
            backtoast = Toast.makeText(getBaseContext(), "Нажмите еще раз, чтобы выйти", Toast.LENGTH_SHORT);
            backtoast.show();
        }

        backPressedTime = System.currentTimeMillis();
    }
}