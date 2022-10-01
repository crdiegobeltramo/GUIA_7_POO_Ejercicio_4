/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioRectangulo;

import Rectangulo.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ServicioRectangulo {

    public Rectangulo crearRectangulo() {
        Rectangulo r = new Rectangulo();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        r.setBase(leer.nextFloat());
        System.out.println("Ingrese la altura del rectangulo");
        r.setAltura(leer.nextFloat());
        return r;
    }

    public void superficieRectangulo(Rectangulo r) {
        System.out.println("La superficie del rectangulo es: " + r.getBase() * r.getAltura());
    }

    public void perimetroRectangulo(Rectangulo r) {
        System.out.println("El perimetro del rectangilo es: " + (r.getBase() + r.getAltura()) * 2);
    }

    public void dibujarRectangulo(Rectangulo r) {

        for (int i = 0; i < r.getBase(); i++) {
            for (int j = 0; j < r.getAltura(); j++) {
                if ((i == 0 || i == r.getBase() - 1 || j == 0 || j == r.getAltura() - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
