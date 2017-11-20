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
abstract class Builder {
    
    protected ZestawSniadaniowy zestawSniadaniowy;
    
    public void newZestaw() {
        zestawSniadaniowy = new ZestawSniadaniowy();
    }
    
    public ZestawSniadaniowy getZestaw() {
        return zestawSniadaniowy;
    }
    
    public abstract void buildFasola();
    public abstract void buildJajko();
    public abstract void buildChlyp();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Director kelnerzyna = new Director();
        Builder builder = new ZestawA();
        Builder builder2 = new ZestawB();
        
        kelnerzyna.setBuilder(builder);
        kelnerzyna.skladaj();
        ZestawSniadaniowy zestaw1 = kelnerzyna.getZestaw();
        
        zestaw1.show();
        
        kelnerzyna.setBuilder(builder2);
        kelnerzyna.skladaj();
        ZestawSniadaniowy zestaw2 = kelnerzyna.getZestaw();
        
        zestaw2.show();
    }
    
}
