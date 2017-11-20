/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author nowak_1105010
 */
public class ZestawB extends Builder {
    
    public void buildJajko() {
        zestawSniadaniowy.setJajko(10);
    }
    public void buildFasola() {
        zestawSniadaniowy.setFasola(1000);
    }
    public void buildChlyp() {
        zestawSniadaniowy.setChlyp(22);
    }
}
