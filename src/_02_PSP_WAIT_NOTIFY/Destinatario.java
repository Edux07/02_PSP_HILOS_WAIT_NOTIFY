package _02_PSP_WAIT_NOTIFY;

public class Destinatario implements Runnable {
	public String nombre;
	public EmailBuffer EmailBuffer;

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			//String mensaje = EmailBuffer.addCola();
			//System.out.println(nombre + " ha consumido el mensaje: " + mensaje);
		}
	}

	public Destinatario(String nombre,  EmailBuffer EmailBuffer) {
		super();
		this.nombre = nombre;
		this.EmailBuffer = EmailBuffer;
	}

}
