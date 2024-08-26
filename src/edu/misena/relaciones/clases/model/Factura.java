package edu.misena.relaciones.clases.model;

import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private itemFactura[] items;
}
