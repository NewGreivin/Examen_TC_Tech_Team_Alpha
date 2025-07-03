/**
 * @author Greivin
 */
package Mantenimientos;

import java.time.LocalDate;

public abstract class Mantenimiento {
    protected String codigo;
    protected String equipo;
    protected String motivo;
    protected LocalDate fechaSolicitud;

    public String getCodigo() {
        return codigo;
    }
    public String getEquipo() {
        return equipo;
    }
    public String getMotivo() {
        return motivo;
    }
    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public Mantenimiento(String codigo, String equipo, String motivo, LocalDate fechaSolicitud) {
        this.codigo = codigo;
        this.equipo = equipo;
        this.motivo = motivo;
        this.fechaSolicitud = fechaSolicitud;
    }

    @Override
    public String toString() {
        return "Mantenimiento: " + "Codigo: " + codigo + ", Equipo: " + equipo + ", Motivo: " + motivo + ", Fecha Solicitud: " + fechaSolicitud + " ";
    }   
}