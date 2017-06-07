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
public class Carta {
    private int idCarta;
    private String nombre;
    private String ilustrador;
    private String edicion;
    private Hechizos hechizo;

    public Carta(int idCarta, String nombre, String ilustrador, String edicion, Hechizos hechizo) {
        this.idCarta = idCarta;
        this.nombre = nombre;
        this.ilustrador = ilustrador;
        this.edicion = edicion;
        this.hechizo = hechizo;
    }

    public int getIdCarta() {
        return idCarta;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIlustrador() {
        return ilustrador;
    }

    public void setIlustrador(String ilustrador) {
        this.ilustrador = ilustrador;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public Hechizos getHechizo() {
        return hechizo;
    }

    public void setHechizo(Hechizos hechizo) {
        this.hechizo = hechizo;
    }
    
}
