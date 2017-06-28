/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import data.Carta;
import java.sql.Connection;

/**
 *
 * @author Mikka
 */
public interface Repository {
    
    public boolean addCarta(Carta carta);
            
    public boolean modifyCarta(Carta carta);

    public boolean deleteCarta(int id);
    
    public boolean addCollection();
    
    public boolean modifyCollection();
    
    public boolean deleteCollection();
}
