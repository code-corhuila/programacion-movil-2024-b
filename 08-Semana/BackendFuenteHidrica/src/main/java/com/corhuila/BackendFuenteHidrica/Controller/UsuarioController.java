package com.corhuila.BackendFuenteHidrica.Controller;

import com.corhuila.BackendFuenteHidrica.Entity.Usuario;
import com.corhuila.BackendFuenteHidrica.IService.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("v1/api/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService service;

    @GetMapping("")
    public List<Usuario> All() {
        return service.All();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> FindById(@PathVariable Long id) {
        return service.FindById(id);
    }

    @PutMapping("/{id}")
    public void Save(@RequestBody Usuario usuario, @PathVariable Long id) {
        service.Update(usuario, id);
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable Long id) {
        service.Delete(id);
    }

    @PostMapping
    public Usuario Save(@RequestBody Usuario usuario) {
        return service.Save(usuario);
    }



}
