package com.corhuila.Parcial.Controller;

import com.corhuila.Parcial.Entitity.Matricula;
import com.corhuila.Parcial.IService.IMatriculaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/matricula")
public class MatriculaController extends ABaseController<Matricula, IMatriculaService> {
    public MatriculaController(IMatriculaService service) {
        super(service, "Matricula");
    }
}
