package com.fesc.cheorl.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fesc.cheorl.Models.Respuestas.RolesDataRestModel;
import com.fesc.cheorl.Services.IRolesServices;

@RestController
@RequestMapping("/rol")
public class RolesController {

    @Autowired
    IRolesServices iRolesServices;

    @GetMapping()
    public List<RolesDataRestModel> getTareas() {
        return iRolesServices.getRoles();
    }

}
