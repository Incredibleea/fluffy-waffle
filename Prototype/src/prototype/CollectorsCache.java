/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.Hashtable;

/**
 *
 * @author nowak_1105010
 */
public class CollectorsCache {
   private static Hashtable<String, Collector> collectorsMap 
           = new Hashtable<String, Collector>();

   public static Collector getCollector(String cementery) {
       Collector cachedCollector = collectorsMap.get(cementery);
       return (Collector)cachedCollector.clone();
   }
   
   public static void loadCache() {
      Rakowicki rakowicki = new Rakowicki();
      collectorsMap.put("rakowicki",rakowicki);

      Salwatorski salwatorski = new Salwatorski();
      collectorsMap.put("salwatorski",salwatorski);
   }
}
