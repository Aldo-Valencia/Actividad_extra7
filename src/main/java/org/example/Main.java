package org.example;

import org.example.Persistencia.DemoLibroDB;
import org.example.modelo.Libro;

public class Main {
    public static void main(String[] args) {
        DemoLibroDB demo = new DemoLibroDB();
        Libro libro = new Libro(0,"El juego", "Desconocido");

        //if (demo.insertarLibro(libro)){
          //  System.out.println("Se inserto correctamente");
        //}
        //else {
          //  System.out.println("No se inserto");
        //}
        System.out.println(demo.buscarLibroPorId(100));

        System.out.println("---------------------------");
        for (Libro tmp: demo.obtenerTodos()) {
            System.out.println("Libro: " + tmp);
            System.out.println("Titulo" + tmp.getTitulo());
        }
    }
}