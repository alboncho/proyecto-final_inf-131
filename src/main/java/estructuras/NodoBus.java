/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import modelos.Bus;
import java.io.Serializable;
/**
 *
 * @author alboncho
 */
public class NodoBus implements Serializable {
   private Bus dato;
   private NodoBus ant;
   private NodoBus sig;
   
   public NodoBus() {
      this.ant = null;
      this.sig = null;
   }

   public Bus getDato() {
      return dato;
   }

   public void setDato(Bus dato) {
      this.dato = dato;
   }

   public NodoBus getAnt() {
      return ant;
   }

   public void setAnt(NodoBus ant) {
      this.ant = ant;
   }

   public NodoBus getSig() {
      return sig;
   }

   public void setSig(NodoBus sig) {
      this.sig = sig;
   }
}
