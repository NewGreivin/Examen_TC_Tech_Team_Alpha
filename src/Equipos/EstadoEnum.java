/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Equipos;


/**
 *
 * @author Student
 */
public enum EstadoEnum {
    OPERATIVO("Operativo"),
    EN_REVISION("En Revision"),
    FUERA_DE_SERVICIO("Fuera de Servicio");
   
    private String descripcion;
    
    EstadoEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
   
    @Override
    public String toString() {
        return "EstadoEnum{" + "ordinal=" + ordinal() + ", name=" + name() + '}';
    }
    
    
}
