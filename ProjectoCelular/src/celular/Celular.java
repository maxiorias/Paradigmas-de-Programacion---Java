package celular;

public class Celular {
    private int codigo_Area;
    private int numero;
    private double saldo;
    private int ultimo_numero_marcado;

    private static final int MAX_CELULARES = 5;
    private static Celular[] listaDeCelulares = new Celular[MAX_CELULARES];
    private static int contador = 0;

    // Constructor con todos los parámetros
    public Celular(int codigo_Area, int numero, double saldo) {
        this.codigo_Area = codigo_Area;
        this.numero = numero;
        this.saldo = saldo;
        this.ultimo_numero_marcado = -1; // Inicialmente no hay ningún número marcado
        
        // Agregar el objeto al array de celulares
        if (contador < MAX_CELULARES) {
            listaDeCelulares[contador++] = this;
        } else {
            System.out.println("No se pueden agregar más celulares, se alcanzó el límite.");
        }
    }

    // Constructor con código de área y número, saldo inicializado a 0
    public Celular(int codigo_Area, int numero) {
        this.codigo_Area = codigo_Area;
        this.numero = numero;
        this.saldo = 0; // Si no se proporciona saldo, se inicializa en 0
        this.ultimo_numero_marcado = -1; // Inicialmente no hay ningún número marcado
        
        // Agregar el objeto al array de celulares
        if (contador < MAX_CELULARES) {
            listaDeCelulares[contador++] = this;
        } else {
            System.out.println("No se pueden agregar más celulares, se alcanzó el límite.");
        }
    }

    // Métodos de la clase Celular
    public void llamar(int codigo_Area, int numero) {
        this.ultimo_numero_marcado = numero;
        if (this.codigo_Area == codigo_Area) {
            this.saldo -= 20;
            System.out.println("Llamada local, saldo decrementado en $20.");
        } else {
            this.saldo -= 45;
            System.out.println("Llamada a otra localidad, saldo decrementado en $45.");
        }
    }

    public void llamar() {
        if (this.ultimo_numero_marcado != -1) {
            System.out.println("Llamando al último número marcado: " + this.ultimo_numero_marcado);
        } else {
            System.out.println("No hay un número marcado previamente.");
        }
    }

    public void recargar(double importe) {
        this.saldo += importe;
        System.out.println("Recargado con: $" + importe + ". Saldo actual: $" + this.saldo);
    }

    public void recargar() {
        this.saldo += 200;
        System.out.println("Recarga SOS realizada. Saldo actual: $" + this.saldo);
    }

    public void ver() {
        System.out.println("Código de Área: " + this.codigo_Area);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: $" + this.saldo);
        if (this.ultimo_numero_marcado != -1) {
            System.out.println("Último número marcado: " + this.ultimo_numero_marcado);
        } else {
            System.out.println("No se ha marcado ningún número.");
        }
    }

    // Método estático para obtener la lista de todos los celulares
    public static Celular[] obtenerListaDeCelulares() {
        // Crear un array con el tamaño exacto de los elementos añadidos
        Celular[] celularesActuales = new Celular[contador];
        
        // Copiar manualmente los celulares al nuevo array
        for (int i = 0; i < contador; i++) {
            celularesActuales[i] = listaDeCelulares[i];
        }
        
        return celularesActuales;
    }
}


