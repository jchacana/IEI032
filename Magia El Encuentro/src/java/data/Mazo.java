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
public class Mazo {
    private int idmazo;
    private int cantidad;
    private String nomnbre;
    private Carta carta;

    public Mazo(int idmazo, int cantidad, String nomnbre, Carta carta) {
        this.idmazo = idmazo;
        this.cantidad = cantidad;
        this.nomnbre = nomnbre;
        this.carta = carta;
    }

    public int getIdmazo() {
        return idmazo;
    }

    public void setIdmazo(int idmazo) {
        this.idmazo = idmazo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNomnbre() {
        return nomnbre;
    }

    public void setNomnbre(String nomnbre) {
        this.nomnbre = nomnbre;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }
 
    
}
