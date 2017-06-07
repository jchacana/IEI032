/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author mikka
 */
public abstract class Carta {

    private static int id = 0;
    private String nombre;
    private int costo;
    private String ilustrador;
    private String edicion;
    private String descripcion;

    public Carta(int id, String nombre, int costo, String ilustrador, String edicion, String descripcion) {
        setId();
        setNombre(nombre);
        setCosto(costo);
        setIlustrador(ilustrador);
        setEdicion(edicion);
        setDescripcion(descripcion);
    }
    
    /**
     * @return the id
     */
    public static int getId() {
        return id;
    }

    /**
     * @return the nombre
     */
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     */
    public void setId() {
        Carta.id = this.getId() + 1;
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

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
