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
public class AlloyWheels extends Decorator{
    Car car;
    
    public AlloyWheels(Car car) {
        this.car = car;
        car.discount ++;
    }
    
    public String about() {
        return car.about() + " + alloy wheels + " + car.getDiscount() + "% discount:";
    }
    
    public double price() {
        if(car instanceof Honda) {
            return car.price() + 5000;
        }
        else if(car instanceof Mazda) {
            return car.price() + 6000;
        }
        return 0.;
    }
}
