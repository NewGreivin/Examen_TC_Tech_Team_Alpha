/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Equipos;

import Listas.Lista;

/**
 *
 * @author Student
 */
public class Lista_Equipo implements Lista<Equipo>{
    private Equipo equipo[];
    
    public Lista_Equipo(){
        this.equipo = new Equipo[100];
    }
    @Override
    public Boolean Agregar(Equipo t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean Eliminar(Equipo t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Void Ordenar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Equipo Buscar(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int buscarPorEstado(EstadoEnum estado){
        int max = equipo.length;
        int contador = 0;
        String estadot = String.valueOf(estado);
        for (int i = 0; i < max; i++) {
            if(equipo[i]!=null){
                if(equipo[i].getEstado()==estadot){
                    contador++;
                }
            }
            
        }
        return contador;
    }
}
