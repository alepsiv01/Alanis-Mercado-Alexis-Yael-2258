package com.mycompany.juego_del_gato;

import java.util.Scanner;

public class Juego_del_gato {
    public static void main(String[]args) {
        Scanner entrada= new Scanner(System.in);
        int A=0,cont=0,Si=0;
        System.out.println("Juego de gato: ");
        while(A==0){
            System.out.println("Ingrese una cadena de 9 caracteres que solo contenga X,O,_: ");
            String primero=entrada.nextLine();
            String segunda=primero.toUpperCase();
            String[]division=segunda.split("");
            
            for (String division1 : division) {
                if (division1.equals("X") || division1.equals("O") || division1.equals("_")) {
                    Si=Si+1;
                }
            }
            if(segunda.length()==9){
                if (Si==9) {
                    cont=0;
                    for (int index = 0; index < 5; index++) {
                        if (index==0 || index==4) {
                            System.out.println("l  l  l  l  l");
                        }
                        else{
                            System.out.println("l  "+division[0+cont]+"  "+division[1+cont]+"  "+division[2+cont]+"  l");
                            cont+=3;
                        }
                        A=1;
                    }
                }else{
                    System.out.println("Solo estan permitidos :  X,O,_");
                }
                
            }else{
                System.out.println("Son necesarios 9 caracteres, intente de nuevo");
            }
        }
    }
}
