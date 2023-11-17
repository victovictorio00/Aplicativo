package com.example.alertaemergencia.clases;

public class vecino extends user {
   private String dni;
    private String telefono;

    public vecino(String email, String contraseña, String nombre, String apellidos, String dni,String telefono) {
        super(email, contraseña, nombre, apellidos);
        this.dni = dni;
        this.telefono=telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
