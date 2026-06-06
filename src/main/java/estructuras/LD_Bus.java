/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;
import modelos.Bus;

/**
 *
 * @author alboncho
 */
public class LD_Bus {
   private NodoBus P;
   
   public LD_Bus() {
      this.P = null;
   }
   
   public boolean esVacia() {
      return this.P == null;
   }
   
   public int nroNodos() {
      int c = 0;
      
      NodoBus R = new NodoBus();
      
      while (R.getSig() != null) {
         c++;
         R = R.getSig();
      }
      
      return c;
   }
   
   public void adiPrincipio(Bus b) {
      NodoBus nuevo = new NodoBus();
      nuevo.setDato(b);
      
      nuevo.setSig(this.P);
      this.P.setAnt(nuevo);
      this.P = nuevo;
   }
   
   public void adFinal(Bus b) {
      NodoBus nuevo = new NodoBus();
      nuevo.setDato(b);
      
      if (this.esVacia()) {
         this.P = nuevo;
      } else {
         NodoBus R = this.P;
         
         while (R.getSig() != null) {
            R = R.getSig();
         }
         
         R.setSig(nuevo);
         nuevo.setAnt(R);
      }
   }
   
   public NodoBus eliPrincipio() {
      NodoBus x = new NodoBus();
      
      if (!this.esVacia()) {
         if (this.nroNodos() == 1) {
            x = this.P;
            this.P = null;
         } else {
            x = this.P;
            this.P = this.P.getSig();
            this.P.setAnt(null);
            x.setSig(null);
         }
      }
      
      return x;
   }
   
   public NodoBus eliFinal() {
      NodoBus x = new NodoBus();
      
      if (!this.esVacia()) {
         if (this.nroNodos() == 1) {
            x = this.P;
            this.P = null;
         } else {
            NodoBus R = this.P;
            
            while (R.getSig() != null) {
               R = R.getSig();
            }
            
            x = R;
            NodoBus aux = R.getAnt();
            aux.setSig(null);
            x.setAnt(null);
         }
      }
      
      return x;
   }
   
   public Bus buscar(String placa) {
      Bus b = new Bus();
      
      NodoBus R = this.P;
      
      while (R.getSig() != null) {
         if (R.getDato().getPlaca().equals(placa)) 
            return R.getDato();
         R = R.getSig();
      }
      
      return b;
   }
   
   public Bus buscarDestino(String destino) {
      Bus b = new Bus();
      
      NodoBus R = this.P;
      
      while (R.getSig() != null) {
         if (R.getDato().getDestino().equals(destino)) 
            return R.getDato();
         R = R.getSig();
      }
      
      return b;
   }
}
