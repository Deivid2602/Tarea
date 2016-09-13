package com.example.deivi.actividad2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class principal extends AppCompatActivity {
    Button enviar2;
    TextView user;
    Intent inf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        user = (TextView) findViewById(R.id.textname);
        enviar2 =  (Button) findViewById(R.id.salir);
        enviar2.setOnClickListener(myHandler2);

        Bundle extras;
        inf = getIntent();
        extras = inf.getExtras();

        if (extras!=null){
            String newDato = (String)extras.get("Nombre");
            user.setText(newDato);
        }
    }
    View.OnClickListener myHandler2 = new View.OnClickListener(){
        public void onClick(View v){
            Intent atras;

             atras = new Intent(principal.this, Login.class);
            finish();
        }
    };
}
