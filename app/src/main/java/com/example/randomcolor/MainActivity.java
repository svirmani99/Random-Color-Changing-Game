package com.example.randomcolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton=findViewById(R.id.imageButton);
    }
    public void dowork(View v){
        switch (v.getId()){
            case R.id.imageButton:
                Random rand=new Random();
                int r=rand.nextInt();
                int g=rand.nextInt();
                int b=rand.nextInt();
                int random=Color.rgb(r,g,b);
                imageButton.setBackgroundColor(random);
        }
    }
}
