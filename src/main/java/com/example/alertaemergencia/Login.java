package com.example.alertaemergencia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void ingre3(View view){
        Intent lil = new Intent(this,loginvecino.class);
        startActivity(lil
        );
    }
    public void ingre4(View view){
        Intent lil = new Intent(this, cuentalogin.class);
        startActivity(lil
        );
    }


}