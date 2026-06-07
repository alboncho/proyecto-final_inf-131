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
public class VectorEntrega implements Serializable {  
   private static final long serialVersionUID = 1L;
   
   protected int max = 50;
   protected Entrega[] v = new Entrega[max];
}
