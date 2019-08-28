package com.tmreign.favoritefood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GridItem extends AppCompatActivity {

    @BindView(R.id.griddata)
    TextView griddata;
    @BindView(R.id.imageholder)
    ImageView imageholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image",0);

//        gridData.setText(receivedName);
//        imageView.setImageResource(receivedImage);
//        //enable back Button
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
