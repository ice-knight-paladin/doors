package com.example.uuuu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class lvel2_dop extends AppCompatActivity {
    Dialog dialog;
    int i12, i11, i21, i22, i23, i33, i43, i42, i32, i24, i34, i44;
    private static final int SIZE = 4;
    private static final char WALL = '#';
    private static final char PATH = '.';
    private static char[][] maze;
    public static void generateMaze() {
        maze = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                maze[i][j] = WALL;
            }
        }
        generatePath(1, 1);
        maze[0][1] = 'S';
        maze[SIZE - 1][SIZE - 2] = 'E';
    }
    private static void generatePath(int row, int col) {
        maze[row][col] = PATH;
        int[][] neighbors = {{row - 2, col}, {row + 2, col}, {row, col - 2}, {row, col + 2}};
        shuffleArray(neighbors);
        for (int[] neighbor : neighbors) {
            int nextRow = neighbor[0];
            int nextCol = neighbor[1];
            if (nextRow >= 0 && nextRow < SIZE && nextCol >= 0 && nextCol < SIZE && maze[nextRow][nextCol] == WALL) {
                int wallRow = (row + nextRow) / 2;
                int wallCol = (col + nextCol) / 2;
                maze[nextRow][nextCol] = PATH;
                maze[wallRow][wallCol] = PATH;
                generatePath(nextRow, nextCol);
            }
        }
    }

    private static void shuffleArray(int[][] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int[] temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }



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
        ImageView imageView14 = findViewById(R.id.p14);
        ImageView imageView24 = findViewById(R.id.p24);
        ImageView imageView31 = findViewById(R.id.p31);
        ImageView imageView32 = findViewById(R.id.p32);
        ImageView imageView34 = findViewById(R.id.p34);
        ImageView imageView41 = findViewById(R.id.p41);
        ImageView imageView42 = findViewById(R.id.p42);
        ImageView imageView44 = findViewById(R.id.p44);
        ImageView imageView13 = findViewById(R.id.p13);


        generateMaze();



        if (maze[1][2] == '#'){
            imageView12.setBackground(getDrawable(R.drawable.pramo2));
            imageView22.setBackground(getDrawable(R.drawable.pramo2));
            imageView32.setBackground(getDrawable(R.drawable.pramo2));
            imageView42.setBackground(getDrawable(R.drawable.ugol3));
            imageView43.setBackground(getDrawable(R.drawable.ugol1));
            imageView12.setRotation(90);
            imageView22.setRotation(180);
            imageView32.setRotation(270);
            imageView42.setRotation(90);
            imageView43.setRotation(90);
            imageView12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        imageView12.setRotation(90 + imageView12.getRotation());
                        if (imageView12.getRotation() % 180 == 0) i12 = 1;
                        else i12=0;
                        if (i12*i22*i32*i42*i43 == 1) func_btn();
                    }catch (Exception e){
                        System.out.println("Error12");
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
                        if (i12*i22*i32*i42*i43 == 1) func_btn();
                    }catch (Exception e){
                        System.out.println("Error11");
                    }
                }
            });
            imageView32.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        imageView32.setRotation(90 + imageView32.getRotation());
                        if (imageView34.getRotation() % 180 == 0) i32 = 1;
                        else i32 = 0;
                        if (i12*i22*i32*i42*i43 == 1) func_btn();
                    }catch (Exception e){
                        System.out.println("Error12");
                    }
                }
            });
            imageView42.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        imageView42.setRotation(90 + imageView42.getRotation());
                        if (imageView42.getRotation() % 180 == 0) i42 = 1;
                        else i42=0;
                        if (i12*i22*i32*i42*i43 == 1) func_btn();
                    }catch (Exception e){
                        System.out.println("Error22");
                    }
                }
            });
            imageView43.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        imageView43.setRotation(90 + imageView43.getRotation());
                        if (imageView43.getRotation() % 360 == 0) i43 = 1;
                        else i43=0;
                        if (i12*i22*i32*i42*i43 == 1) func_btn();
                    }catch (Exception e){
                        System.out.println("Error23");
                    }
                }
            });

            imageView11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView11.setRotation(imageView11.getRotation() + 90);
                }
            });
            imageView13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView13.setRotation(imageView13.getRotation() + 90);
                }
            });
            imageView14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView14.setRotation(imageView14.getRotation() + 90);
                }
            });
            imageView21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView21.setRotation(imageView21.getRotation() + 90);
                }
            });
            imageView23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView23.setRotation(imageView23.getRotation() + 90);
                }
            });
            imageView24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView24.setRotation(imageView24.getRotation() + 90);
                }
            });
            imageView31.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView31.setRotation(imageView31.getRotation() + 90);
                }
            });
            imageView33.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView33.setRotation(imageView33.getRotation() + 90);
                }
            });
            imageView34.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView34.setRotation(imageView34.getRotation() + 90);
                }
            });
            imageView41.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView41.setRotation(imageView41.getRotation() + 90);
                }
            });
            imageView44.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView44.setRotation(imageView44.getRotation() + 90);
                }
            });
        }
        else {
            imageView12.setBackground(getDrawable(R.drawable.pramo2));
            imageView22.setBackground(getDrawable(R.drawable.ugol3));
            imageView23.setBackground(getDrawable(R.drawable.pramo));
            imageView24.setBackground(getDrawable(R.drawable.ugol1));
            imageView34.setBackground(getDrawable(R.drawable.pramo2));
            imageView44.setBackground(getDrawable(R.drawable.ugol2));
            imageView43.setBackground(getDrawable(R.drawable.ugol4));
            imageView12.setRotation(90);
            imageView22.setRotation(90);
            imageView23.setRotation(90);
            imageView24.setRotation(90);
            imageView34.setRotation(90);
            imageView44.setRotation(90);
            imageView43.setRotation(90);

            imageView12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        imageView12.setRotation(90 + imageView12.getRotation());
                        if (imageView12.getRotation() % 180 == 0) i12 = 1;
                        else i12=0;
                        if (i12*i22*i23*i24*i34*i44*i43 == 1) func_btn();
                    }catch (Exception e){
                        System.out.println("Error12");
                    }
                }
            });
            imageView22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        imageView22.setRotation(90 + imageView22.getRotation());
                        if (imageView22.getRotation() % 360 == 0) i22 = 1;
                        else i22=0;
                        if (i12*i22*i23*i24*i34*i44*i43 == 1) func_btn();
                    }catch (Exception e){
                        System.out.println("Error12");
                    }
                }
            });
            imageView23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        imageView23.setRotation(90 + imageView23.getRotation());
                        if (imageView23.getRotation() % 180 == 0) i23 = 1;
                        else i23=0;
                        System.out.println(i12*i22*i23*i24*i34*i44*i43);
                        if (i12*i22*i23*i24*i34*i44*i43 == 1) func_btn();
                    }catch (Exception e){
                        System.out.println("Error12");
                    }
                }
            });
            imageView24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        imageView24.setRotation(90 + imageView24.getRotation());
                        if (imageView24.getRotation() % 360 == 0) i24 = 1;
                        else i24=0;
                        if (i12*i22*i23*i24*i34*i44*i43 == 1) func_btn();
                    }catch (Exception e){
                        System.out.println("Error12");
                    }
                }
            });
            imageView34.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        imageView34.setRotation(90 + imageView34.getRotation());
                        if (imageView34.getRotation() % 180 == 0) i34 = 1;
                        else i34=0;
                        if (i12*i22*i23*i24*i34*i44*i43 == 1) func_btn();
                    }catch (Exception e){
                        System.out.println("Error12");
                    }
                }
            });
            imageView44.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        imageView44.setRotation(90 + imageView44.getRotation());
                        if (imageView44.getRotation() % 360 == 0) i44 = 1;
                        else i44=0;
                        if (i12*i22*i23*i24*i34*i44*i43 == 1) func_btn();
                    }catch (Exception e){
                        System.out.println("Error12");
                    }
                }
            });
            imageView43.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        imageView43.setRotation(90 + imageView43.getRotation());
                        System.out.println(i12 + " " + i22 + " " + i23 + " " + i24 + " " + i34 + " " + i44 + " " + i43);
                        if (imageView43.getRotation() % 360 == 0) i43 = 1;
                        else i43=0;
                        if (i12*i22*i23*i24*i34*i44*i43 == 1) func_btn();
                    }catch (Exception e){
                        System.out.println("Error12");
                    }
                }
            });
        }
    }
    void func_btn(){
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

            Button btn_next = dialog.findViewById(R.id.btnnext);
            btn_next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        dialog.dismiss();
                        Intent intent = new Intent(lvel2_dop.this, Level3.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e){

                    }
                }
            });
            dialog.show();

    }
}