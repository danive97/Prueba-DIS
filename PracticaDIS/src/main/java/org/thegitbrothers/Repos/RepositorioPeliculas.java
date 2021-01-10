package org.thegitbrothers.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thegitbrothers.backend.Pelicula;

import java.util.List;

public interface RepositorioPeliculas extends JpaRepository<Pelicula,Long> {
    List<Pelicula> findByTituloContainingIgnoreCase(String titulo);
}
