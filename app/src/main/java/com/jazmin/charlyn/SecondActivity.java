package com.jazmin.charlyn;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("LIFECYCLE", "onCreate() has executed...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFECYCLE", "onStart() has executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFECYCLE", "onResume() has executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LIFECYCLE", "onPause() has executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFECYCLE", "onStop() has executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LIFECYCLE", "onRestart() has executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFECYCLE", "onDestroy() has executed");
    }

    public void process2(View v){
        Intent i=null, chooser=null;
        if(v.getId() == R.id.backbutton){
            i = new Intent (this, MainActivity.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.mapbtn){
            i= new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5570618, 121.0521884"));
            chooser = Intent.createChooser(i, "Choose Application For Maps");
            startActivity(chooser);
        }
    }
}