package _02_PSP_WAIT_NOTIFY;

import java.util.LinkedList;
import java.util.Queue;

public class Consumidor extends Thread {
	public String nombre;
	public EmailBuffer EmailBuffer;
	private Queue<Email> buffer ;

	public Consumidor(String nombre,  EmailBuffer EmailBuffer) {
		super();
		this.nombre = nombre;
		this.EmailBuffer = EmailBuffer;
		buffer = new LinkedList<>();
	}
	@Override
	public void run() {
		while (true) {
			Email mensaje = EmailBuffer.LeerEmail();
			
			buffer.add(mensaje);
			System.out.println(nombre + " ha consumido el mensaje: " + mensaje);
		}
	}


}
