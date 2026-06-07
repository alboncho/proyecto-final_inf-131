package Persistencia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import estructuras.PilaEntrega;
import java.io.*;
/**
 *
 * @author alboncho
 */
public class PersistenciaEntrega {
   private static final String NOMBRE = "datos/DatoEntrega.dat";
   
   public static void guardar(PilaEntrega pe) {
      try { 
         File archivo = new File(NOMBRE);
         File carpeta = archivo.getParentFile();
         
         if (carpeta != null && !carpeta.exists()) {
            carpeta.mkdirs();
         }
         
         ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream(archivo));
         
         save.writeObject(pe);
         save.close();
      } catch (IOException e) {
         System.err.println("❌ Error al guardar: " + e.getMessage());
      }
   }
   
   public static PilaEntrega cargar() {
      try {
         ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(NOMBRE));
         
         PilaEntrega pe = (PilaEntrega) archivo.readObject();
         archivo.close();
         
         return pe;
      } catch (Exception e) {
         System.err.println(e.getMessage());
      }
      
      return null;
   }
}
