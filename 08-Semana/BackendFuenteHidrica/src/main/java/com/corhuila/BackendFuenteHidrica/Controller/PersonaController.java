package com.corhuila.BackendFuenteHidrica.Controller;

import com.corhuila.BackendFuenteHidrica.Entity.Persona;
import com.corhuila.BackendFuenteHidrica.IService.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("v1/api/persona")
public class PersonaController{

    @Autowired
    private IPersonaService service;

    @GetMapping("")
    public List<Persona> All() {
        return service.All();
    }

    @GetMapping("/{id}")
    public Optional<Persona> FindById(@PathVariable Long id) {
        return service.FindById(id);
    }

    @PutMapping("/{id}")
    public void Save(@RequestBody Persona persona, @PathVariable Long id) {
        service.Update(persona, id);
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable Long id) {
        service.Delete(id);
    }

    @PostMapping
    public Persona Save(@RequestBody Persona persona) {
        return service.Save(persona);
    }



}
