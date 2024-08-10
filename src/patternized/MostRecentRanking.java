package patternized;

import java.util.ArrayList;

public class MostRecentRanking implements PhotoRankingBuilder {
    private ArrayList<Photo> mergedPhotos;
    
    @Override
    public ArrayList<Photo> rankPhotos(ArrayList<Photo> unsplashPhotos, ArrayList<Photo> pixabayPhotos) {
        // Se combinan las dos listas de fotos en mergedPhotos
        // Se reordenan por orden adición mas reciente
        // se retorna mergedPhotos
        return mergedPhotos;
    }
    
}
