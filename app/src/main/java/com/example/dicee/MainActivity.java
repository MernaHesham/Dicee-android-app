package com.example.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.util.Log;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button)findViewById(R.id.rollbutton);

        final ImageView leftDice = (ImageView)findViewById(R.id.imageleftDice);
        final ImageView rightDice = (ImageView)findViewById(R.id.imagerightDice
        );

        final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "ITs pressed");

                Random randomNumGenerator = new Random();

                int number = randomNumGenerator.nextInt(6);

                Log.d("Dicee","the random num is:"+ number);

                leftDice.setImageResource(diceArray[number]);

                number = randomNumGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number]);


            }
        });

    }
}
