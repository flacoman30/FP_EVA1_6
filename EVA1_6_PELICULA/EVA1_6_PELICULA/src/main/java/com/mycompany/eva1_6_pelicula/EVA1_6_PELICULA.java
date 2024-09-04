/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_pelicula;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA1_6_PELICULA {

    public static void main(String[] args) {
        //TODO LO NECESARIO PARA UNA PELICULA
        String nombre;
        String genero;
        int duracio;
        String reparto;
        String clasificacion;
        
        Scanner captura;
        
        captura = new Scanner(System.in);
        System.out.println("introduce el nombre de la pelicula");
        nombre = captura.nextLine();
        System.out.println("intruduce el genero de la pelicula");
        genero = captura.nextLine();
        System.out.println("intruduce la duracion que va tener la pelicula");
        duracio = captura.nextInt();
        captura.nextLine();
        System.out.println("introduce el reparto");
        reparto = captura.nextLine();
        System.out.println("introduce la clasificacion");
        clasificacion = captura.nextLine();
        
        System.out.println("DATOS ------CAPTURADOS-----");
        System.out.println("nombre");
        System.out.println("genero");
        System.out.println("duracion");
        System.out.println("reparto");
        System.out.println("clasificacion");
        
        
        
        
    }
}
