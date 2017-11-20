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
abstract class Decorator extends Car {
    
    public abstract String about();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car c1 = new Honda();
        Car c2 = new Mazda();
        
        System.out.println("\nWithout extra features");
        System.out.println(c1.about() + " " + c1.price());
        System.out.println(c2.about() + " " + c2.price());
        
        c1 = new AlloyWheels(c1);
        c2 = new AlloyWheels(c2);
        
        System.out.println("\nWith alloy wheels");
        System.out.println(c1.about() + " " + c1.price());
        System.out.println(c2.about() + " " + c2.price());
    }
    
}
