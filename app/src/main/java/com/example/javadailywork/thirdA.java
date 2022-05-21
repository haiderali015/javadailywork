package com.example.javadailywork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class thirdA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ImageView img = (ImageView) findViewById(R.id.img1);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            int res_img = bundle.getInt("apple");
            img.setImageResource(res_img);
        }

        ImageView img2 = (ImageView) findViewById(R.id.img2);

        Bundle bundle2 = getIntent().getExtras();
        if(bundle2!=null)
        {
            int res_img = bundle2.getInt("banana");
            img2.setImageResource(res_img);
        }
        ImageView img3 = (ImageView) findViewById(R.id.img3);

        Bundle bundle3 = getIntent().getExtras();
        if(bundle3!=null)
        {
            int res_img = bundle.getInt("cat");
            img3.setImageResource(res_img);
        }
        ImageView img4 = (ImageView) findViewById(R.id.img4);

        Bundle bundle4 = getIntent().getExtras();
        if(bundle4!=null)
        {
            int res_img = bundle4.getInt("dog");
            img4.setImageResource(res_img);
        }
//        ImageView img = (ImageView) findViewById(R.id.img1);
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            int res_img = bundle.getInt("apple");
//            img.setImageResource(res_img);
//        }
//        ImageView img = (ImageView) findViewById(R.id.img1);
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            int res_img = bundle.getInt("apple");
//            img.setImageResource(res_img);
//        }
//        ImageView img = (ImageView) findViewById(R.id.img1);
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            int res_img = bundle.getInt("apple");
//            img.setImageResource(res_img);
//        }
//        ImageView img = (ImageView) findViewById(R.id.img1);
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            int res_img = bundle.getInt("apple");
//            img.setImageResource(res_img);
//        }
//        ImageView img = (ImageView) findViewById(R.id.img1);
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            int res_img = bundle.getInt("apple");
//            img.setImageResource(res_img);
//        }
//        ImageView img = (ImageView) findViewById(R.id.img1);
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            int res_img = bundle.getInt("apple");
//            img.setImageResource(res_img);
//        }ImageView img = (ImageView) findViewById(R.id.img1);
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            int res_img = bundle.getInt("apple");
//            img.setImageResource(res_img);
//        }ImageView img = (ImageView) findViewById(R.id.img1);
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            int res_img = bundle.getInt("apple");
//            img.setImageResource(res_img);
//        }
//        ImageView img = (ImageView) findViewById(R.id.img1);
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            int res_img = bundle.getInt("apple");
//            img.setImageResource(res_img);
//        }
//        ImageView img = (ImageView) findViewById(R.id.img1);
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            int res_img = bundle.getInt("apple");
//            img.setImageResource(res_img);
//        }
//        ImageView img = (ImageView) findViewById(R.id.img1);
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            int res_img = bundle.getInt("apple");
//            img.setImageResource(res_img);
//        }
//        ImageView img = (ImageView) findViewById(R.id.img1);
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            int res_img = bundle.getInt("apple");
//            img.setImageResource(res_img);
//        }
//        ImageView img = (ImageView) findViewById(R.id.img1);
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            int res_img = bundle.getInt("apple");
//            img.setImageResource(res_img);
//        }
//        ImageView img = (ImageView) findViewById(R.id.img1);
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            int res_img = bundle.getInt("apple");
//            img.setImageResource(res_img);
//        }
//        ImageView img = (ImageView) findViewById(R.id.img1);
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            int res_img = bundle.getInt("apple");
//            img.setImageResource(res_img);
//        }
//        ImageView img = (ImageView) findViewById(R.id.img1);
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            int res_img = bundle.getInt("apple");
//            img.setImageResource(res_img);
//        }
//





    }
}