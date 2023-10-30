package _02_PSP_WAIT_NOTIFY;

public class Email {
	int Id;
	String Destinatario;
	Remitente Remitente;
	private String Asunto;
	private String CuerpoMensaje;

	public Email(int Id, String destinatario, Remitente remitente, String Asunto, String CuerpoMensaje) {
		this.Asunto = Asunto;
		this.CuerpoMensaje = CuerpoMensaje;
		this.Destinatario = destinatario;
		this.Id = Id;
		this.Remitente = remitente;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getDestinatario() {
		return Destinatario;
	}

	public void setDestinatario(String destinatario) {
		Destinatario = destinatario;
	}

	public Remitente getRemitente() {
		return Remitente;
	}

	public void setRemitente(Remitente remitente) {
		Remitente = remitente;
	}

	public String getAsunto() {
		return Asunto;
	}

	public void setAsunto(String asunto) {
		Asunto = asunto;
	}

	public String getCuerpoMensaje() {
		return CuerpoMensaje;
	}

	public void setCuerpoMensaje(String cuerpoMensaje) {
		CuerpoMensaje = cuerpoMensaje;
	}

	@Override
	public String toString() {
		return "Email [Id=" + Id + ", Destinatario=" + Destinatario + ", Remitente=" + Remitente + ", Asunto=" + Asunto
				+ ", CuerpoMensaje=" + CuerpoMensaje + "]";
	}
	

}
