/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fluffy_waffle_1;

/**
 *
 * @author nowak_1105010
 */

interface flightInterface {
    double calculateIncome();
}

class Plane
{
    double crewSalary = 4800.12;
    int litersPer100km = 380;
    int maxPassengersNo = 250;
    int crewNo = 10;
}

class Flight implements flightInterface {
    int passengersNo;
    int distance;
    int ticketPrice;
    Plane plane;
    
    @Override
    public double calculateIncome() {      
        return passengersNo * ticketPrice - calculateCosts();
    }
    
    private double calculateCosts() {
        return (distance / 100) * plane.litersPer100km * 4.69 + plane.crewNo * plane.crewSalary;
    }
    
    public Flight(int pN, int d, int tP) {
        plane = new Plane();
        passengersNo = pN;
        distance = d;
        ticketPrice = tP;
    }
}

public class Fluffy_waffle_1 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Flight flight = new Flight(120, 1000, 1000);
        System.out.println("Income: " + flight.calculateIncome());
    }
    
}
