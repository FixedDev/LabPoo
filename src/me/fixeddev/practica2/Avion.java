package me.fixeddev.practica2;

public class Avion extends Transportes {

    private String ciArea;

    public void volar() {
        System.out.println("Avion volando");
    }

    public String getCiArea() {
        return ciArea;
    }

    public void setCiArea(String ciArea) {
        this.ciArea = ciArea;
    }

    @Override
    public String encenderMotor() {
        return "Motor del avion encendido";
    }
}
