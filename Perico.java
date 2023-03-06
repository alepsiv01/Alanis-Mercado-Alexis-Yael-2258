package Tarea4_;
public class Perico {
    private String nombre;
    private int edad;
    private String color;
    private double peso;
    private String raza;

    public Perico() {
        this.nombre = "";
        this.edad = 0;
        this.color = "";
        this.peso = 0.0;
        this.raza = "";
    }

    public Perico(String nombre, int edad, String color, double peso, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.peso = peso;
        this.raza = raza;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getColor() {
        return this.color;
    }

    public double getPeso() {
        return this.peso;
    }

    public String getRaza() {
        return this.raza;
    }

    public String hablar() {
        return "Hola";
    }

    public String dormir() {
        return "Zzz";
    }

    public String volar(double distancia) {
        return this.nombre + " voló " + distancia + " metros";
    }

    @Override
    public String toString() {
        return "Perico{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", raza='" + raza + '\'' +
                '}';
    }
    public boolean comer(){
        System.out.print(nombre+ " esta comiendo: ");
        boolean resultado= Math.random()>0.51;
        return resultado;
    }
    public boolean aprendio(){
        System.out.print(nombre+" aprendio una nueva palabra ");
        boolean resultado_1= Math.random()>0.51;
        return resultado_1;
    }
    public boolean Escalo(){
        System.out.print(nombre+ " a Escalado: ");
        boolean resultado_2= Math.random()>0.51;
        return resultado_2;
    }
}
    

