package prova2703;

public enum Setor {
		
	ENGENHARIA ("Engenharia"),
	SAUDE ("Saúde"),
	JURIDICO ("Jurídico");
	
	protected String texto;

	private Setor(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	
	
	
}
