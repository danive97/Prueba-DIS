package org.thegitbrothers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thegitbrothers.Repos.RepositorioPeliculas;

@SpringBootApplication
public class ComponenteCRUD {
    private static final Logger log = LoggerFactory.getLogger(ComponenteCRUD.class);

    public static void main(String[] args) {
        SpringApplication.run(ComponenteCRUD.class);
    }

    @Bean
    public CommandLineRunner loadData(RepositorioPeliculas repo) {
        return (args) -> {
            // guardar peliculas
            /*ArrayList<Pelicula> pelis = new ArrayList<Pelicula>(); //creamos arraylist de peliculas
            pelis = CrearJson.leerFicheroJsonPelis();
            Iterator<Pelicula> iterPelis = pelis.iterator(); //creamos iterador de pelis

            while(iterPelis.hasNext()){ //mientras haya pelis
                repo.save(iterPelis.next()); //las guardamos en h2
            }*/

        };


    }
}