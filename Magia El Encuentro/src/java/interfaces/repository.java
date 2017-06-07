/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import data.Carta;

/**
 *
 * @author migue
 */
public interface repository {
    public boolean add(Carta carta);
    
    public boolean modify(int id);
    
    public boolean delete(int id);
}
