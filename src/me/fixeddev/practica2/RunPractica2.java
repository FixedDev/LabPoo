/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package me.fixeddev.practica2;

import java.net.Socket;

/**
 * @author BD-5
 */
public class RunPractica2 {

    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Avion avion = new Avion();

        avion.setCiArea("Viva");
        avion.setCombustible(100f);

        System.out.println(avion.encenderMotor());
        System.out.println("Compañia aerea: " + avion.getCiArea());
        System.out.println("Combustible restante: " + avion.getCombustible());

        avion.volar();

        System.out.println();

        Automovil automovil = new Automovil();
        automovil.setColor("Verde");
        automovil.setPuertas(4);
        automovil.setCombustible(52f);

        System.out.println(automovil.encenderMotor());
        System.out.println("Color: " + automovil.getColor());
        System.out.println("Combustible restante: " + automovil.getCombustible());

        automovil.avanzar();
    }
}
