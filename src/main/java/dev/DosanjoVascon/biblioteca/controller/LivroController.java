package dev.DosanjoVascon.biblioteca.controller;

import dev.DosanjoVascon.biblioteca.livro.Livro;
import dev.DosanjoVascon.biblioteca.livro.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")

public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<Livro> getAll() {
        return livroService.getAll();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public Livro create(@RequestBody Livro livro) {return livroService.save(livro);}

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id) {livroService.delete(id);}

}
