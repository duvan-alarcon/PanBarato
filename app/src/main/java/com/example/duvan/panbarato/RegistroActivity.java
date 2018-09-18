package com.example.duvan.panbarato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {

    private EditText eCorreo, ePassword, eRepPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        eCorreo=findViewById(R.id.eCorreo);
        ePassword=findViewById(R.id.ePassword);
        eRepPassword=findViewById(R.id.eRepPassword);

    }

    public void registrarseClicked(View view) {

        //1. Verificar que los tres campos esten llenos
        //2. Verificar que las dos contrasenas sean iguales
        String mail, pass, repass;

        mail = eCorreo.getText().toString();
        pass = ePassword.getText().toString();
        repass = eRepPassword.getText().toString();

        if ( mail.equals("") || pass.equals("") || repass.equals("")  )
            Toast.makeText(getApplicationContext(),"Debe digitar todos los campos",Toast.LENGTH_SHORT).show();
            else
                if (pass.equals(repass)) {
                    Intent i = new Intent();
                    i.putExtra("correo", eCorreo.getText().toString());
                    i.putExtra("password", ePassword.getText().toString());
                    setResult(RESULT_OK, i);
                    finish();
                }else{
                    Toast.makeText(getApplicationContext(), "Las contrasenas no son iguales", Toast.LENGTH_SHORT).show();
                }

    }

}
