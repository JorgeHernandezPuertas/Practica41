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
    public static LocalDate proximaRevision(Elevador ascensorAux){
        // Devuelve la fecha de la próxima revision (6 meses después)
        return ascensorAux.getUltimaRevision().plusMonths(6);
    }
    
    // Método main
    public static void main(String[] args) {
        
    }
}
