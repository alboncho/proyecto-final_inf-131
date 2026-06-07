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
public class Encomienda implements Serializable {
   private String codigo;
   private String descripcion;
   private double peso;
   private String destino;
   private String estado;
   private String fechaRegistro;
   private Cliente remitente;
   private Cliente destinatario;
   private Bus busAsignado;

   public Encomienda() {
      this.codigo = "";
      this.descripcion = "";
      this.peso = 0;
      this.destino = "";
      this.estado = "";
      this.fechaRegistro = "";
      this.remitente = null;
      this.destinatario = null;
      this.busAsignado = null;
   }

   public Encomienda(String codigo, String descripcion, double peso,
                     String destino, String estado, String fechaRegistro,
                     Cliente remitente, Cliente destinatario) {
      this.codigo = codigo;
      this.descripcion = descripcion;
      this.peso = peso;
      this.destino = destino;
      this.estado = estado;
      this.fechaRegistro = fechaRegistro;
      this.remitente = remitente;
      this.destinatario = destinatario;
   }

   // Getters
   public String getCodigo() {
      return codigo;
   }

   public String getDescripcion() {
      return descripcion;
   }

   public double getPeso() {
      return peso;
   }

   public String getDestino() {
      return destino;
   }

   public String getEstado() {
      return estado;
   }

   public String getFechaRegistro() {
      return fechaRegistro;
   }

   public Cliente getRemitente() {
      return remitente;
   }

   public Cliente getDestinatario() {
      return destinatario;
   }

   public Bus getBusAsignado() {
      return busAsignado;
   }

   // Setters
   public void setCodigo(String codigo) {
      this.codigo = codigo;
   }

   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }

   public void setPeso(double peso) {
      this.peso = peso;
   }

   public void setDestino(String destino) {
      this.destino = destino;
   }

   public void setEstado(String estado) {
      this.estado = estado;
   }

   public void setFechaRegistro(String fechaRegistro) {
      this.fechaRegistro = fechaRegistro;
   }

   public void setRemitente(Cliente remitente) {
      this.remitente = remitente;
   }

   public void setDestinatario(Cliente destinatario) {
      this.destinatario = destinatario;
   }

   public void setBusAsignado(Bus busAsignado) {
      this.busAsignado = busAsignado;
   }

   @Override
   public String toString() {
      return "\nCódigo: " + codigo
            + "\nDescripción: " + descripcion
            + "\nPeso: " + peso
            + "\nDestino: " + destino
            + "\nEstado: " + estado
            + "\nFecha de registro: " + fechaRegistro;
   }
}
