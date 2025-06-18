package dev.DosanjoVascon.biblioteca.livro;

import jakarta.persistence.*;

@Entity
@Table(name = "livro_table")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer isbn;
    private String autor;
    private String genero;
    private String imgUrl;
    private boolean disponivel;

    public Livro() {
    }

    public Livro(Long id, String nome, Integer isbn, String autor, String genero, String imgUrl, boolean disponivel) {
        this.id = id;
        this.nome = nome;
        this.isbn = isbn;
        this.autor = autor;
        this.genero = genero;
        this.imgUrl = imgUrl;
        this.disponivel = disponivel;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

