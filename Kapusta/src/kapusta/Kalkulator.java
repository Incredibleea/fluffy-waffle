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
public class Kalkulator {
    public int dodaj(Integer... args) {
        int sum = 0;
        for (Integer arg : args) {
            sum += arg;
        }
        return sum;
    }
    public int odejmij(int a, int b) {
        return a - b;
    }
    public int pomnoz(int a, int b) {
        return a * b;
    }
}
