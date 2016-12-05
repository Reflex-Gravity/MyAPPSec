package com.example.reflex_gravity.myappsec;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import java.io.*;

import android.widget.EditText;
import io.realm.Realm;
import io.realm.RealmConfiguration;




/**
 * Created by joelj on 12/4/2016.
 */

public class SignUp extends AppCompatActivity {
        public String uname,upwd,uid;
       EditText nametxt,pwdtxt,idtxt;



    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        Intent intent=getIntent();

        //Realm
        RealmConfiguration rc=new RealmConfiguration.Builder(this)
                .name(Realm.DEFAULT_REALM_NAME)
                .schemaVersion(0)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(rc);
            //input values from ui
            nametxt=(EditText) findViewById(R.id.nametxt);
            idtxt=(EditText) findViewById(R.id.idtxt);
            pwdtxt=(EditText) findViewById(R.id.pwdtxt);

    }






    public void enterdet(View view, String uid, String uname, String upwd)
    {


        uname=nametxt.getText().toString();
        uid=idtxt.getText().toString();
        upwd=pwdtxt.getText().toString();



    }
}
