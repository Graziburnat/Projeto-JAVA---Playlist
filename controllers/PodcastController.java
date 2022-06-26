package controllers;

import java.util.ArrayList;

import models.Podcast;

public class PodcastController {

    private static ArrayList<Podcast> podcasts = new ArrayList<Podcast>();

    public void cadastrar(Podcast podcast) {
        podcasts.add(podcast);
    }

    public ArrayList<Podcast> listar() {
        return podcasts;
    }

    public Podcast buscarPorNome(String nome) {
        for (Podcast podcastCadastrado : podcasts) {
            if (podcastCadastrado.getTitulo().equals(nome)) {
                return podcastCadastrado;
            }
        }
        return null;
    }

    public Podcast remover(String nome) {

        for (Podcast podcastCadastrado : podcasts) {
            if (podcastCadastrado.getTitulo().equals(nome)) {
                podcasts.remove(podcastCadastrado);
                return podcastCadastrado;
            }
        }
        return null;
    }

}
