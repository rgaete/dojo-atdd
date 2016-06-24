package com.rgaete.scrumday.katapotter.domain;

import java.util.ArrayList;
import java.util.List;

public class Canasta {

    private List<Libro> libros = new ArrayList<>();

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
