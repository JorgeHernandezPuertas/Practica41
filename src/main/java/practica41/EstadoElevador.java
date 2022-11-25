/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package practica41;

/**
 *
 * @author jorge
 */
public enum EstadoElevador {
    
    // enums
    SUBIENDO("subiendo"),
    BAJANDO("bajando"),
    PARADO("parado"),
    AVERIADO("averiado");
    
    // Atributos
    private String estado;
    
    // Constructor privado
    private EstadoElevador(String estado){
        this.estado = estado;
    }
    
    // Getters
    public static EstadoElevador getSUBIENDO() {
        return SUBIENDO;
    }

    public static EstadoElevador getBAJANDO() {
        return BAJANDO;
    }

    public static EstadoElevador getPARADO() {
        return PARADO;
    }

    public static EstadoElevador getAVERIADO() {
        return AVERIADO;
    }

    public String getEstado() {
        return estado;
    }
    
    
}
