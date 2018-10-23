package com.example.duvan.panbarato;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class PerfilActivity extends AppCompatActivity {
    private String correo, password;
    private EditText tcorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Bundle args = getIntent().getExtras();
        if (args !=null){
            correo = args.getString("correo");
            password = args.getString("password");

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //asignar el menu
        getMenuInflater().inflate(R.menu.menu2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //programar el menu
        int id= item.getItemId();


        if (id == R.id.mPrincipal){
            onBackPressed();

        }else {
            finish();

        }
        return super.onOptionsItemSelected(item);
    }


    public void mostrar(View view) {
        //correo = getString("correo");
        tcorreo.setText(correo);
        

    }
}


