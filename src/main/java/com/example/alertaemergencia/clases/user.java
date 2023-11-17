package com.example.alertaemergencia.clases;

public abstract class user {
    private String email;
    private String contraseña;
    private String nombre;
    private String apellidos;

    public user() {
    }
    public user(String email,String contraseña,String nombre,String apellidos){
        this.email=email;
        this.contraseña=contraseña;
        this.nombre=nombre;
        this.apellidos=apellidos;
}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
