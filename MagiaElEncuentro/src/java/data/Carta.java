/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author migue
 */
public abstract class Carta  {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    private int id;
    private String nombre;
    private int costo;
    private String ilustrador;
    private String edicion;

    public Carta(String nombre, int costo, String ilustrador, String edicion) {
        this.nombre = nombre;
        this.costo = costo;
        this.ilustrador = ilustrador;
        this.edicion = edicion;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }
    /**
     * @return the costo
     */
    public int getCosto() {
        return costo;
    }
    /**
     * @return the ilustrador
     */
    public String getIlustrador() {
        return ilustrador;
    }
    /**
     * @return the edicion
     */
    public String getEdicion() {
        return edicion;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * @param ilustrador the ilustrador to set
     */
    public void setIlustrador(String ilustrador) {
        this.ilustrador = ilustrador;
    }

    /**
     * @param edicion the edicion to set
     */
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
}
