package org.thegitbrothers.backend;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {




    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        ArrayList<Videoteca> videotecas = new ArrayList<Videoteca>();

        videotecas = CrearJson.leerFicheroJson();
        CrearJson.crearFicheroJsonPelis((ArrayList<Pelicula>) videotecas.get(0).getPeliculas());

        //Querys.mostrarActores(videotecas.get(0), "Star Wars: Episodio I - La amenaza fantasma");
        //Querys.mostrarGeneros(videotecas.get(1));

    }

}
