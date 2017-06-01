/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author marcelo
 */
public class Jugador {
    private String nombre;
    private int cantidadDeMana;
    private Mazo mazo;

    public Jugador(String nombre, int cantidadDeMana, Mazo mazo) {
        this.nombre = nombre;
        this.cantidadDeMana = cantidadDeMana;
        this.mazo = mazo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeMana() {
        return cantidadDeMana;
    }

    public void setCantidadDeMana(int cantidadDeMana) {
        this.cantidadDeMana = cantidadDeMana;
    }

    public Mazo getMazo() {
        return mazo;
    }

    public void setMazo(Mazo mazo) {
        this.mazo = mazo;
    }
    
    
}
