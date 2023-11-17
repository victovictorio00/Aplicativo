package com.example.alertaemergencia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pantalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
    }
    public void ingre2(View view){
        Intent lol = new Intent(this,Login.class);
        startActivity(lol);
    }
    public void ingre3(View view){
        Intent lel = new Intent(this,login2.class);
        startActivity(lel);
    }

}