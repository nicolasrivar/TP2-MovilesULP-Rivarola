package com.ulpmovil.tp2;

import java.io.Serializable;

public class Libro implements Serializable {

    private String titulo;
    private String autor;
    private String paginas;
    private String anio;
    private int imagen;
    private String detalles;
    private String genero1;
    private String genero2;


    public Libro(String titulo, String autor, String paginas, String anio, int imagen, String detalles, String genero1, String genero2) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.anio = anio;
        this.imagen = imagen;
        this.detalles = detalles;
        this.genero1 = genero1;
        this.genero2 = genero2;
    }


    public String getGenero1() {
        return genero1;
    }

    public void setGenero1(String genero1) {
        this.genero1 = genero1;
    }

    public String getGenero2() {
        return genero2;
    }


    public void setGenero2(String genero2) {
        this.genero2 = genero2;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}
