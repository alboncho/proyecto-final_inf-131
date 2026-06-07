/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.io.*;
import estructuras.MC_Encomienda;

/**
 *
 * @author alboncho
 */
public class PersistenciaEncomienda {
   private static final String NOMBRE = "datos/DatoEncomienda.dat";
   
   public static void guardar(MC_Encomienda ldb) {
      try { 
         File archivo = new File(NOMBRE);
         File carpeta = archivo.getParentFile();
         
         if (carpeta != null && !carpeta.exists()) {
            carpeta.mkdirs();
         }
         
         ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream(archivo));
         
         save.writeObject(ldb);
         save.close();
      } catch (IOException e) {
         System.err.println("❌ Error al guardar: " + e.getMessage());
      }
   }
   
   public static MC_Encomienda cargar() {
      try {
         ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(NOMBRE));
         
         MC_Encomienda me = (MC_Encomienda) archivo.readObject();
         archivo.close();
         
         return me;
      } catch (Exception e) {
         System.err.println(e.getMessage());
      }
      
      return null;
   }
}
