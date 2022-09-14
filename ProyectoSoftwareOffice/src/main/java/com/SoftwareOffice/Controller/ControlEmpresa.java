package com.SoftwareOffice.Controller;

import com.SoftwareOffice.Entities.Empresa;
import com.SoftwareOffice.Services.ServicioEmpresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlEmpresa {
    ServicioEmpresa s1 = new ServicioEmpresa();

    Empresa empresa1;

    public ControlEmpresa(){
        this.empresa1 = this.s1.getNombre();

    }

    @GetMapping("/informacion")
    public Empresa informacion(){
        return this.empresa1;
    }



}
