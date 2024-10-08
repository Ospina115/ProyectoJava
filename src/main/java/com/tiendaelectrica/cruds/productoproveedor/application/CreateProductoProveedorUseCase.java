package com.tiendaelectrica.cruds.productoproveedor.application;

import com.tiendaelectrica.cruds.productoproveedor.domain.entity.ProductoProveedor;
import com.tiendaelectrica.cruds.productoproveedor.domain.service.ProductoProveedorService;

public class CreateProductoProveedorUseCase {
    private ProductoProveedorService productoProveedorService;

    public CreateProductoProveedorUseCase(ProductoProveedorService productoProveedorService) {
        this.productoProveedorService = productoProveedorService;
    }

    public void execute(ProductoProveedor productoProveedor) {
        productoProveedorService.addProductoProveedor(productoProveedor);
    }
}
