package edu.udc.pp.imperativo;

public class Ejemplos {
	
	public static void main(String[] args) {
		
		String s = "Una cadena";
		String s2 = s + " concatenada";
		System.out.println ("La cadena obtenida es: " + s2);
		
		int pinIngresado = 8974;
		boolean cerrado = true;
		int pin = 8974;
		boolean abrir = cerrado && pin == pinIngresado;
		if (abrir) {
			System.out.println ("Abrete Sesamo"); 
		}
		
		int longitud = 25;
		int [] arreglo = new int [longitud];
		char [] otroArreglo = new char [longitud + 3];
		
		int [] naturales = naturalesHasta (6);
		System.out.println ("Los naturales obtenidos son :");
		for (int i = 0; i < naturales.length; i++) {
		    System.out.print(naturales[i] + " ");
		}
		System.out.println();
		
		char[] vocales = {'a', 'e', 'i', 'o', 'u'};
		
		
		int [][] trianguloPascal = { {1}, {1, 1}, {1,2,1}, {1,3,3,1}, {1,4,6,4,1} };

		for (int i = 0; i < trianguloPascal.length; i ++) {
		    for (int j = 0; j < trianguloPascal[i].length; j ++) {
		    	System.out.print(trianguloPascal[i][j] + " ");
		    }
		    System.out.print("\n");
		}
		
		int sumaPares = 0;
		for (int n: naturales) {
			sumaPares += n % 2 == 0 ? n: 0;
		}
		System.out.printf("La suma de los numeros pares menores o iguales que %d es %d\n", naturales[naturales.length - 1], sumaPares );
		

		
		System.out.println ("Los naturales obtenidos son :");
		for (int n : naturales) {
		    System.out.print(n + " ");
		}
		System.out.println();
		
		
	}

	
	
	static int [] naturalesHasta (int tope) {
	    int[] a = new int [tope];
	    for (int i = 1; i <= tope; i++) {
	        a [i -1] = i;
	    }
	    return a;
	}
	
}