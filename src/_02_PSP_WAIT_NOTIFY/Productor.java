package _02_PSP_WAIT_NOTIFY;

public class Productor extends Thread  {
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
			String mensaje = nombre + " - " + i;
			emailBuffer.addCola(new Email(i, "receptor" + i + "@gmail.com", new Remitente("emisor" + i + "@gmail.com"),
					"Asunto " + i, "cuerpo de mensaje " + i), mensaje);
			if (i == 9) {
				emailBuffer.addCola(new Email(i, "receptor" + i + "@gmail.com", new Remitente("pikachu@gmail.com"),
						"Asunto " + i, "cuerpo de mensaje " + i), mensaje);			}
		}

	}

}
