/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author nowak_1105010
 */
public class Honda extends Car {
    public double price = 100000;
    
    public Honda() {
        car = "Hooonda";
    }
    
    public double price(){
        return price;
    }
}
