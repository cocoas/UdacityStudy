package com.orcs.udacitystudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static Toast mToast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pmBtn = (Button) findViewById(R.id.main_activity_popular_movies_btn);
        Button shBtn = (Button) findViewById(R.id.main_activity_stock_hawk_btn);
        Button bibBtn = (Button) findViewById(R.id.main_activity_build_it_bigger_btn);
        Button myamBtn = (Button) findViewById(R.id.main_activity_make_your_app_material);
        Button guBtn = (Button) findViewById(R.id.main_activity_go_ubiquitous_btn);
        Button capstoneBtn = (Button) findViewById(R.id.main_activity_capstone_btn);

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
                show(getString(R.string.PopularMovies));
                break;
            case R.id.main_activity_stock_hawk_btn:
                show(getString(R.string.StockHawk));
                break;
            case R.id.main_activity_build_it_bigger_btn:
                show(getString(R.string.BuildBigger));
                break;
            case R.id.main_activity_make_your_app_material:
                show(getString(R.string.MakeYourAPPMaterial));
                break;
            case R.id.main_activity_go_ubiquitous_btn:
                show(getString(R.string.GoQbiquitous));
                break;
            case R.id.main_activity_capstone_btn:
                show(getString(R.string.Capstone));
                break;
            default:
                break;

        }
    }

    private void show(String msg){
        if (mToast == null){
            mToast = Toast.makeText(this,msg,Toast.LENGTH_SHORT);
        }else {
            mToast.setText(msg);
        }
        mToast.show();
    }


}
