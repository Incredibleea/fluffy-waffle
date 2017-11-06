/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.Vector;

/**
 *
 * @author nowak_1105010
 */
public class Collectors {
    public static void main (String[] args) {
      CollectorsCache.loadCache();
      
      Vector<Collector> rakowickieZiomki = new Vector<Collector>();
      Vector<Collector> salwatorskieZiomki = new Vector<Collector>();

      Collector clonedCollectorR1 = (Collector) CollectorsCache.getCollector("rakowicki");
      clonedCollectorR1.setName("Stanislaw Soplica");
      rakowickieZiomki.add(clonedCollectorR1);
      System.out.println("CollectorR1 : " + clonedCollectorR1.getName());
      
      Collector clonedCollectorR2 = (Collector) CollectorsCache.getCollector("rakowicki");
      clonedCollectorR2.setName("Maciej Boryna");
      rakowickieZiomki.add(clonedCollectorR2);
      System.out.println("CollectorR2 : " + clonedCollectorR2.getName());	

      Collector clonedCollectorS1 = (Collector) CollectorsCache.getCollector("salwatorski");
      clonedCollectorS1.setName("Pies ktory jezdzil koleja");
      salwatorskieZiomki.add(clonedCollectorS1);
      System.out.println("CollectorS1 : " + clonedCollectorS1.getName());
      
      Collector clonedCollectorS2 = (Collector) CollectorsCache.getCollector("salwatorski");
      clonedCollectorS2.setName("Stanislaw Wokulski");
      salwatorskieZiomki.add(clonedCollectorS2);
      System.out.println("CollectorS2 : " + clonedCollectorS2.getName());
      
      rakowickieZiomki.elementAt(0).giveDatek(7,[(Dyszka) NominalCache.getNominal("10")]);
      rakowickieZiomki.elementAt(1).giveDatek(17.6);
      
      salwatorskieZiomki.elementAt(0).giveDatek(1500);
      salwatorskieZiomki.elementAt(1).giveDatek(15.88);
      
      double rakowickiSuma = 0;
      double salwatorskiSuma = 0;
      
      for( Collector elem : rakowickieZiomki ) {
          rakowickiSuma += elem.getMoney();
      }
      for( Collector elem : salwatorskieZiomki ) {
          salwatorskiSuma += elem.getMoney();
      }
      
      System.out.println("\nNa Rakowickim była ściepa i zebrano: " +
              + rakowickiSuma + "zł. polskich.");
      System.out.println("Na Salwatorskim też była ściepa i zebrano: " +
              salwatorskiSuma + "zł. polskich.");
   }
}