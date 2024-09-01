package BARCO;

class BTRANSPORTADOR {
	private String nombre;
    private double calado;
    private double manga;
    private double eslora;
    private double capacidadCarga;
    private double cargaActual;
    private double velocidadCrucero;
    private String estado;

    // Constructor
    public BTRANSPORTADOR(String nombre, double calado, double manga, double eslora, double capacidadCarga, double velocidadCrucero) {
        this.nombre = nombre;
        this.calado = calado;
        this.manga = manga;
        this.eslora = eslora;
        this.capacidadCarga = capacidadCarga;
        this.cargaActual = 0;  // Inicialmente, el barco está vacío
        this.velocidadCrucero = velocidadCrucero;
        this.estado = null;  // El barco puede estar "Atracado en X" o "Navegando hacia X"
    }

    // Métodos
    public void atracarEnPuerto(String puerto) {
        this.estado = "Atracado en el puerto " + puerto;
        System.out.println(nombre + " ha atracado en el puerto " + puerto + ".");
    }

    public void navegarHaciaPuerto(String puerto) {
        this.estado = "Navegando hacia el puerto " + puerto;
        System.out.println(nombre + " está navegando hacia el puerto " + puerto + ".");
    }

    public void cargar(double cantidad) {
        if (estado != null && estado.contains("Atracado")) {
            if (cargaActual + cantidad <= capacidadCarga) {
                cargaActual += cantidad;
                System.out.println(cantidad + " toneladas de carga han sido cargadas. Carga actual: " + cargaActual + " toneladas.");
            } else {
                System.out.println("No se puede cargar, sobrepasaría la capacidad máxima del barco.");
            }
        } else {
            System.out.println("El barco debe estar atracado en un puerto para cargar.");
        }
    }

    public void descargar(double cantidad) {
        if (estado != null && estado.contains("Atracado")) {
            if (cargaActual >= cantidad) {
                cargaActual -= cantidad;
                System.out.println(cantidad + " toneladas de carga han sido descargadas. Carga actual: " + cargaActual + " toneladas.");
            } else {
                System.out.println("No se puede descargar, la cantidad es mayor a la carga actual.");
            }
        } else {
            System.out.println("El barco debe estar atracado en un puerto para descargar.");
        }
    }

       
    public static void main(String[] args) {
        // Crear un barco transportador de granos
        BTRANSPORTADOR barco = new BTRANSPORTADOR("TUDS", 12.5, 20, 180, 50000, 25);

        // Atracar en un puerto
        barco.atracarEnPuerto("Puerto Madryn");

        // Cargar el barco
        barco.cargar(20000);

        // Navegar hacia otro puerto
        barco.navegarHaciaPuerto("Buenos Aires");


        // Intentar descargar mientras navega (no funcionará)
        barco.descargar(10000);

        // Atracar en un nuevo puerto y descargar
        barco.atracarEnPuerto("Buenos Aires");
        barco.descargar(10000);
    }

}
