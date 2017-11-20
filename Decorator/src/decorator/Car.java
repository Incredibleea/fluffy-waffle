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
abstract class Car {
    protected String car = "Just a car";
    protected double discount = 0;
    
    public String about() {
        return car;
    }
    
    public String getDiscount() {
        return String.valueOf(discount);
    }
    
    public abstract double price();
}
