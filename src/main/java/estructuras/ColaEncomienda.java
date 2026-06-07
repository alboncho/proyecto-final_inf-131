/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import modelos.Encomienda;
import java.io.Serializable;

/**
 *
 * @author alboncho
 */
public class ColaEncomienda extends VectorEncomienda implements Serializable {
   private int fr, fi;
   
   public ColaEncomienda() {
      this.fr = -1;
      this.fi = -1;
   }
   
   public int nroElem() {
      if (this.esVacia()) {
         return 0;
      } else {
         return this.fi+1;
      }
   }
   
   public boolean esVacia() { return this.fr == this.fi; }
   
   public boolean esLlena() { return this.fi == this.MAX-1; }
   
   public void adi(Encomienda e) {
      if (!this.esLlena()) {
         this.fi++;
         this.v[this.fi] = e;
      } else {
         System.out.println("Cola llena");
      }
   }
   
   public Encomienda eli() {
      Encomienda x = null;
      
      if (!this.esVacia()) {
         this.fr++;
         x = this.v[this.fr];
      } else
         System.out.println("Cola vacia");
      
      return x;
   }
   
   public void vaciar(ColaEncomienda z) {
      while (!z.esVacia()) {
         this.adi(z.eli());
      }
   }
}
