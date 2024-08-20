package cocina;

import clasesheladera.Alimento;
import clasesheladera.Heladera;

public class UsarHeladera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Heladera h = new Heladera();
		
		Alimento a= new Alimento("Milanesa", "5 unidades");
		
		h.meter(a);
		
		h.meter(new Alimento("Puré", "Una bandeja"));
		
		a = h.sacar("Puré");
		
		if (a == null) {
			System.out.println("No sque nada");
		} else {
			System.out.println(a.getNombre() + " " + a.getCantidad());
		}
		
		
		
		
		
		
		
		
	}

}
