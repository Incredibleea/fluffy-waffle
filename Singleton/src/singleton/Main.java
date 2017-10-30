/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author nowak_1105010
 */
public class Main {
    public static void main(String [] args) {
        Flight flightInstance = Flight.getInstance();
        Client r = new Client("Roman");
        Client k = new Client("Karyna");
        flightInstance.reserveSeat(r);
        flightInstance.reserveSeat(k);
        Flight.getInstance().reserveSeat(k);
    }
}
