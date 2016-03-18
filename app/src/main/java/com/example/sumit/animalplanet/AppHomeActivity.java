package com.example.sumit.animalplanet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class AppHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_home);
    }

    public void onCWButtonTap(View view) {
        Intent intent = new Intent(this, ColorWorldActivity.class);
        startActivity(intent);
    }

    public void onAPButtonTap(View view) {
        Intent intent = new Intent(this, Wish.class);
        startActivity(intent);

    }

    public void showSettings(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}
