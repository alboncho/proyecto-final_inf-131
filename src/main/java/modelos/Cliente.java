/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author alboncho
 */
public class Cliente {
   private String nombre;
   private String celular;
   private String ci;

   public Cliente() {
      this.nombre = "";
      this.celular = "";
      this.ci = "";
   }

   public Cliente(String nombre, String celular, String ci) {
      this.nombre = nombre;
      this.celular = celular;
      this.ci = ci;
   }

   public String getNombre() {
      return nombre;
   }

   public String getCelular() {
      return celular;
   }

   public String getCi() {
      return ci;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public void setCelular(String celular) {
      this.celular = celular;
   }

   public void setCi(String ci) {
      this.ci = ci;
   }

   @Override
   public String toString() {
      return "\nNombre: " + nombre
            + "\nCelular: " + celular
            + "\nC.I.: " + ci;
   }
}
