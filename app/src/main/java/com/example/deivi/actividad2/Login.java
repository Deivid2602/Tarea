package com.example.deivi.actividad2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    Button enviar;
    EditText nom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


            nom = (EditText) findViewById(R.id.tnom);
            enviar =  (Button) findViewById(R.id.iniciar);
            enviar.setOnClickListener(myHandler);
        }
        View.OnClickListener myHandler = new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(Login.this, principal.class);
                String auxnom=nom.getText().toString();
                i.putExtra("Nombre",auxnom);
                startActivity(i);
            }
        };
}
