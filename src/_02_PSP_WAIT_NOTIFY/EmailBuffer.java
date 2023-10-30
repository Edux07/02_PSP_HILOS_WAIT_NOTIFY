package _02_PSP_WAIT_NOTIFY;

import java.util.*;

public class EmailBuffer {
	private Queue<Email> buffer ;
	public final static int MAX_ELEMENTOS = 5;
	Email email;
	String nombreProduc;

	public EmailBuffer(Email email, String nombreProduc) {
		super();
		this.email = email;
		this.nombreProduc = nombreProduc;
		buffer = new LinkedList<>();
	}

	public synchronized void addCola(Email email, String nombreProductor) {
		while (buffer.size() >= MAX_ELEMENTOS) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (email.getRemitente().getNombre().equalsIgnoreCase("pikachu@gmail.com")) {
			System.out.println("Descartando email a pikachu@gmail.com");
		} else {
			buffer.add(email);
			System.out.println(
					nombreProductor + " ha depositado el email" + "Que tiene la ID" + email.Id + " en el buffer.");
		}
		notify();
	}

	public synchronized Email LeerEmail() {
		while (buffer.size() == 0) {// 3
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		// Añadimos un elemento a la cola

		// Despertamos a un hilo que esté en estado 'wait'
		notify();
		
		return buffer.poll();
	}


}
