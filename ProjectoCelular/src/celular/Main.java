package celular;

public class Main {
    public static void main(String[] args) {
        // Creamos objetos Celular con distintos parámetros
        Celular celular1 = new Celular(2804, 15693939, 100);
        Celular celular2 = new Celular(351, 15123456, 50);
        Celular celular3 = new Celular(2804, 15233456); // Saldo inicial 0
        Celular celular4 = new Celular(351, 15987654); // Saldo inicial 0

        // Realizamos algunas operaciones con los objetos
        celular1.llamar(2804, 15987654); // Llamada local, saldo decrementado en $20
        celular1.llamar(); // Llama al último número marcado
        celular1.recargar(50); // Recarga con $50
        celular1.recargar(); // Recarga SOS

        celular2.llamar(351, 15678901); // Llamada a otra localidad, saldo decrementado en $45
        celular2.recargar(30); // Recarga con $30

        celular3.llamar(); // Llama al último número marcado
        celular3.recargar(); // Recarga SOS

        celular4.llamar(351, 15876543); // Llamada a otra localidad, saldo decrementado en $45
        // Mostrar el estado de cada celular
        System.out.println("Estado del celular 1:");
        celular1.ver();
        
        System.out.println("\nEstado del celular 2:");
        celular2.ver();
        
        System.out.println("\nEstado del celular 3:");
        celular3.ver();
        
        System.out.println("\nEstado del celular 4:");
        celular4.ver();   
        // Obtener y mostrar todos los celulares existentes
        Celular[] listaDeCelulares = Celular.obtenerListaDeCelulares();
        System.out.println("\nLista de todos los celulares existentes:");
        for (Celular celular : listaDeCelulares) {
            celular.ver();
            System.out.println("--------------------");
        }
    }
}
