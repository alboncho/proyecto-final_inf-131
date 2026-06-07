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
public class VectorEncomienda implements Serializable {
   private static final long serialVersionUID = 1L;
   
   protected int MAX = 50;
   protected Encomienda[] v = new Encomienda[MAX];
}
