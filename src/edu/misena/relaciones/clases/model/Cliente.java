package edu.misena.relaciones.clases.model;

public class Cliente {
    private String nombre;
    private String nif; // Número de Identificación Fiscal

    public Cliente(String nombre,String nif){
        this.nombre=nombre;
        this.nif=nif;
    }

    //geters//
    public String getNombre(){return nombre;}
    public String getNif(){return nif;}

    //seters//

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setNif(String nif) {this.nif = nif;}
}