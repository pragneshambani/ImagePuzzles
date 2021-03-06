package com.example.sumit.animalplanet;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import Adapters.ColorViewAdapter;

public class ColorWorldActivity extends AppCompatActivity {

    ArrayList<ColorSchemes> colorSchemes = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_world);
        populateColorSchemes();
        setColorPickerView();
    }

    private void setColorPickerView(){
        mRecyclerView = (RecyclerView) findViewById(R.id.color_picker__view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(false);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new ColorViewAdapter(colorSchemes);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void populateColorSchemes(){
        colorSchemes.add(new ColorSchemes(0,0,0,"Black"));
        colorSchemes.add(new ColorSchemes(255,0,0,"Red"));
        colorSchemes.add(new ColorSchemes(0,255,0,"Green"));
        colorSchemes.add(new ColorSchemes(0,0,255,"Blue"));
        colorSchemes.add(new ColorSchemes(255, 255, 0, "Yellow"));
        colorSchemes.add(new ColorSchemes(255, 165, 0, "Orange"));
        colorSchemes.add(new ColorSchemes(165,42,42,"Brown"));//
        colorSchemes.add(new ColorSchemes(255,192,203,"Pink"));
        colorSchemes.add(new ColorSchemes(128, 0, 128, "Purple"));
    }


    /*public void changeMyColor(View view) {
        if(colorIndex == colorSchemes.size()) colorIndex = 0;
        int color = Color.argb(255, colorSchemes.get(colorIndex).red, colorSchemes.get(colorIndex).green, colorSchemes.get(colorIndex).blue);
        findViewById(R.id.startView).setBackgroundColor(color);
        ((TextView)findViewById(R.id.starColorName)).setText(colorSchemes.get(colorIndex).name);
        colorIndex++;


        int resID=getResources().getIdentifier(colorSchemes.get(colorIndex).name.toLowerCase(), "raw", getPackageName());
        MediaPlayer mediaPlayer=MediaPlayer.create(this, resID);
        mediaPlayer.start();
    }

    public void colorImage(View view) {
        int color = 0;
        for(int i=0; i< colorSchemes.size() ;i++){
            if(view.getTag().toString().equalsIgnoreCase(colorSchemes.get(i).name)){
                color = Color.argb(255, colorSchemes.get(i).red, colorSchemes.get(i).green, colorSchemes.get(i).blue);
            }
        }
        findViewById(R.id.startView).setBackgroundColor(color);
    }

    public void changeMyImage(View view) {
        switch (view.getTag().toString()){
            case "teddyBear":
                ((ImageView) findViewById(R.id.startView)).setImageResource(R.mipmap.teddy_bear);
                break;
            case "teddyBear2":
                ((ImageView) findViewById(R.id.startView)).setImageResource(R.mipmap.teddy_bear2);
                break;
            case "cycle":
                ((ImageView) findViewById(R.id.startView)).setImageResource(R.mipmap.cycle);
                break;
        }
    }*/
}
