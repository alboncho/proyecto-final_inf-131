/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.*;
import java.util.ArrayList;
import modelos.Encomienda;

/**
 *
 * @author alboncho
 */
public class PersistenciaEncomienda {
   private static final String NOMBRE = "datos/DatosEncomienda.dat";
   
   public static void guardar(ArrayList<Encomienda> lista) {
      try {
         File archivo = new File(NOMBRE);
         File carpeta = archivo.getParentFile();
         
         if (!carpeta.exists()) {
            carpeta.mkdirs();
         }
         
         ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream(archivo));
         
         save.writeObject(lista);
         save.close();
      } catch (IOException er) {
         er.printStackTrace();
      }
   }
      
   public static ArrayList<Encomienda> cargar() {
      try {
         ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(NOMBRE));
         
         ArrayList<Encomienda> lista = (ArrayList<Encomienda>) archivo.readObject();
         archivo.close();
         
         return lista;
      } catch (Exception e) {
         System.err.println(e.getMessage());
      }
      
      return new ArrayList<Encomienda>();
   }
}
