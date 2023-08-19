package me.fixeddev.practica2;

public class Automovil extends Transportes {
    private String color;
    private int cantidadPuertas;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuertas() {
        return cantidadPuertas;
    }

    public void setPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public void avanzar() {
        System.out.println("El auto avanza");
    }

    @Override
    public String encenderMotor() {
        return "Motor del automovil encendido";
    }
}
