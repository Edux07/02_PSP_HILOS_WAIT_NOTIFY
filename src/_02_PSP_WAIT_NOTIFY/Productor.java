package _02_PSP_WAIT_NOTIFY;

public class Productor implements Runnable {
	public String nombre;
	public EmailBuffer emailBuffer;

	public Productor(String nombre, EmailBuffer emailBuffer) {
		super();
		this.nombre = nombre;
		this.emailBuffer = emailBuffer;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			String mensaje = nombre + " - " + i;// Productor 1 - 1
			//emailBuffer.addEmail(mensaje);;
		}
		
	}

}
