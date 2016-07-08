package com.orcs.udacitystudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button pmBtn;
    private Button shBtn;
    private Button bibBtn;
    private Button myamBtn;
    private Button guBtn;
    private Button capstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pmBtn = (Button) findViewById(R.id.main_activity_popular_movies_btn);
        shBtn = (Button) findViewById(R.id.main_activity_stock_hawk_btn);
        bibBtn = (Button) findViewById(R.id.main_activity_build_it_bigger_btn);
        myamBtn = (Button) findViewById(R.id.main_activity_make_your_app_material);
        guBtn = (Button) findViewById(R.id.main_activity_go_ubiquitous_btn);
        capstoneBtn = (Button) findViewById(R.id.main_activity_capstone_btn);

        pmBtn.setOnClickListener(this);
        shBtn.setOnClickListener(this);
        bibBtn.setOnClickListener(this);
        myamBtn.setOnClickListener(this);
        guBtn.setOnClickListener(this);
        capstoneBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_activity_popular_movies_btn:
                showToastPopularMovie();
                break;
            case R.id.main_activity_stock_hawk_btn:
                showToastPopularMovie();
                break;
            case R.id.main_activity_build_it_bigger_btn:
                showToastPopularMovie();
                break;
            case R.id.main_activity_make_your_app_material:
                showToastPopularMovie();
                break;
            case R.id.main_activity_go_ubiquitous_btn:
                showToastPopularMovie();
                break;
            case R.id.main_activity_capstone_btn:
                showToastPopularMovie();
                break;
            default:
                break;

        }
    }

    public void showToastPopularMovie() {
        Toast toast = Toast.makeText(getApplicationContext(), "Popular Movie Message", Toast.LENGTH_SHORT);
        toast.show();
    }


}
