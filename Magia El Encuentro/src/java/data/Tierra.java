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
public class Tierra extends Carta {

    private int mana;

    public Tierra(int mana, int id, String nombre, int costo, String ilustrador, String edicion, String descripcion) {
        super(id, nombre, costo, ilustrador, edicion, descripcion);
        this.mana = mana;
    }

    /**
     * @return the mana
     */
    public int getMana() {
        return mana;
    }

    /**
     * @param mana the mana to set
     */
    public void setMana(int mana) {
        this.mana = mana;
    }

}
