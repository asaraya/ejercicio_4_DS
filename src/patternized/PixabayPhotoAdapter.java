package patternized;

import java.util.ArrayList;

public class PixabayPhotoAdapter implements PhotoAdapter{
    private ArrayList<Photo> listaFotosPixBay;

    @Override
    public ArrayList<Photo> searchPhoto(String query) {
        // se buscan fotos con el api de pixabay -> PixabayApi.searchPhotos(query)
        // se agregan las fotos al arraylist de listaFotosPixabay
        // se retorna listaFotosPixabay
        return listaFotosPixBay;
    }
    
}
