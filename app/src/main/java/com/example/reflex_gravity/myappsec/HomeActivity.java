package com.example.reflex_gravity.myappsec;

import android.content.Intent;
import android.graphics.Typeface;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    EditText id,pwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //setContentView(R.layout.signup);
        id=(EditText)findViewById(R.id.idtxt);
        pwd=(EditText)findViewById(R.id.pwdtxt);

        TextView myTextView = (TextView) findViewById(R.id.logo);
        Typeface tf=Typeface.createFromAsset(getAssets(), "fonts/burdeles.ttf");
        myTextView.setTypeface(tf);
    }

    public void login(View view) {


       if(id.getText().toString().equals("joeljeevan") && pwd.getText().toString().equals("asd123"))
        {
            Intent intent=new Intent(getApplication(), SignUp.class);
            startActivity(intent);

        }
        else
        {
            Toast.makeText(this, "Incorrect Password", Toast.LENGTH_SHORT).show();
        }
    }

    public void register(View view)
    {
        Intent inten=new Intent(getApplicationContext(), SignUp.class);
        startActivity(inten);
    }

}
