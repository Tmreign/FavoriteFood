package com.tmreign.favoritefood;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.mealsButton)
    Button mealsButton;
    @BindView(R.id.appNameTextView)
    TextView mAppNameTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mealsButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == mealsButton) {

            Intent intent = new Intent(MainActivity.this, Category.class);

            startActivity(intent);
        }
    }



}
