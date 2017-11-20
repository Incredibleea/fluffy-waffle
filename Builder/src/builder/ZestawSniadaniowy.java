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
public class ZestawSniadaniowy {
    private Integer jajko;
    private Integer fasola;
    private Integer chlyp;
    
    public void setJajko(Integer jajko) {
        this.jajko = jajko;
    }
    public void setFasola(Integer fasola) {
        this.fasola = fasola;
    }
    public void setChlyp(Integer chlyp) {
        this.chlyp = chlyp;
    }
    
    public void show() {
        System.out.println("Złożono zestaw sniadaniowy składający się " +
        "z nastepujących składników:\n" +
        fasola + " gram fasoli\n" +
        jajko + " szt. jajek\n" +
        chlyp + " kromki chleba\n.");
    }


}
