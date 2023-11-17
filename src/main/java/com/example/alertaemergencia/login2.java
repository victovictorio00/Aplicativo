package com.example.alertaemergencia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }
    public void ingre42(View view){
        Intent lil = new Intent(this, cuentalogin.class);
        startActivity(lil
        );
    }
    public void ingre43(View view){
        Intent lel = new Intent(this, autoridadlogin.class);
        startActivity(lel
        );
    }
}