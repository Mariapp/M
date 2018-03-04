package com.example.david.tamagochi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NuevoUsuario extends AppCompatActivity {
    EditText ednuevousuario, ednuevapassword, ednuevoemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_usuario2);
    }
    public void logear(View view) {



        Intent i = new Intent(getApplicationContext(), Menuprincipal.class);
        startActivity(i);


    }
}
