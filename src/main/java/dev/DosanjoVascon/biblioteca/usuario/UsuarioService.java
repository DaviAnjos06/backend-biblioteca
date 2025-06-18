package dev.DosanjoVascon.biblioteca.usuario;

import dev.DosanjoVascon.biblioteca.livro.Livro;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {this.usuarioRepository = usuarioRepository;}

    //GET
    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }
    //POST
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    //DELETE
    public void delete(Long id){
        usuarioRepository.deleteById(id);
    }

}
