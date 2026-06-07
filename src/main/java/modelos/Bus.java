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
public class Bus implements Serializable {
   private String placa;
   private String empresa;
   private String destino;
   private String horaSalida;
   private double capacidadCarga;
   private boolean disponible;
   
   public Bus() {
      this.placa = "";
      this.empresa = "";
      this.destino = "";
      this.horaSalida = "";
      this.capacidadCarga = 0;
      this.disponible = false;
   }

   public Bus(String placa, String empresa, String destino, String horaSalida, double capacidadCarga, boolean disponible)     {
      this.placa = placa;
      this.empresa = empresa;
      this.destino = destino;
      this.horaSalida = horaSalida;
      this.capacidadCarga = capacidadCarga;
      this.disponible = disponible;
   }

   public double getCapacidadCarga() {
      return capacidadCarga;
   }

   public void setCapacidadCarga(double capacidadCarga) {
      this.capacidadCarga = capacidadCarga;
   }

   public String getPlaca() {
      return placa;
   }

   public void setPlaca(String placa) {
      this.placa = placa;
   }

   public String getEmpresa() {
      return empresa;
   }

   public void setEmpresa(String empresa) {
      this.empresa = empresa;
   }

   public String getDestino() {  
      return destino;
   }

   public void setDestino(String destino) {
      this.destino = destino;
   }

   public String getHoraSalida() {
      return horaSalida;
   }

   public void setHoraSalida(String horaSalida) {
      this.horaSalida = horaSalida;
   }

   public boolean isDisponible() {
      return disponible;
   }

   public void setDisponible(boolean disponible) {
      this.disponible = disponible;
   }

   @Override
   public String toString() {
      return "\nPlaca: " + placa + "\nEmpresa: " + empresa + "\nDestino: " + destino + "\nHora de salida:" + horaSalida + "\nCapacidad (kg):" + capacidadCarga + "\nDisponible:" + disponible;
   }
}
