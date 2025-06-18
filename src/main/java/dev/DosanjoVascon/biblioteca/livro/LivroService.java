package dev.DosanjoVascon.biblioteca.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class LivroService {

    @Autowired
    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    //GET
    public List<Livro> getAll() {
        return livroRepository.findAll();
    }
    //POST
    public Livro save(Livro livro) {
        return livroRepository.save(livro);
    }
    //DELETE
    public void delete(Long id){
        livroRepository.deleteById(id);
    }

}
