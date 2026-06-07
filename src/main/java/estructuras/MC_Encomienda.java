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
public class MC_Encomienda implements Serializable {
   private static final long serialVersionUID = 1L;
   
   private int n;
   private ColaEncomienda[] A;
   private String[] destinos;
   
   public MC_Encomienda(String[] destinos) {
      this.n = destinos.length;
      A = new ColaEncomienda[this.n];
      
      for (int i=0; i<n; i++) {
         A[i] = new ColaEncomienda();
      }
      
      this.destinos = destinos;
   }

   public String[] getDestinos() {
      return destinos;
   }

   public void setDestinos(String[] destinos) {
      this.destinos = destinos;
   }
   
   public int nroElem(int i) {
      return A[i].nroElem();
   }
   
   public boolean esVacia(int i) { return A[i].esVacia(); }
   
   public boolean esLlena(int i) { return A[i].esLlena(); }
   
   public void adicionar(int i, Encomienda e) { A[i].adi(e); }

   public ColaEncomienda[] getA() {
      return A;
   }

   public void setA(ColaEncomienda[] A) {
      this.A = A;
   }
   
   public Encomienda eliminar(int i) { return A[i].eli(); }
   
   public void vaciar(int i, ColaEncomienda z) { A[i].vaciar(z); }
   
   public void vaciar(int i, int j) { A[i].vaciar(A[j]); }
   
   public int getN() { return    this.n; }
   
   public void setN(int n) { this.n = n; }
   
   public int indiceDestino(String destino) {
      for (int i = 0; i < n; i++) {
         if (destinos[i].equalsIgnoreCase(destino)) return i;
      }
      
      return -1;
   }
   
}
