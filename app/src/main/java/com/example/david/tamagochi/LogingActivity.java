package com.example.david.tamagochi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class LogingActivity extends AppCompatActivity {
    EditText edpassword,edusuario;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loging);
    }


    public void registrarusuario (View view){

        Intent i=new Intent(getApplicationContext(),NuevoUsuario.class);
        startActivity(i);


    }



    public void logear (View view){

            Intent i=new Intent(getApplicationContext(),Menuprincipal.class);
            startActivity(i);
        }






}



