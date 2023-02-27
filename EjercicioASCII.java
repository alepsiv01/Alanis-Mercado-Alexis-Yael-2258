
package com.mycompany.ejercicioascii;

import java.util.Scanner;

/**
 *
 * @author Efrain
 */
public class EjercicioASCII {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite un texto: ");
        String input = entrada.nextLine();

        boolean secuencia = true;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i-1) + 1) {
                secuencia = false;

            }
        }

        System.out.println(secuencia);
    }
}
   
