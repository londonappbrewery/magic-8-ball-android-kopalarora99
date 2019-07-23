package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView balldisplay=findViewById(R.id.image_8ball);

         final int[] ballarray=new int[] {
                 R.drawable.ball1,
                 R.drawable.ball2,
                 R.drawable.ball3,
                 R.drawable.ball4,
                 R.drawable.ball5
         };
        Button mybutton= findViewById(R.id.askbutton);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomnumbergenerator=new Random();
                int number=randomnumbergenerator.nextInt(5);
                int ImageResourceId=ballarray[number];
                balldisplay.setImageResource(ImageResourceId);
            }
        });
    }
}
