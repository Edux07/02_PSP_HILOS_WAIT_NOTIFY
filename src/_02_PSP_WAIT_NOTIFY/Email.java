package _02_PSP_WAIT_NOTIFY;

public class Email {
	int Id;
	Destinatario Destinatario;
	Remitente Remitente;
	private String Asunto;
	private String CuerpoMensaje;

	public Email(int Id, Destinatario destinatario, Remitente remitente, String Asunto, String CuerpoMensaje) {
		this.Asunto = Asunto;
		this.CuerpoMensaje = CuerpoMensaje;
		this.Destinatario = destinatario;
		this.Id = Id;
		this.Remitente = remitente;
	}

	public void generarEmail() {
		
		
		
	}

}
