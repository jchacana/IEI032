/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenedor;

import Datos.*;
import java.util.ArrayList;

/**
 *
 * @author Mauri
 */
public class Mantenedor {
     private static ArrayList<Carta> cartas = new ArrayList<>();
    private static ArrayList<Hechizos> hechizos = new ArrayList<>();
    private static ArrayList<Jugador> jugadores = new ArrayList<>();
    private static ArrayList<Mazo> mazos = new ArrayList<>();
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public static ArrayList<Usuario> getUsuarios(){
        return usuarios;
    }
    public static void agregarUsuarios(Usuario usuario){
        usuarios.add(usuario);
     }
    
     public static void eliminarUsuario(Usuario usuario)throws Exception{
       if(usuarios.contains(usuario))
       {
           usuarios.remove(usuario);
       }
       else
       {
           throw new Exception("no hay Usuarios en la lista para eliminar");
       }
       
    }
    
    
     public static ArrayList<Carta> getCartas() {
        return cartas;
    }
     public static ArrayList<Hechizos> getHechizos() {
        return hechizos;
    }
      public static ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
     public static ArrayList<Mazo> getMazos() {
        return mazos;
    }
     public static void agregarCartas(Carta carta){
        cartas.add(carta);
     }
     public static void agregarHechizos(Hechizos hechizo){
        hechizos.add(hechizo);
     }
      public static void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
     }
     public static void agregarMazo(Mazo mazo){
        mazos.add(mazo);
     }
     
     public static void eliminarCarta(Carta carta)throws Exception{
       if(cartas.contains(carta))
       {
           cartas.remove(carta);
       }
       else
       {
           throw new Exception("no hay cartas en la lista para eliminar");
       }
       
    }
     public static void eliminarHechizo(Hechizos hechizo)throws Exception{
       if(hechizos.contains(hechizo))
       {
           hechizos.remove(hechizo);
       }
       else
       {
           throw new Exception("no hay hechizos en la lista para eliminar");
       }
       
    }
     public static void eliminarJugador(Jugador jugador)throws Exception{
       if(jugadores.contains(jugador))
       {
           jugadores.remove(jugador);
       }
       else
       {
           throw new Exception("no hay jugadores en la lista para eliminar");
       }
       
    }
    public static void eliminarMazo(Mazo mazo)throws Exception{
       if(mazos.contains(mazo))
       {
           mazos.remove(mazo);
       }
       else
       {
           throw new Exception("no hay mazos en la lista para eliminar");
       }
       
    }
    
    
}
