package com.example.alertaemergencia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class cuentalogin extends AppCompatActivity {

    EditText email , contraseña;
    Button entrar;
    FirebaseAuth auth;
    DatabaseReference data ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuentalogin);

        email=findViewById(R.id.loemail);
        contraseña=findViewById(R.id.locontra);
        entrar=findViewById(R.id.bta_la);

        auth=FirebaseAuth.getInstance();
        data = FirebaseDatabase.getInstance().getReference();

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                login();

            }
        });

    }
    void login(){
        String ameil = email.getText().toString();
        String acontra=contraseña.getText().toString();

        if(!ameil.isEmpty()&&!acontra.isEmpty()){
            if(acontra.length()>6){
                auth.signInWithEmailAndPassword(ameil,acontra).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(cuentalogin.this, "Usuario confirmado", Toast.LENGTH_SHORT).show();


                        }
                        else{
                            Toast.makeText(cuentalogin.this, "La contraseña o email son incorrectos", Toast.LENGTH_SHORT).show();
                        }
                    }
                });




            }
        }

    }

}