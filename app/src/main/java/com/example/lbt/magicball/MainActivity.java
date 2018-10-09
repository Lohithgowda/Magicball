package com.example.lbt.magicball;

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


        int myNumber;
        final int[] ballnum =
                {
                        R.drawable.ball1,
                        R.drawable.ball2,
                        R.drawable.ball3,
                        R.drawable.ball4,
                        R.drawable.ball5
                };



        final ImageView imageView = findViewById(R.id.imageView);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {

                Random randomNumGenerator = new Random( );
                int number = randomNumGenerator.nextInt(5);

                imageView.setImageResource(ballnum[number]);

            }
        });







    }
}
