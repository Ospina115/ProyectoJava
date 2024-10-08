package com.tiendaelectrica.cruds.sucursal.application;

import com.tiendaelectrica.cruds.sucursal.domain.entity.Sucursal;
import com.tiendaelectrica.cruds.sucursal.domain.service.SucursalService;

public class CreateSucursalUseCase {
    private SucursalService sucursalService;

    public CreateSucursalUseCase(SucursalService sucursalService) {
        this.sucursalService = sucursalService;
    }

    public void execute(Sucursal sucursal) {
        sucursalService.addSucursal(sucursal);
    }
}
