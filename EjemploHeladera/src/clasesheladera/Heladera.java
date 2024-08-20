package clasesheladera;

import java.awt.image.renderable.ContextualRenderedImageFactory;

public class Heladera {

	
	private int capacidad = 20;
	private boolean encendida = false;
	private boolean conCongelador = true;
	private boolean puertaCerrada = true;
	private Alimento[] contenido = new Alimento[capacidad];

	
	
	public boolean meter (Alimento alimento) {
		if (capacidad ==0) {
			System.out.println("No hay Lugar");
			return false;
		}
		if (puertaCerrada ) {
			System.out.println("Abri ña puerta!!!");
			return false;
		}
		if (! encendida) {
			System.out.println("Hay que enchufar");
		
			return false;
		}
		
		//meter el alimento en el arreglo
		//dismunir capacidad
		this.capacidad--;
		
		for (int i = 0; i < contenido.length;i++) {
			if (contenido[i]==null) {
				contenido[i] = alimento;
				return true;
			}
		}
		return false;
		
		
	}
	
	public Alimento sacar (String nombreAlimento) {
		for (int i = 0; i < contenido.length;i++) {
			if (contenido[i]!= null && contenido[i].getNombre().equals(nombreAlimento)) {
				this.capacidad ++;
				Alimento a = contenido[i];
				contenido[i] = null;
				return a;
			}
		}
		return null;
	}
}
