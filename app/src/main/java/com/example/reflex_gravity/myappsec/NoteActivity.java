package com.example.reflex_gravity.myappsec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        Intent intent=getIntent();
        //String msg=intent.getStringExtra(HomeActivity.EXTRA_MESSAGE);

    }
}
