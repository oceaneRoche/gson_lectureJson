package client.utils;

import java.nio.file.Files;
import java.nio.file.Path;

public class LectureFichierTexte {
    public String lire(String url){
        String contenu = null;
        try{
            Path cheminFichier = Path.of(url);
            contenu = Files.readString(cheminFichier);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contenu;
    }
}

