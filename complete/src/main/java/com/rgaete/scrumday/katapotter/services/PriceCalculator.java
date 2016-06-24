package com.rgaete.scrumday.katapotter.services;

import com.rgaete.scrumday.katapotter.domain.Canasta;
import com.rgaete.scrumday.katapotter.domain.Libro;

public class PriceCalculator {

    public static int calculate(Canasta canasta) {
        int total = 0;
        for(Libro libro :canasta.getLibros() ){
            total += libro.getCantidad() * 8000;
        }
        if(canasta.getLibros().size()>1) {
            total *= 0.95;
        }
        return total;
    }
}
