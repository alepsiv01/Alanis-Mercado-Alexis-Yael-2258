package com.mycompany.sqllitedemo;

public class Main {

    LibroDAO ldao = new LibroDAO();

    
        try{
   Libro res = (Libro) ldao.buscarPorId("1");
            System.out.println(res);  
            System.out.println("----------");
        for(Object lib: ldao.obtenerTodo()){
            System.out.println((Libro)lib);
        }
    }catch (SQLExcepction sqle){      
            System.out.println("Error");
            System.out.println(sqle.getMessage());
    }

}
