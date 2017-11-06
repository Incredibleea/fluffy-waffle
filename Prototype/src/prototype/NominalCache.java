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
public class NominalCache {
   private static Hashtable<String, Nominal> nMap 
           = new Hashtable<String, Nominal>();

   public static Nominal getNominal(String name) {
       Nominal cachedNominal = nMap.get(name);
       return (Nominal)cachedNominal.clone();
   }
   
   public static void loadCache() {
      Stowka stowka = new Stowka();
      nMap.put(stowka.getName(),stowka);

      Dyszka dyszka = new Dyszka();
      nMap.put(dyszka.getName(),dyszka);
   }
}
