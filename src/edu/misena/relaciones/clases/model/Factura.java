package edu.misena.relaciones.clases.model;

import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private itemFactura[] items;

    //getters//
    public int getFolio() {return folio;}
    public String getDescripcion() {return descripcion;}
    public Date getFecha() {return fecha;}
    public Cliente getCliente() {return cliente;}
    public itemFactura[] getItems() {return items;}

    //setters//
    public void setFolio(int folio) {this.folio = folio;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public void setFecha(Date fecha) {this.fecha = fecha;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}
    public void setItems(itemFactura[] items) {this.items = items;}
}
