package org.thegitbrothers.backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Actor { //esta clase contiene los atributos neceseraios para leer el fichero xml, un contructor a null y un override del metodo tostring
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected Long id;
    private String nombre;
    private String enlace_wiki;


    public Actor(){
        this.id = null;
        this.nombre = null;
        this.enlace_wiki = null;
    }

    public Actor(String nombre, String enlace_wiki ){
        this.id = null;
        this.nombre = nombre;
        this.enlace_wiki = enlace_wiki;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEnlace_wiki() {
        return enlace_wiki;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEnlace_wiki(String enlace_wiki) {
        this.enlace_wiki = enlace_wiki;
    }

    public String toString(){
        return "Nombre Actor: " + this.nombre +  "\nEnlace Wikipedia" + this.enlace_wiki +"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;

        if (id != null ? !id.equals(actor.id) : actor.id != null) return false;
        if (nombre != null ? !nombre.equals(actor.nombre) : actor.nombre != null) return false;
        return enlace_wiki != null ? enlace_wiki.equals(actor.enlace_wiki) : actor.enlace_wiki == null;
    }
}
