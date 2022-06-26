package models;

import java.util.Date;

import models.contracts.IMidia;

public class Midia implements IMidia{

    public Midia(String titulo, String autor, Double duracao, Date data, Artista interprete, Artista genero) {
        setTitulo(titulo);
        setAutor(autor);
        setDuracao(duracao);
        setData(new Date());
        setInterprete(interprete);
        setGenero(genero);
    }

    private String titulo;
    private String autor;
    private Double duracao;
    private Date data;
    private Artista interprete;
    private Artista genero;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Artista getGenero() {
        return genero;
    }

    public void setGenero(Artista genero) {
        this.genero = genero;
    }

    public Artista getInterprete() {
        return interprete;
    }

    public void setInterprete(Artista interprete) {
        this.interprete = interprete;
    }
}
