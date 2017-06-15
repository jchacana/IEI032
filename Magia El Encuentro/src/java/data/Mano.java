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
public class Mano implements interfaces.Coleccion{
    private static int idDisponible = 0;
    private int idmazo;
    private ArrayList<Carta> cartas = new ArrayList<>();

    public Mano() {
        setIdmazo();
    }

    public Mano(int idmazo) {
        this.idmazo = idmazo;
        idDisponible = idmazo;
    }
    
    public int getIdmazo() {
        return idmazo;
    }

    public void setIdmazo() {
        idDisponible++;
        this.idmazo = idDisponible;
    }

    /**
     * @param cartas the cartas to set
     */
    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public ArrayList<Carta> getCollection() {
        return cartas;
    }

    @Override
    public boolean addCarta(Carta c) {
        return getCollection().add(c);
    }

    @Override
    public boolean removeCarta(Carta c) {
        return getCollection().remove(c);
    }

    @Override
    public boolean updateCollection(ArrayList<Carta> collection) {
        try{
            this.setCartas(collection);
            return true;
        }
        catch(Exception ex){
            return false;
        }
    }
    
    
}
