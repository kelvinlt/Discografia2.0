/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Objects;

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

    public Disco(String titulo) {
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
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disco other = (Disco) obj;
        return other.getTitulo().equalsIgnoreCase(titulo);
    }

    
    @Override
    public String toString() {
        return "  Titulo:" + titulo + ", Artista:" + artista + ", Tema:" + tema + ", Duracion:" + duracion + "===";
    }

    void setTema(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setDuracion(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
