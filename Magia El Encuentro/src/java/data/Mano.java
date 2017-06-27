/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author Mikka
 */
public class Mano {
    private int idmazo;
    private ArrayList<Carta> cartas = new ArrayList<>();

    public Mazo(int idmazo, ArrayList cartas) {
        setIdmazo(idmazo);
        setCartas(cartas);
    }

    public int getIdmazo() {
        return idmazo;
    }

    public void setIdmazo(int idmazo) {
        this.idmazo = idmazo;
    }    

    /**
     * @return the cartas
     */
    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    /**
     * @param cartas the cartas to set
     */
    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
}
