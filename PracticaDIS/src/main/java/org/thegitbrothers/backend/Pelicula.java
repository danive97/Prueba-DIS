package org.thegitbrothers.backend;

import org.thegitbrothers.backend.Actor;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Pelicula { //esta clase contienes con todos los atributos que tiene el xml, un contructor a null, un añadir reparto y un metodo mostrar reparto
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @Column(columnDefinition="TEXT")
    private String sinopsis;
    private String genero;
    private String enlace_IMDB;
    private String minutos;
    private String anio_estreno;
    @OneToMany(cascade = {CascadeType.ALL}, orphanRemoval = true , fetch = FetchType.EAGER)
    private List<Actor> reparto;

    public Pelicula(){
        this.titulo = null;
        this.sinopsis = null;
        this.genero = null;
        this.enlace_IMDB = null;
        this.id = null;
        this.minutos = null;
        this.anio_estreno = null;
        this.reparto = new ArrayList<Actor>();
    }

    public Long getId() {
        return id;
    }

    public String getMinutos() {
        return minutos;
    }

    public String getAnio_estreno() {
        return anio_estreno;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public List<Actor> getReparto() {
        return reparto;
    }

    public String getGenero() {
        return genero;
    }

    public String getEnlace_IMDB() {
        return enlace_IMDB;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setReparto(ArrayList<Actor> reparto) {
        this.reparto = reparto;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEnlace_IMDB(String enlace_IMDB) {
        this.enlace_IMDB = enlace_IMDB;
    }


    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    public void setAnio_estreno(String anio_estreno) {
        this.anio_estreno = anio_estreno;
    }

    public void addActor(Actor actor){
        reparto.add(actor);
    }

    public void mostrarReparto(){
        for (Actor actor : reparto) { //por cada actor en reparto hacemos:
            System.out.println(actor.toString()); //hacemos uso del tostring de actor al que hemos hecho override previamente
        }
    }
    @Override
    public String toString() {
        return String.format("Customer[id=%d]", id);
    }

    public void setId(Long valueOf) {
    }
}
