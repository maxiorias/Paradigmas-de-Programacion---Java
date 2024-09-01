package HULK;

public class main {
    public static void main(String[] args) {
    	
        // Crear un objeto de la clase Hulk
    	
        Hulk hulk = new Hulk("Bruce Banner", 80, "Normal");

        // Llamar al método saludar
        
        hulk.saludar();  // Salida esperada: "Hola, mi nombre es Bruce Banner"

        // Transformar a Hulk
        
        hulk.transformar();
        hulk.saludar();  // Salida esperada: "Aaaaahg"

        // Obtener el peso después de la transformación
        
        System.out.println("Peso: " + hulk.getPeso());  // Salida esperada: 400

        // Calmar a Hulk
        
        hulk.calmar();
        hulk.saludar();  // Salida esperada: "Hola, mi nombre es Bruce Banner"
        System.out.println("Peso: " + hulk.getPeso());  // Salida esperada: 80
    }
}

