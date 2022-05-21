package com.example.javadailywork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class thirdA extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        img=(ImageView) findViewById(R.id.img1);
        String aplhabet1 = getIntent().getStringExtra("alphabets[1]");
        String aplhabet2 = getIntent().getStringExtra("alphabets[2]");

        img.setVisibility(View.VISIBLE);
//
//        img=(ImageView) findViewById(R.id.img2);
//        String aplhabet2 = getIntent().getStringExtra("alphabets[2]");
//        img.setVisibility(View.VISIBLE);
//
//        img=(ImageView) findViewById(R.id.img3);
//        String aplhabet3 = getIntent().getStringExtra("alphabets[3]");
//        img.setVisibility(View.VISIBLE);
//
//        img=(ImageView) findViewById(R.id.img4);
//        String aplhabet4 = getIntent().getStringExtra("alphabets");
//        img.setVisibility(View.VISIBLE);

        img.setImageResource(R.drawable.b);


//        String imagename1 = "a.png";
//        int res1 = getResources().getIdentifier(imagename1, "drawable", this.getPackageName());
//        img= (ImageView)findViewById(R.id.img1);
//        img.setImageResource(res1);
//
//        String imagename2 = "b.png";
//        int res2 = getResources().getIdentifier(imagename2, "drawable", this.getPackageName());
//        img= (ImageView)findViewById(R.id.img2);
//        img.setImageResource(res2);




    }
}