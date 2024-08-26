package edu.misena.relaciones.clases.model;

public class itemFactura{
    private Producto producto;
    private int cantidad;

    public itemFactura(Producto producto, int cantidad){
        this.producto=producto;
        this.cantidad=cantidad;
    }

    //getters//
    public Producto producto(){return producto;}
    public int cantidad(){return cantidad;}

    //setters//
    public void setProducto(Producto producto) {this.producto = producto;}
    public void setCantidad(int cantidad) {this.cantidad = cantidad;}
}
