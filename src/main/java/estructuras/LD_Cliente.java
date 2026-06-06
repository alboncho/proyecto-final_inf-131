/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;
import modelos.Cliente;
/**
 *
 * @author alboncho
 */
public class LD_Cliente {   
   private NodoCliente P;
   
   public LD_Cliente() {
      this.P = null;
   }
   
   public boolean esVacia() {
      return this.P == null;
   }
   
   public int nroNodos() {
      int c = 0;
      
      NodoCliente R = this.P;
      
      while (R.getSig() != null) {
         c++;
         R = R.getSig();
      }
      
      return c;
   }
   
   public void adiPrincipio(Cliente c) {
      NodoCliente nuevo = new NodoCliente();
      nuevo.setDato(c);
      
      nuevo.setSig(this.P);
      this.P.setAnt(nuevo);
      this.P = nuevo;
   }
   
   public void adiFinal(Cliente c) {
      NodoCliente nuevo = new NodoCliente();
      nuevo.setDato(c);
      
      if (this.esVacia()) {
         this.P = nuevo;
      } else {
         NodoCliente R = this.P;
         
         while (R.getSig() != null) {  
            R = R.getSig();
         }
         
         R.setSig(nuevo);
         nuevo.setAnt(R);
      }
   }
   
   public NodoCliente eliPrincipio() {
      NodoCliente x = new NodoCliente();
      
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
   
   public NodoCliente eliFinal() {
      NodoCliente x = new NodoCliente();
      
      if (!this.esVacia()) {
         if (this.nroNodos() == 1) {
            x = this.P;
            this.P = null;
         } else {
            NodoCliente R = this.P;
            
            while (R.getSig() != this.P) {
               R = R.getSig();
            }
            
            x = R;
            NodoCliente aux = R.getAnt();
            aux.setSig(null);
            x.setAnt(null);
         }
      }
      
      return x;
   }
   
   public Cliente buscar(String ci) {
      Cliente c = new Cliente();
      
      NodoCliente R = this.P;
      while (R.getSig() != null) {
         if (R.getDato().getCi().equals(ci)) 
            return R.getDato();
         
         R = R.getSig();
      }
      
      return c;
   }
}
