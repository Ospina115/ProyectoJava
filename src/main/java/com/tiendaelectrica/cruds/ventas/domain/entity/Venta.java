package com.tiendaelectrica.cruds.ventas.domain.entity;

import java.sql.Date;

public class Venta {
    private int id_venta;
    private int id_cliente;
    private Date fecha_venta;

    public Venta(int id_cliente, Date fecha_venta) {
        this.id_cliente = id_cliente;
        this.fecha_venta = fecha_venta;
    }

    // Getters y setters
    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }
}
