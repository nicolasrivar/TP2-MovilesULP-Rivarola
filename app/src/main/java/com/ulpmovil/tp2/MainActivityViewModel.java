package com.ulpmovil.tp2;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

public class MainActivityViewModel extends AndroidViewModel {

    private MutableLiveData<ArrayList<Libro>> mLibros = new MutableLiveData<>();
    private ArrayList<Libro> libros = new ArrayList<>();

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<ArrayList<Libro>> getLibros() {
        return mLibros;
    }

    public void cargarLibros(ArrayList<Libro> libros) {
        libros.add(new Libro("Rayuela", "Julio Cortazar", "736", "1963", R.drawable.rayuela , "Una novela revolucionaria que desafía las convenciones narrativas tradicionales", "Poesía", "Cuentos"));
        libros.add(new Libro("El Hobbit", "J. R. R. Tolkien", "310", "1937", R.drawable.el_hobbit, "Una novela fantástica que narra la aventura de Bilbo Bolsón en busca del tesoro custodiado por el dragón Smaug.", "Fantasia", "Ciencia Ficcion"));
        libros.add(new Libro("Juego de Tronos", "George R. R. Martin", "694", "1996", R.drawable.juego_de_tronos, "El primer libro de la saga 'Canción de Hielo y Fuego', una épica historia de poder, traición y fantasía.", "Fantasia", "Ciencia Ficcion"));
        mLibros.setValue(libros);
    }
}
