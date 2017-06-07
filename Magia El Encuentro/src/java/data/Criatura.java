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
public class Criatura extends Carta {

    private int ataque;
    private int resistencia;

    public Criatura(int ataque, int resistencia, int id, String nombre, int costo, String ilustrador, String edicion, String descripcion) {
        super(id, nombre, costo, ilustrador, edicion, descripcion);
        this.ataque = ataque;
        this.resistencia = resistencia;
    }

    /**
     * @return the ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * @return the resistencia
     */
    public int getResistencia() {
        return resistencia;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * @param resistencia the resistencia to set
     */
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

}
