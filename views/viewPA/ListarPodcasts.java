package views.viewPA;

import controllers.PodcastController;
import models.Podcast;

public class ListarPodcasts {

    public void listar(){
        PodcastController podcastController = new PodcastController();

        Podcast podcast = new Podcast(null, null, null, null, null, null);
        
        podcast.setTitulo("TituloRandom1");
        podcast.setAutor("AutorRandom1");
        podcast.setTitulo("TituloRandom2");
        podcast.setAutor("AutorRandom2");
        podcastController.cadastrar(podcast);

        System.out.println("-- LISTA DE PODCASTS --");
        for(Podcast podcastCadastrado : podcastController.listar()){
            System.out.println(podcastCadastrado);
        }
    }
    
}
