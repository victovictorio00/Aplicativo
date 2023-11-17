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

public class loginvecino extends AppCompatActivity {
    FirebaseAuth auth1;
    DatabaseReference data1;

    Button aceptar;
    EditText email , contraseña,repcontraseña,nombre,apellidos,dni,telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginvecino);
        email=findViewById(R.id.emailveci);
        contraseña=findViewById(R.id.contraveci);
        repcontraseña=findViewById(R.id.recontraveci);
        nombre=findViewById(R.id.nombreveci);
        apellidos=findViewById(R.id.apellidosveci);
        dni=findViewById(R.id.dniveci);
        telefono=findViewById(R.id.telefonoveci);

        aceptar=findViewById(R.id.vecinoboton);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                registrovecino();

            }
        });
    }
    void registrovecino(){
        String emaisl=email.getText().toString();
        String contra=contraseña.getText().toString();
        String recontra=repcontraseña.getText().toString();
        String nombres=nombre.getText().toString();
        String apellido=apellidos.getText().toString();
        String DNI=dni.getText().toString();
        String Telefono=telefono.getText().toString();

        if(!emaisl.isEmpty()&&!contra.isEmpty()&&!recontra.isEmpty()&&!nombres.isEmpty()&&!apellido.isEmpty()&&DNI.isEmpty()&&Telefono.isEmpty()){
            if (contra.length()>6){

                auth1.createUserWithEmailAndPassword(emaisl,contra).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            
                        }

                    }
                });
                Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();

            }
        }
        else {
            Toast.makeText(this, "Porfavor asegurece de que las contraseñas considan y que halla llenado todos los datos", Toast.LENGTH_SHORT).show();
        }



    }

}