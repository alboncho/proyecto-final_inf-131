/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import modelos.Cliente;
import java.io.Serializable;

/**
 *
 * @author alboncho
 */
public class NodoCliente implements Serializable {
   private static final long serialVersionUID = 1L;
   
   private Cliente dato;
   private NodoCliente sig;
   private NodoCliente ant;
   
   public NodoCliente() {
      this.sig = null;
      this.ant = null;
   }

   public Cliente getDato() {
      return dato;
   }

   public void setDato(Cliente dato) {
      this.dato = dato;
   }

   public NodoCliente getSig() {
      return sig;
   }

   public void setSig(NodoCliente sig) {
      this.sig = sig;
   }

   public NodoCliente getAnt() {
      return ant;
   }

   public void setAnt(NodoCliente ant) {
      this.ant = ant;
   }
}
