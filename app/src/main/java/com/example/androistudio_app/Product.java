package com.example.androistudio_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Product extends AppCompatActivity {

    private ImageView imgBackListItem, imgOpenProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        imgBackListItem = (ImageView) findViewById(R.id.imgBackListItem);
        imgBackListItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    openListItem();
            }
        });

        imgOpenProfile = (ImageView) findViewById(R.id.imgOpenProfile);
        imgOpenProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    openProfile();
            }
        });
    }

    public void openListItem() {
        Intent intent = new Intent(this, ListItem.class);
        startActivity(intent);
    }

    public void openProfile(){
        Intent intent = new Intent(this, Profile.class );
        startActivity(intent);
    }
}