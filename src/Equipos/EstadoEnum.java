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

    public static EstadoEnum getOPERATIVO() {
        return OPERATIVO;
    }

    public static EstadoEnum getEN_REVISION() {
        return EN_REVISION;
    }

    public static EstadoEnum getFUERA_DE_SERVICIO() {
        return FUERA_DE_SERVICIO;
    }

    @Override
    public String toString() {
        return "EstadoEnum{" + "ordinal=" + ordinal() + ", name=" + name() + '}';
    }
    
    
}
