package controllers.contracts;
import java.util.ArrayList;

import models.Versao;

public interface IVersaoController {

    boolean cadastrar(Versao versao);
    Versao buscar(String nome);
    Versao remover(String abc);
    ArrayList<Versao> listar();
    
}
