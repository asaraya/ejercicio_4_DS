package patternized;

import java.util.ArrayList;

public class UnsplashPhotoAdapter implements PhotoAdapter {
    private ArrayList<Photo> listaFotosUnsplash;

    @Override
    public ArrayList<Photo> searchPhoto(String query) {
        // se buscan fotos con el api de unsplash -> UnsplashApi.searchPhotos(query)
        // se agregan las fotos al arraylist de listaFotosUnsplash
        // se retorna listaFotosUnsplash
        return listaFotosUnsplash;
    }
    
}
