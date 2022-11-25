/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica41;

import java.time.LocalDate;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author jorge
 */
public class Elevador {

    // Atributos
    private String numeroSerie;
    private String fabricantes;
    private int personasMax;
    private double pesoMax;
    private LocalDate fechaFabricacion;
    private LocalDate ultimaRevision;

    // Constructor
    public Elevador(String numeroSerie, String fabricantes, int personasMax, double pesoMax, LocalDate fechaFabricacion, LocalDate ultimaRevision) {
        this.numeroSerie = generarNumeroSerie();
        this.fabricantes = fabricantes;
        this.personasMax = personasMax;
        this.pesoMax = pesoMax;
        this.fechaFabricacion = fechaFabricacion;
        this.ultimaRevision = ultimaRevision;
    }

    // Método para generar número de serie aleatorio
    private String generarNumeroSerie() {
        // Genero número aleatorio de 8 digitos y lo devuelvo
        return RandomStringUtils.randomNumeric(8); 
    }
}
