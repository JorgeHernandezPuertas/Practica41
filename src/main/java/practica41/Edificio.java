/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica41;

import java.time.LocalDate;

/**
 *
 * @author jorge
 */
public class Edificio {

    // Método de clase
    public static LocalDate proximaRevision(Elevador ascensorAux) {
        // Devuelve la fecha de la próxima revision (6 meses después)
        return ascensorAux.getUltimaRevision().plusMonths(6);
    }

    // Método main
    public static void main(String[] args) {

        // Creo los dos ascensores
        Elevador ascensor1 = new Elevador("Bosch", 10, 800);
        Elevador ascensor2 = new Elevador("Desconocido", 20, 10000);

        // Saco los dos ascensores por consola para ver sus valores iniciales
        System.out.println(ascensor1);
        System.out.println("--------------------------------------");
        System.out.println(ascensor2);
        System.out.println("--------------------------------------");

        // Pruebo a mover el ascensor con varios valores (límites, fuera y dentro del rango)
        boolean mover1 = ascensor1.mover(8, 700, 5);
        System.out.println("¿Se ha movido 1? " + mover1);
        System.out.println(ascensor1);
        System.out.println("--------------------------------------");

        boolean mover2 = ascensor1.mover(3, 200, 2);
        System.out.println("¿Se ha movido 2? " + mover2);
        System.out.println("--------------------------------------");

        boolean mover3 = ascensor1.mover(20, 200, 3);
        System.out.println("¿Se ha movido 3? " + mover3);
        System.out.println(ascensor1);
        System.out.println("--------------------------------------");

        boolean mover4 = ascensor1.mover(5, 1000, 3);
        System.out.println("¿Se ha movido 4? " + mover4);
        System.out.println(ascensor1);
        System.out.println("--------------------------------------");

        boolean mover5 = ascensor1.mover(4, 300, 20);
        System.out.println("¿Se ha movido 5? " + mover5);
        System.out.println(ascensor1);
        System.out.println("--------------------------------------");

        // Imprimo la fecha de la próxima revisión del ascensor
        System.out.println("La próxima revisión del ascensor 1 es: "
                + proximaRevision(ascensor1));
    }
}
