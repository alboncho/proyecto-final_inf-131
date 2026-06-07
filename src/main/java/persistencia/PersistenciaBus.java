/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import estructuras.LD_Bus;
import java.io.*;

/**
 *
 * @author alboncho
 */
public class PersistenciaBus {
   private static final String NOMBRE = "datos/DatoBus.dat";
   
   public static void guardar(LD_Bus ldb) {
      try { 
         File archivo = new File(NOMBRE);
         File carpeta = archivo.getParentFile();
         
         if (carpeta != null || !carpeta.exists()) {
            carpeta.mkdirs();
         }
         
         ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream(archivo));
         
         save.writeObject(ldb);
         save.close();
      } catch (IOException e) {
         System.err.println("❌ Error al guardar: " + e.getMessage());
      }
   }
   
   public static LD_Bus cargar() {
      try {
         ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(NOMBRE));
         
         LD_Bus ldb = (LD_Bus) archivo.readObject();
         archivo.close();
         
         return ldb;
      } catch (Exception e) {
         System.err.println(e.getMessage());
      }
      
      return null;
   }
}
