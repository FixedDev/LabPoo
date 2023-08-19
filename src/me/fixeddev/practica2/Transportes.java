package me.fixeddev.practica2;

public class Transportes {
    private float combustible;
    private int numPasajeros;

    public String encenderMotor() {
        return "Motor del transporte encendido";
    }

    public float getCombustible() {
        return combustible;
    }

    public void setCombustible(float combustible) {
        this.combustible = combustible;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
}
