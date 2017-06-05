package com.edwardtorpy.modifybackbutton;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void secondActivity (View view) {
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

        startActivity(intent);

        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        //Toast.makeText(this, "It works!", Toast.LENGTH_SHORT).show();
        finish();
        System.exit(0);
    }
}
