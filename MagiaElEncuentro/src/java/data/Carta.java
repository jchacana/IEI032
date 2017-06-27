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

    private static int idCont = 0;
    private int id;
    private String nombre;
    private int costo;
    private String ilustrador;
    private String edicion;
    private String descripcion;
    private boolean disponible = true;

    public Carta(String nombre, int costo, String ilustrador, String edicion, String descripcion) {
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
    public int getId() {
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
    private void setId() {
        Carta.idCont++;
        this.id = Carta.idCont;
    }
    
    public static void setId(int id) {
        Carta.idCont = id;
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

    /**
     * @return the disponible
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * @param disponible the disponible to set
     */
    public void setDisponible() {
        this.disponible = !disponible;
    }
    

}
