/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author nowak_1105010
 */
public abstract class Nominal {
    public String name;
    private int count = 0;
    
    public int getCount(){
        return this.count;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setCount( int c ) {
        this.count += c;
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
