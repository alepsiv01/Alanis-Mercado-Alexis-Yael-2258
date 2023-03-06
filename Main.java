package Tarea4_;
public class Main {
    public static void main(String[] args) {
        Avestruz Avestruz= new Avestruz("Plumita", 1, "negro y blanco ", 80,"africana");
        System.out.println(Avestruz.toString());
        System.out.println(Avestruz.comer());
        System.out.println(Avestruz.morder());
        System.out.println(Avestruz.esconder());
        Perico perico= new Perico("Hendrix",2,"Verde",0.40,"Opalino");
        System.out.println(perico.toString());
        System.out.println(perico.comer());
        System.out.println(perico.aprendio());
        System.out.println(perico.Escalo());

    }
}
    

