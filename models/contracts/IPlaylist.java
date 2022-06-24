package models.contracts;

import java.util.ArrayList;

import models.ItemPlay;
import models.Login;
public interface IPlaylist {

    void setNome(String nome);
    void setLogin(Login login);
    void setVersoes(ArrayList<ItemPlay> versoes);
}
