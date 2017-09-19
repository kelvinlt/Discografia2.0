/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author DAM
 */
public class Disco {
    
    private String titulo;
    
    private String artista;
    
    private int tema;
    
    private double duracion;

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }


    public int getTema() {
        return tema;
    }

    public void setTema(int tema) {
        this.tema = tema;
    }


    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Disco() {
    }

    public Disco(String titulo, String artista, int tema, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.tema = tema;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Disco{" + "titulo=" + titulo + ", artista=" + artista + ", tema=" + tema + ", duracion=" + duracion + '}';
    }

    
    
}
