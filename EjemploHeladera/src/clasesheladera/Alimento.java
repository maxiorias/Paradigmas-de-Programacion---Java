package clasesheladera;

public class Alimento {
	
	private String nombre;
	private String cantidad;
	
	
	public Alimento(String nombre, String cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	public String getCantidad() {
		return cantidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
}
