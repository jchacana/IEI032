/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author marcelo
 */
public class Conjuro extends Carta{
    private String tipo;

    public Conjuro(String tipo, int id, String nombre, int costo, String ilustrador, String edicion, String descripcion) {
        super(id, nombre, costo, ilustrador, edicion, descripcion);
        this.tipo = tipo;
    }
    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
