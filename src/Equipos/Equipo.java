/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Equipos;

/**
 *
 * @author Student
 */
public class Equipo {
    private String codigo;
    
    private String descripcion;
    
    private String ubicacion;
    
    private EstadoEnum estado;

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public EstadoEnum getEstado() {
        return estado;
    }

    public Equipo(String codigo, String descripcion, String ubicacion, EstadoEnum estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.estado = EstadoEnum.EN_REVISION;
    }

    @Override
    public String toString() {
        return "Equipo:" + "codigo=" + codigo + ", descripcion=" + descripcion + ", ubicacion=" + ubicacion + ", estado=" + estado;
    }
    
    
}
