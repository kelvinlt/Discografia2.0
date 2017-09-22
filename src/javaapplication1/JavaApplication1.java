/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAM
 */
public class JavaApplication1 {

    private static ArrayList<Disco> discos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        discos = new ArrayList<>();

        int opcion = 0;

        do {
            mostrarMenu();
            opcion = pedirEntero("Escoje una opcion:");
            System.out.println("========================");

            switch (opcion) {
                case 1:
                    System.out.println("Has escogido:");
                    System.out.println("1.Nuevo disco");
                    addDisco();
                    break;
                case 2:
                    System.out.println("Has escogido:");
                    System.out.println("2.Modificar disco");
                    System.out.println("========================");
                    modifyDisco();
                    break;
                case 3:
                    System.out.println("Has escogido:");
                    System.out.println("3.Borrar disco");
                    System.out.println("========================");
                    deleteDisco();
                    break;
                case 4:
                    System.out.println("Has escogido:");
                    System.out.println("4.Mostrat disco");
                    System.out.println("========================");
                    showDisco();
                    break;
                case 5:
                    System.out.println("Has escogido:");
                    System.out.println("5.Salir");
                    System.out.println("ADIOS");
                    System.out.println("========================");
                    break;
            }
        } while (opcion != 5);

    }

    public static void mostrarMenu() {
        System.out.println("==== Menu Principal ====");
        System.out.println("1.Nuevo disco");
        System.out.println("2.Modificar disco");
        System.out.println("3.Borrar disco");
        System.out.println("4.Mostrat disco");
        System.out.println("5.Salir");
        System.out.println("========================");
    }

    public static void addDisco() {
        String titulo = pedirCadena("Titulo: ");
        String grupo = pedirCadena("Grupo: ");
        int tema = pedirEntero("Numero de temas: ");
        double duracion = pedirDouble("Duracion: ");

        Disco nuevo = new Disco(titulo, grupo, tema, duracion);
        nuevo.setTitulo(titulo);
        nuevo.setArtista(grupo);
        nuevo.setTema(tema);
        nuevo.setDuracion(duracion);
        discos.add(nuevo);

        System.out.println("Disco añadido");
        System.out.println("========================");
    }

    public static void modifyDisco() {
        showDisco();
        int num = pedirEntero("Indica el numero del disco que quieres modificar:");
        num--;
        Disco d = discos.get(num);
        System.out.println("Datos del disco:");
        System.out.println(d);
        int temas = pedirEntero("Indica el nuevo numero para tema");
        d.setTema(temas);

    }

    public static void deleteDisco() {
        showDisco();
        int num = pedirEntero("Indica el numero del disco que quieres borrar:");
        num--;
        Disco d = discos.get(num);
        System.out.println("Datos del disco:");
        System.out.println(d);
        
        String seguridad = pedirCadena("Estas seguro de borrar el disco? Escribe si para seguir borrando");
        if(seguridad.equals("si")){    
        discos.remove(num);
        }
        else{
        }
        
        

        
//remove
    }

    public static void showDisco() {
        int numDisco = 1;

        for (Disco d : discos) {
            System.out.println("===Disco numero : " + numDisco + " | " + d);
            numDisco++;
        }
    }

    public static int pedirEntero(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;
        boolean error = true;
        do {
            try {
                System.out.println(mensaje);
                numero = Integer.parseInt(br.readLine());
                error = false;
            } catch (IOException ex) {
                System.out.println("Error entrada y salida!");
                //Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NumberFormatException ex) {
                System.out.println("Debes escribir un numero!");
            }
        } while (error);
        return numero;
    }

    public static String pedirCadena(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String texto = "";
        boolean error = true;
        do {
            System.out.println(mensaje);
            try {
                texto = br.readLine();
                if (texto.equals("")) {
                    System.out.println("No puedes dejar en blanco los datos");

                } else {
                    error = false;
                }
            } catch (IOException ex) {
                System.out.println("Error de entrada y salida");
            }
        } while (error);
        return texto;
    }

    public static double pedirDouble(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double numero = 0;
        boolean error = true;
        do {
            System.out.println(mensaje);
            try {
                numero = Double.parseDouble(br.readLine());
                error = false;
            } catch (IOException e) {
                System.out.println("Error de entrada y salida");
            } catch (NumberFormatException ex) {
                System.out.println("Debes escribir un numero!");
            }
        } while (error);
        return numero;
    }
}
