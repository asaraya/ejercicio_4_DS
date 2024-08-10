package naive;

import java.util.ArrayList;

public class BromeliaPictInventory {
    private ArrayList listaFotosUnsplash;
    private ArrayList listaFotosPixBay;
    private ArrayList rankList;

    public BromeliaPictInventory (ArrayList pListaFotosUnsplash, ArrayList pListaFotosPixBay) {
        this.listaFotosUnsplash = pListaFotosUnsplash;
        this.listaFotosPixBay = pListaFotosPixBay;
    }
    
    public ArrayList<Photo> unsplashSearchPhoto(String query) {
        // se buscan fotos con el api de unsplash -> UnsplashApi.searchPhotos(query)
        // se agregan las fotos al arraylist de listaFotosUnsplash
        // se retorna listaFotosUnsplash
        return listaFotosUnsplash;
    }

    public ArrayList<Photo> pixabaySearchPhoto(String query) {
        // se buscan fotos con el api de pixabay -> PixabayApi.searchPhotos(query)
        // se agregan las fotos al arraylist de listaFotosPixabay
        // se retorna listaFotosPixabay
        return listaFotosPixBay;
    }

    public ArrayList<Photo> rankPhotosResult(ArrayList listaFotosUnsplash, ArrayList listaFotosPixbay) {
        // se mergen los arreglos
        // se rankea según el top 10
        // se agregan a la variable rankList que contiene ambas listas con ranking
        // se retorna rankList
        return rankList;
    }
}