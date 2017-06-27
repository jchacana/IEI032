/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.util.ArrayList;
/**
 *
 * @author marcelo
 */
public class Mazo implements interfaces.Coleccion{
    private static int idDisponible = 0;
    private int idMazo;
    private ArrayList<Carta> cartas = new ArrayList<>();

    public Mazo() {
        setIdmazo();
    }

    public Mazo(int idmazo) {
        this.idMazo =  idmazo;
        idDisponible = idmazo;
    }
    
    public int getIdmazo() {
        return idMazo;
    }

    public void setIdmazo() {
        idDisponible++;
        this.idMazo = idDisponible;
    }    


    /**
     * @param cartas the cartas to set
     */
    private void setCartas(ArrayList<Carta> cartas) {
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
            setCartas(cartas);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }
   
    
}