/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio04practico;

import Rectangulo.Rectangulo;
import ServicioRectangulo.ServicioRectangulo;

/**
 *
 * @author diego
 */
public class POOEjercicio04Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ServicioRectangulo rs = new ServicioRectangulo();
      Rectangulo r1 = rs.crearRectangulo();
      rs.superficieRectangulo(r1);
      rs.perimetroRectangulo(r1);
      rs.dibujarRectangulo(r1);
    }
    
}
