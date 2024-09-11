package com.tiendaelectrica.cruds.pais.application;

import com.tiendaelectrica.cruds.pais.domain.entity.Pais;
import com.tiendaelectrica.cruds.pais.domain.service.PaisService;

public class CreatePaisUseCase {
     // Este caso de uso llama al servicio PaisService para crear una categoría,
    // delegando la lógica de inserción del pais en la base de datos.
    private final PaisService paisService;

    public CreatePaisUseCase(PaisService paisService) {
        this.paisService = paisService;
    }

    public void execute(Pais pais) {
        paisService.CreatePais(pais);
    }
}
