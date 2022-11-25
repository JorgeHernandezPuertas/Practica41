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
    private EstadoElevador estado;
    private int plantaActual;

    // Constructor
    public Elevador(String fabricantes, int personasMax, double pesoMax) {
        this.numeroSerie = generarNumeroSerie();
        this.fabricantes = fabricantes;
        // Implemento la condición del atributo de maximo de personas
        this.personasMax = (personasMax < 0 || personasMax > 10) ? 0 : personasMax;
        // Implemento la condición del atributo de peso maximo (en kgs)
        this.pesoMax = (pesoMax < 0 || pesoMax > 800) ? 0 : pesoMax;
        // Las fechas se crean en la fecha actual del sistema
        this.fechaFabricacion = LocalDate.now();
        this.ultimaRevision = LocalDate.now();
        this.estado = null; // Su estado inicial es null
        this.plantaActual = 0; // Se crea en la planta baja
    }

    // Método para generar número de serie aleatorio
    private String generarNumeroSerie() {
        // Genero número aleatorio de 8 digitos y lo devuelvo
        return RandomStringUtils.randomNumeric(8);
    }

    // Setters
    public void setUltimaRevision(LocalDate ultimaRevision) {
        // Si la ultima revisión no es una fecha mayor a la actual se deja la que estaba
        if (ultimaRevision.compareTo(this.ultimaRevision) > 0) {
            this.ultimaRevision = ultimaRevision;
        }
    }

    public void setEstado(EstadoElevador estado) {
        this.estado = estado;
    }

    public void setPlantaActual(int plantaActual) {
        // Si se intenta poner una planta fuera del rango se deja la que estaba
        if (plantaActual >= 0 || plantaActual <= 8) {
            this.plantaActual = plantaActual;
        }
    }

    // Getters
    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getFabricantes() {
        return fabricantes;
    }

    public int getPersonasMax() {
        return personasMax;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public LocalDate getUltimaRevision() {
        return ultimaRevision;
    }

    public EstadoElevador getEstado() {
        return estado;
    }

    public int getPlantaActual() {
        return plantaActual;
    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elevador{");
        sb.append("numeroSerie=").append(numeroSerie);
        sb.append(", fabricantes=").append(fabricantes);
        sb.append(", personasMax=").append(personasMax);
        sb.append(", pesoMax=").append(pesoMax);
        sb.append(", fechaFabricacion=").append(fechaFabricacion);
        sb.append(", ultimaRevision=").append(ultimaRevision);
        sb.append(", estado=").append(estado);
        sb.append(", plantaActual=").append(plantaActual);
        sb.append('}');
        return sb.toString();
    }
}
