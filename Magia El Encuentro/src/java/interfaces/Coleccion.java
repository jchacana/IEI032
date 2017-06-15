/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import data.Carta;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Mikka
 */
public interface Coleccion {
    
    public ArrayList<Carta> getCollection();
    
    public boolean addCarta(Carta c);
    
    public boolean removeCarta(Carta c);
    
    public boolean updateCollection(ArrayList<Carta> collection);
}
