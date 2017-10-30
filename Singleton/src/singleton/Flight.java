/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.Vector;

/**
 *
 * @author nowak_1105010
 */
public class Flight {
    private static Flight instance = null;
    
    private Flight() {
    }
    
    public static Flight getInstance() {
        if ( instance == null ) {
            instance = new Flight();
        }
        return instance;
    }
    
    public Vector<Client> passengerList = new Vector<Client>();
    
    public boolean reserveSeat(Client c) {
        if ( !passengerList.contains(c) ) {
          passengerList.add(c);
          return true;
        }
        else {
            System.out.println("Hehe " + c.name + " juz istnieje.");
            return false;
        }
    }
}