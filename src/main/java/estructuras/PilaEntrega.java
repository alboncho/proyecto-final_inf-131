/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import modelos.Entrega;
import java.io.Serializable;

/**
 *
 * @author alboncho
 */
public class PilaEntrega extends VectorEntrega implements Serializable {
   private static final long serialVersionUID = 1L;
   
   private int tope;
   
   public PilaEntrega() {
      this.tope = -1;
   }
   
   public boolean esVacia() {
      return this.tope == -1;
   }
   
   public boolean esLlena() {
      return this.tope == max-1;
   }
   
   public void adi(Entrega e) {
      if (!this.esLlena()) {
         this.tope++;
         this.v[this.tope] = e;
      }
   }
   
   public Entrega eli() {
      Entrega x = null;
      
      if (!this.esVacia()) {
         x = this.v[this.tope];
         this.tope--;
      }
      
      return x;
   }
   
   public void vaciar(PilaEntrega z) {
      while (!z.esVacia()) {
         this.adi(z.eli());
      }
   }
}
