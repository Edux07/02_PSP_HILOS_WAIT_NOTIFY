package _02_PSP_WAIT_NOTIFY;

public class Remitente {
	
	private String nombre;

	public Remitente(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Remitente [nombre=" + nombre + "]";
	}
	
	

}
