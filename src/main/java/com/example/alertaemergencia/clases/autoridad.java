package com.example.alertaemergencia.clases;

public class autoridad extends user {
    private String cargo;
    private String carnetpolicial;

    public autoridad(String email, String contraseña, String nombre, String apellidos, String cargo,String carnetpolicial) {
        super(email, contraseña, nombre, apellidos);
        this.cargo = cargo;
        this.carnetpolicial=carnetpolicial;

    }

    public autoridad() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCarnetpolicial() {
        return carnetpolicial;
    }

    public void setCarnetpolicial(String carnetpolicial) {
        this.carnetpolicial = carnetpolicial;
    }

}
