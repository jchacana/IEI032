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
public abstract class Coleccion {

    private static int availableId = 0;
    private int id;
    private String type;
    private ArrayList<Carta> collection = new ArrayList<>();

    public Coleccion(String type) {
        setType(type);
        setId();
    }

    public Coleccion(Coleccion co) {
        setType(co.getType());
        updateCollection(co.getCollection());
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the tipo
     */
    public String getType() {
        return type;
    }

    /**
     * @return the collection
     */
    public ArrayList<Carta> getCollection() {
        return collection;
    }

    /**
     * @param id the id to set
     */
    public void setId() {
        availableId++;
        this.id = availableId;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setType(String tipo) {
        this.type = type;
    }

    /**
     * @param collection the collection to set
     */
    public void setCollection(ArrayList<Carta> collection) {
        this.collection = collection;
    }


    private boolean addCard(Carta c) {
        return getCollection().add(c);
    }

    public boolean removeCard(Carta c) {
        return getCollection().remove(c);
    }

    public boolean updateCollection(ArrayList<Carta> collection) {
        try {
            setCollection(collection);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
