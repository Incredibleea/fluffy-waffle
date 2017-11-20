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
public class Director {
    private Builder builder;
    
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    
    public ZestawSniadaniowy getZestaw() {
        return builder.getZestaw();
    }
    
    public void skladaj() {
        builder.newZestaw();
        builder.buildChlyp();
        builder.buildFasola();
        builder.buildJajko();
    }
}
