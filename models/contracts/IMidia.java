package models.contracts;

import java.util.Date;

import models.Artista;

public interface IMidia {

    public void setTitulo(String titulo);

    public void setAutor(String autor);

    public void setDuracao(Double duracao);

    public void setData(Date data);

    public void setInterprete(Artista interprete);

    public void setGenero(Artista genero);
}
