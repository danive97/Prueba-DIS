package org.thegitbrothers.backend;

import java.util.ArrayList;
import java.util.Iterator;

public class Querys {

    public static void mostrarActores(Videoteca videoteca, String nombrePelicula){
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        Pelicula peli = new Pelicula();
        boolean mostrado = false;

        Iterator<Pelicula> iterPeliculas = videoteca.getPeliculas().iterator(); //creamos un iterador de peliculas para movernos
        System.out.println("\nActores\n------------");
        while(iterPeliculas.hasNext() && !mostrado ){ //si hay mas pelis y no se han mostrado la que estamos buscando continuar
            peli = iterPeliculas.next(); //nos movemos
            if(peli.getTitulo().equals(nombrePelicula)){ //si el titulo equivale al que estamos buscando
                peli.mostrarReparto(); //mostramos el reparto de esa peli
                mostrado = true; //ponemos el flag a true para realizar una terminacion anticipada y no gastar recursos inecesarios

            }
        }
        if(!mostrado)
            System.out.println("Error: No se encuentra la Pelicula\n");

    }

    public static void mostrarGeneros(Videoteca videoteca){
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        Pelicula peli = new Pelicula();

        Iterator<Pelicula> iterPeliculas = videoteca.getPeliculas().iterator(); //creamos un iterador de peliculas para movernos
        System.out.println("\nGeneros\n---------------");
        while(iterPeliculas.hasNext()){//si hay mas pelis
            peli = iterPeliculas.next(); //nos movemos
            if(peli.getGenero() != null){ //si la peli tiene genero
                System.out.println(peli.getGenero()); //lo mostramos
            }else System.out.println("No calificada"); //si no tiene genero, mostramos "no calificada"
        }
    }

    public static ArrayList<Pelicula> getAllPelis(ArrayList<Videoteca> videotecas) {
        ArrayList<Pelicula> pelis = new ArrayList<Pelicula>();
        Iterator<Videoteca> iterVideotecas = videotecas.iterator();
        Videoteca aux_videoteca = new Videoteca();

        while(iterVideotecas.hasNext()){
            aux_videoteca = iterVideotecas.next();
            pelis.addAll(aux_videoteca.getPeliculas());
        }

        return pelis;
    }

    public static int buscarActorPorId(Actor actor, Pelicula peli){
       boolean encontrado = false;
       int contador_index = -1;
        Iterator<Actor> iterActor = peli.getReparto().iterator();

        while(iterActor.hasNext() && !encontrado){
            contador_index++;
            if(iterActor.next().getId() == actor.getId()){
                encontrado = true;
            }
        }


       return contador_index;

    }


}
