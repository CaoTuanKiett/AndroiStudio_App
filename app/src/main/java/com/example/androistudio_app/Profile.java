package com.example.androistudio_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Profile extends AppCompatActivity {

    private Button button;
    private ImageView imageView;
    private ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imgView = (ImageView) findViewById(R.id.imgBackList);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListItem();
            }
        });

        imageView = (ImageView) findViewById(R.id.ImgTurn);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                turnMain();
            }
        });
    }

    public void openListItem() {
        Intent intent = new Intent(this, ListItem.class);
        startActivity(intent);
    }

    public void turnMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}