package com.mycompany.stringg;

import java.util.Scanner;

/**
 *
 * @author qwert
 */
public class Stringg {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);              
        String cadena;
        String completo;
        System.out.println("Escriba su nombre, profesiòn, y nacionalidad: ");
        
        cadena = entrada.nextLine();
        
        completo = cadena;
        
        String[] separado = completo.split(" ");
        
        String separado1 = separado[0];
        String separado2 = separado[1];
        String separado3 = separado[2];
        
        separado1 = separado1.toUpperCase();
        separado2 = separado2.toUpperCase();
        separado3 = separado3.toUpperCase();
        
        System.out.println("Nombre: "+separado1);
        System.out.println("Profesiòn: "+separado2);
        System.out.println("Nacionalidad: "+separado3);
    }
}
