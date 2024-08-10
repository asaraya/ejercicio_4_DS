package patternized;

import java.util.ArrayList;

public interface PhotoRankingBuilder {
    ArrayList<Photo> rankPhotos(ArrayList<Photo> unsplashPhotos, ArrayList<Photo> pixabayPhotos);
}
