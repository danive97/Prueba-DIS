package org.thegitbrothers.backend;

import org.thegitbrothers.backend.Pelicula;

import java.util.ArrayList;
import java.util.List;


public class Videoteca { //esta clase contiene todos los atributos que dispone el fichero xml, un constructur a null y un metodo añadir pelicula
    private int id;
    private String nombre;
    private String ubicacion;
    private String fecha_ultima_act;
    private List<Pelicula> peliculas;


    public Videoteca(){
        this.nombre=null;
        this.ubicacion=null;
        this.fecha_ultima_act=null;
        this.peliculas= new ArrayList<Pelicula>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public String getFecha_ultima_act() {
        return fecha_ultima_act;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public void setFecha_ultima_act(String fecha_ultima_act) {
        this.fecha_ultima_act = fecha_ultima_act;
    }

    public void addPelicula(Pelicula peli){
        peliculas.add(peli);
    }
}
