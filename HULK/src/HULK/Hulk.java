package HULK;

public class Hulk {
    private int peso;                    // Inicializo sus atributos
    private String colorPiel;            
    private String transformacion;       
    private String nombre;               
    
    // Constructor
    public Hulk(String nombre, int peso, String colorPiel) { 
        this.nombre = nombre;            // Le asigno a sus atributos los parámetros
        this.peso = peso;                
        this.colorPiel = colorPiel;      
        this.transformacion = "Humano";  // Inicialmente es "Humano"
    }

    // Método para transformar a Hulk
    public void transformar() {
        this.peso *= 5;
        this.colorPiel = "Verde";
        this.transformacion = "Hulk";
        System.out.println("Hulk se ha transformado. Ahora es de color " + colorPiel + " y pesa " + peso + " kg.");
    }

    // Método para calmar a Hulk
    public void calmar() {
        this.peso /= 5;
        this.colorPiel = "Normal";
        this.transformacion = "Humano";
        System.out.println("Hulk se ha calmado. Ahora su color de piel es " + colorPiel + " y pesa " + peso + " kg.");
    }

    // Método para saludar
    public void saludar() {
        if(this.transformacion.equals("Humano")) {
            System.out.println("Hola, mi nombre es " + nombre + ". Mi color de piel es " + colorPiel + " y peso " + peso + " kg.");
        } else {
            System.out.println("Aaaaahg, soy " + transformacion + ". Mi color de piel es " + colorPiel + " y peso " + peso + " kg.");
        }
    }

    // Getters
    public int getPeso() {
        return peso;
    }

    public String getColorPiel() {
        return colorPiel;
    }
}

