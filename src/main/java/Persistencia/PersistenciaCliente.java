package Persistencia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import estructuras.LD_Cliente;
/**
 *
 * @author alboncho
 */
public class PersistenciaCliente {
   private static final String NOMBRE = "DatoCliente.dat";
   
   public static void guardar(LD_Cliente ldc) {
      try { 
         ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream(NOMBRE));
         
         archivo.writeObject(ldc);
         archivo.close();
      } catch (IOException e) {
         System.err.println("❌ Error al guardar: " + e.getMessage());
      }
   }
   
   public static LD_Cliente cargar() {
      try {
         ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(NOMBRE));
         
         LD_Cliente ldc = (LD_Cliente) archivo.readObject();
         archivo.close();
         
         return ldc;
      } catch (Exception e) {
         System.err.println(e.getMessage());
      }
      
      return null;
   }
}
