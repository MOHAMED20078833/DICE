package com.example.hp.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random doka = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageViewDice = (ImageView) findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HitDice();
            }
        });
    }

    private void HitDice() {
        int RandomNumber = doka.nextInt(6) + 1;

        switch (RandomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice_1);
                break;

            case 2:
                imageViewDice.setImageResource(R.drawable.dice_2);
                break;

            case 3:
                imageViewDice.setImageResource(R.drawable.dice_3);
                break;

            case 4:
                imageViewDice.setImageResource(R.drawable.dice_4);
                break;

            case 5:
                imageViewDice.setImageResource(R.drawable.dice_5);
                break;

            case 6:
                imageViewDice.setImageResource(R.drawable.dice_6);
                break;


        }


    }
}
