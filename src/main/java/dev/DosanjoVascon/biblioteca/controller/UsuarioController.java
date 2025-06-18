package dev.DosanjoVascon.biblioteca.controller;


import dev.DosanjoVascon.biblioteca.livro.Livro;
import dev.DosanjoVascon.biblioteca.usuario.Usuario;
import dev.DosanjoVascon.biblioteca.usuario.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<Usuario> getAll() {
        return usuarioService.getAll();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {return usuarioService.save(usuario);}

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id) {usuarioService.delete(id);}
}
