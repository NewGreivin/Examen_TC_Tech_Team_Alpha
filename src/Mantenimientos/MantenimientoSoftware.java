/**
 * @author Greivin
 */
package Mantenimientos;

import java.time.LocalDate;

public class MantenimientoSoftware extends Mantenimiento {
    private String programasAfectados;

    public String getProgramasAfectados() {
        return programasAfectados;
    }

    public MantenimientoSoftware(String codigo, String equipo, String motivo, LocalDate fechaSolicitud, String programasAfectados) {
        super(codigo, equipo, motivo, fechaSolicitud);
        this.programasAfectados = programasAfectados;
    }

    @Override
    public String toString() {
        return super.toString() + ", ProgramasAfectados: " + programasAfectados;
    }
}
