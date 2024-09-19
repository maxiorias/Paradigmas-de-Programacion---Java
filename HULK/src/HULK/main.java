package HULK;

public class main {
    public static void main(String[] args) {
    	
    	   // Crear objetos de la clase Hulk
        Hulk hulk1 = new Hulk("Bruce Banner", 80, "Normal");
        Hulk hulk2 = new Hulk("Otro Hulk", 90, "Normal");
        Hulk hulk3 = new Hulk("Tercer Hulk", 100, "Normal");

        // Transformar a los hulks en diferentes momentos
        hulk1.transformar(); // Hulk 1 se enoja
        hulk1.transformar(); // Hulk 1 se enoja de nuevo
        hulk1.transformar(); // Hulk 1 se enoja otra vez

        hulk3.transformar(); // Hulk 3 se enoja

       
        System.out.println("Promedio de enojos: " + Hulk.getPromedioEnojos());  // Salida
    }
}

