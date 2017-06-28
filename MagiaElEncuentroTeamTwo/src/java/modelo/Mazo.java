
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Cristóbal
 */
public class Mazo {
    private int idMazo;
    private String tipoMazo;
    private int cantidadCartas;
    private  ArrayList<Carta> arregloCartas = new ArrayList<>();
    
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
