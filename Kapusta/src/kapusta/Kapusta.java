/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapusta;

/**
 *
 * @author nowak_1105010
 */
public class Kapusta {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();
        System.out.println("Java strawa " + calc.odejmij(6, 2));
        System.out.println("Java strawa " + calc.dodaj(4,5,6,7,898));
    }
    
}
