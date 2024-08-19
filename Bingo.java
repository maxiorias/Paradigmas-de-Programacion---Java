/********** EQUIPO *************
 * Guadalupe Manquillan
 * Máximiliano Orias
 * Agustín Teresa García
 * Ludmila Pereyra
 * Leonardo Paz
 *
 *
 ********************************/



public class Bingo {
	
	void mainBingo() {
			
		int[] tirada1 = { 29, 43, 88, 36,  65, 80, 18, 87, 38, 17, 71, 7, 19, 48, 52, 59, 79};
		
		int [] tirada2 = {17, 29, 47, 67, 2, 12, 27, 88, 38, 56};
		
		int[][] carton1 = { {21, 38, 40, 50, 80},
							{ 2, 12, 27, 61, 86},
							{ 8, 17, 54, 64, 71}
							};
		
		int[][] carton2 = { {21, 38, 54, 50, 80},
							{ 2, 12, 27, 61, 86},
							{ 8, 17, 40, 64, 71}
				};
		int[][] carton3 = { { 18, 36, 43, 65, 80},
							{ 29, 38, 52, 71, 87},
							{  7, 19, 48, 59, 79}
				};
		int[][] carton4 = { { 11, 32, 44, 62, 73},
							{  8, 25, 38, 56, 80},
							{ 17, 29, 47, 67, 88}
				};
		int[][] carton5 = { { 26, 30, 55, 60, 81},
							{ 11, 37, 48, 76, 87},
							{  2, 19, 49, 69, 77}
				};
		int[][] carton6 = { {  2, 30, 55, 74, 86},
							{ 12, 28, 48, 64, 99},
							{  9, 16, 35, 58, 76}
				};
		int[][] carton7 = { { 4, 14, 38, 41, 86},
							{ 7, 19, 22, 45, 74},
							{25, 48, 57, 67, 78}
				};
		
		boolean mismos;
		mismos = mismosNumeros(carton1, carton2);
		System.out.println("CARTON 1 idem CARTON 2     " + (mismos ? "SI" : "NO") + " => " + (mismos ? "OK!!!" : "FAIL!!!"));
		mismos = mismosNumeros(carton1, carton3);
		System.out.println("CARTON 1 idem CARTON 3     " + (mismos ? "SI" : "NO") + " => " + (mismos ? "OK!!!" : "FAIL!!!"));
		
		boolean valido;
		valido = esValido(carton1);
		System.out.println("CARTON 1 es valido?        " + (valido ? "SI" : "NO") + " => " + (valido ? "OK!!!" : "FAIL!!!"));
		
		//se agregan las llamadas al método esValido para el control de los otros cartones
		valido = esValido(carton2);
		System.out.println("CARTON 2 es valido?        " + (valido ? "SI" : "NO") + " => " + (valido ? "OK!!!" : "FAIL!!!"));
		valido = esValido(carton3);
		System.out.println("CARTON 3 es valido?        " + (valido ? "SI" : "NO") + " => " + (valido ? "OK!!!" : "FAIL!!!"));
		valido = esValido(carton4);
		System.out.println("CARTON 4 es valido?        " + (valido ? "SI" : "NO") + " => " + (valido ? "OK!!!" : "FAIL!!!"));	
		valido = esValido(carton5);
		System.out.println("CARTON 5 es valido?        " + (valido ? "SI" : "NO") + " => " + (valido ? "OK!!!" : "FAIL!!!"));
		valido = esValido(carton6);
		System.out.println("CARTON 6 es valido?        " + (valido ? "SI" : "NO") + " => " + (valido ? "OK!!!" : "FAIL!!!"));
		valido = esValido(carton7);
		System.out.println("CARTON 7 es valido?        " + (valido ? "SI" : "NO") + " => " + (valido ? "OK!!!" : "FAIL!!!"));
		System.out.println();

		boolean hayLinea;
		hayLinea = hayLinea(carton3, tirada2);
		System.out.println("CARTON 3 tiene linea?      " + (hayLinea? "SI" : "NO") + " => " + (hayLinea? "OK!!!" : "FAIL!!!"));

		hayLinea = hayLinea(carton4, tirada2);
		System.out.println("CARTON 4 tiene linea?      " + (hayLinea? "SI" : "NO") + " => " + (hayLinea? "OK!!!" : "FAIL!!!"));
		System.out.println();


		boolean hayBingo;
		hayBingo = hayBingo(carton1, tirada1);
		System.out.println("CARTON 1 tiene bingo?      " + (hayBingo? "SI" : "NO") + " => " + (hayBingo? "OK!!!" : "FAIL!!!"));
	    
		hayBingo = hayBingo(carton2, tirada1);
		System.out.println("CARTON 2 tiene bingo?      " + (hayBingo? "SI" : "NO") + " => " + (hayBingo? "OK!!!" : "FAIL!!!"));
		
		hayBingo = hayBingo(carton3, tirada1);
		System.out.println("CARTON 3 tiene bingo?      " + (hayBingo? "SI" : "NO") + " => " + (hayBingo? "OK!!!" : "FAIL!!!"));

		hayBingo = hayBingo(carton4, tirada1);
		System.out.println("CARTON 4 tiene bingo?      " + (hayBingo? "SI" : "NO") + " => " + (hayBingo? "OK!!!" : "FAIL!!!"));
		hayBingo = hayBingo(carton5, tirada1);
		System.out.println("CARTON 5 tiene bingo?      " + (hayBingo? "SI" : "NO") + " => " + (hayBingo? "OK!!!" : "FAIL!!!"));

		System.out.println();
		

		System.out.println("Los cartones");
		System.out.println("CARTON 1");
		imprimirCarton(carton1);
		System.out.println("CARTON 2");
		imprimirCarton(carton2);
		System.out.println("CARTON 3");
		imprimirCarton(carton3);
		System.out.println("CARTON 4");
		imprimirCarton(carton4);
		System.out.println("CARTON 5");
		imprimirCarton(carton5);
		System.out.println("CARTON 6");
		imprimirCarton(carton6);
		
		//Se agrega el CARTON 7 para impresión
		System.out.println("CARTON 7");
		imprimirCarton(carton7);
				
	}

	/**
	 * Devuelve verdadero si el carton es válido.
	 * Un carton válido está conformado por tres lineas de cinco números.
	 * Debe tener al menos un número de cada decena.
	 * No puede tener más de dos números de cada decena. 
	 * No debe tener números repetidos ni fuera del rango del 1 al 90. 
	 * Tener en cuenta que la octava docena incluye del 80 al 90.
	 * @param carton El carton a analizar
	 * @return Verdadero si el cartón es válido.
	 */
	boolean esValido (int[][] carton) {
		
		boolean cartonValido = true;

		//comprueba si hay más de tres filas
		if (carton.length > 3)
				cartonValido = false;
		
		

		//comrpueba si hay mas de cinco elementos por fila
		for (int elem = 0; elem < carton.length; elem++) {
			if (carton[elem].length > 5) {
				cartonValido = false;
			}
		}
		
		//comprueba que no haya mas de dos números o ninguno por decena
		int[] contarDecena = new int[9];
		int[] contarRepetido = new int[91];
		if (cartonValido) {
			
			for (int i = 0; i < carton.length; i++){
				for (int j = 0; j < carton[i].length; j++){
					if (carton[i][j] < 90) {
						contarDecena[carton[i][j] / 10] += 1;
						contarRepetido[carton[i][j]+1] += 1;
					} else if (carton[i][j] == 90){
						contarDecena[8] += 1;
					} else {
						cartonValido = false;
					}
				}
			}
			
			//Chequea que no haya decenas con cero o mas de dos números
			for (int decena : contarDecena){
				if (decena == 0 || decena > 2) {
					cartonValido = false;
					break;
				}
			}
			
			//Chequea que no haya repetidos entre 1 y 90
			// nR = numero Repetido
			for (int nR = 1; nR < 91; nR++){
				if (contarRepetido[nR] > 1) {
					cartonValido = false;
					break;
				}
				
			}
			
		}
		
		
		return cartonValido;
	}

	/**
	 * 
	 * @param carton1 El primer cartón
	 * @param carton2 El segundo cartón
	 * @return Verdadero si ambos cartones tienen los mismos quince números 
	 */
	boolean mismosNumeros(int[][] carton1, int[][] carton2) {
		int contador = 0;
		boolean sonIguales = false;

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 5; j++ ){
				for(int fila = 0; fila < carton2.length; fila++){
					for (int col = 0; col < carton2[fila].length; col++){
						if (carton1[i][j] == carton2[fila][col]){
							contador++;
						}
					}
				}

			}
		}
		if (contador == 15){
			sonIguales = true;

		}

		return sonIguales;
	}
	
	/**
	 * 
	 * @param carton El carton a verificar.
	 * @param bolillas Las bolillas sorteadas hasta el momento.
	 * @return Verdadero si hay linea.
	 */
	boolean hayLinea(int[][] carton, int[] bolillas) {
		int contador = 0;
		boolean lineaGanadora = false;
		int linea = 0;

		while (linea < 3) {
			
			for (int col = 0; col < 5; col++){
				for (int i = 0; i < bolillas.length; i++){
					if (bolillas[i] == carton[linea][col]){
						contador++;
					}
				}
			}
			
			if (contador == 5){
				lineaGanadora = true;
				
			}
			contador = 0;
			linea++;
		}
		


		return lineaGanadora;
	}

	
	/**
	 * 
	 * @param carton El carton a verificar.
	 * @param bolillas Las bolillas sorteadas hasta el momento.
	 * @return Verdadero si hay bingo.
	 */
	boolean hayBingo(int[][] carton1, int[] bolillas) {
		int contador = 0;
		boolean ganador = false;
		
		for (int i = 0; i < bolillas.length; i++) {
			for (int x = 0; x < carton1.length; x++){
				for (int y = 0; y < carton1[x].length; y++){
					if (bolillas[i] == carton1[x][y]){
						contador++;
					}

				}
			}
		}

		if (contador == 15){
			ganador = true;
		}


		return ganador;
	}

	/**
	 * Imprime el carton en formato de nueve columnas. 
	 * 
	 * @param carton El cartona imprimir
	 */
	public void imprimirCarton(int[][] carton) {
		/*if (!esValido(carton)) {
			System.out.println("Carton invalido");
			return;
		}*/
		int[][] aux = new int [3][9];
		for (int i = 0; i < carton.length; i++) {
			for (int j = 0; j < carton[i].length ; j++) {
				int col = carton[i][j] / 10;
				if (carton[i][j] >= 90)
					col = 8;
				aux[i][col] = carton[i][j];
			}
		}
		
		//for anidado para imprimir cartones
		for (int i =0; i < 3; i++){
			for (int j = 0; j < 9; j++){
				if (aux[i][j] == 0 )
					System.out.printf("    ");
				else
					System.out.printf("%3d ", aux[i][j] );
			}
			System.out.println();
		}
		System.out.println();


		/* 
		for (int[] fila: aux) {
			for (int valor: fila) {
				if (valor == 0 )
					System.out.printf("    ");
				else
					System.out.printf("%3d ", valor );
			}
			System.out.println();
		}
		System.out.println();*/
		
	}
	
	
	// Pronto entenderemos porqué esto tiene esta forma. Paciencia!
	public static void main(String[] args) {
		/*Bingo myBingo = new Bingo();
		myBingo.mainBingo();*/
		new Bingo().mainBingo();
	}
	
}
