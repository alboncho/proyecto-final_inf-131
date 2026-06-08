/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;
/**
 *
 * @author alboncho
 */
public class Entrega implements Serializable {
   private static final long serialVersionUID = 1L;
   
   private String codEntrega;
   private String fechaEntrega;
   private String encargado;
   private Encomienda encomienda;

   public Entrega() {
      this.codEntrega = "";
      this.fechaEntrega = "";
      this.encargado = "";
      this.encomienda = new Encomienda();
   }

   public Entrega(String codEntrega, String fechaEntrega, Encomienda encomienda) {
      this.codEntrega = codEntrega;
      this.fechaEntrega = fechaEntrega;
      this.encomienda = encomienda;
   }

   public String getCodEntrega() {
      return codEntrega;
   }

   public void setCodEntrega(String codEntrega) {
      this.codEntrega = codEntrega;
   }

   public String getFechaEntrega() {
      return fechaEntrega;
   }

   public void setFechaEntrega(String fechaEntrega) {
      this.fechaEntrega = fechaEntrega;
   }

   public String getEncargado() {
      return encargado;
   }

   public void setEncargado(String encargado) {
      this.encargado = encargado;
   }

   public Encomienda getEncomienda() {
      return encomienda;
   }

   public void setEncomienda(Encomienda encomienda) {
      this.encomienda = encomienda;
   }
   
   
}
