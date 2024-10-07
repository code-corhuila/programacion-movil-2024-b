package com.corhuila.Parcial.Controller;

import com.corhuila.Parcial.Entitity.Materia;
import com.corhuila.Parcial.IService.IMateriaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/materia")
public class MateriaController extends ABaseController<Materia, IMateriaService> {
    public MateriaController(IMateriaService service) {
        super(service, "Materia");
    }
}
