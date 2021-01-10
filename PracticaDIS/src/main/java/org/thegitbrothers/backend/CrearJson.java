package org.thegitbrothers.backend;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

import com.google.gson.*; //gson
import com.google.gson.reflect.TypeToken;


public class CrearJson {

    private static final String dir_json = new File("videotecas.json").getAbsolutePath();
    private static final String dir_json2 = new File("peliculas.json").getAbsolutePath();;

    public static void crearFicheroJson(ArrayList<Videoteca> videotecas){
        try{
            FileWriter mywriter = new FileWriter(dir_json);
            mywriter.write(new Gson().toJson(videotecas));
            mywriter.close();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    public static void crearFicheroJsonPelis(ArrayList<Pelicula> pelis){
        try{
            FileWriter mywriter = new FileWriter(dir_json2);
            mywriter.write(new GsonBuilder().excludeFieldsWithModifiers(Modifier.PROTECTED).create().toJson(pelis));
            mywriter.close();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    public static ArrayList<Videoteca> leerFicheroJson(){
        ArrayList<Videoteca> videotecas = new ArrayList<Videoteca>();
        Gson gson = new Gson();
        try {
            videotecas = gson.fromJson(new FileReader(dir_json),new TypeToken<ArrayList<Videoteca>>(){}.getType());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return videotecas;
    }

    public static ArrayList<Pelicula> leerFicheroJsonPelis(){
        ArrayList<Pelicula> pelis = new ArrayList<Pelicula>();
        Gson gson = new Gson();
        try {
            pelis = gson.fromJson(new FileReader(dir_json2),new TypeToken<ArrayList<Pelicula>>(){}.getType());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return pelis;
    }
}
