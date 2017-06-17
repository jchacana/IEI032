/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.ArrayList;

/**
 *
 * @author Nelson Lastra
 */
public class Mazo {
    
    //que quede claro que esta clase debe colaborar con carta
    private int idMazo;
    private String tipoMazo;
    private int cantidadCartas;
    private  ArrayList<Carta> arregloCartas = new ArrayList<>();
    //falta hacer el atributo carta y debe ser una coleccion con maximo 60 y condicionantes de restriccion
    public Mazo(int idMazo,String tipoMazo,int cantidadcartas){
        setIdMazo(idMazo);
        setTipoMazo(tipoMazo);
        setCantidadCartas(cantidadCartas);
    }

    public int getIdMazo() {
        return idMazo;
    }

    public String getTipoMazo() {
        return tipoMazo;
    }

    public int getCantidadCartas() {
        return cantidadCartas;
    }
    
    public ArrayList<Carta> getArregloCartas() {
        return arregloCartas;
    }

    public void setIdMazo(int idMazo) {
        this.idMazo = idMazo;
    }

    public void setTipoMazo(String tipoMazo) {
        this.tipoMazo = tipoMazo;
    }

    public void setCantidadCartas(int cantidadCartas) {
        this.cantidadCartas = cantidadCartas;
    }

    @Override
    public String toString() {
        return "Mazo{" + "idMazo=" + idMazo + ", tipoMazo=" + tipoMazo + ", cantidadCartas=" + cantidadCartas + '}';
    }
    
    
}
