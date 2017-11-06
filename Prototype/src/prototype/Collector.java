/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.Vector;

/**
 * Kazda osoba ma poszczegolne nominaly
 * Zestawienie nominalow.
 * @author nowak_1105010
 */
public abstract class Collector implements Cloneable {
    public String name;
    protected String cementery;
    protected double money = 0;
    protected Vector<Nominal> nom;
    
    public String getName() {
        return this.name;
    }
    
    public void giveDatek( double piniondze, Nominal n[] ) {
        this.money += piniondze;
        for ( Nominal elem : n ) {
            this.nom.add(elem);
        }
    }
    
    public void setName( String name ) {
        this.name = name;
    }
    
    protected double getMoney() {
        return this.money;
    }
    
    public String getCementery() {
        return this.cementery;
    }
    
    public Object clone() {
      Object clone = null;
      try {
         clone = super.clone();
         
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      return clone;
   }
}
