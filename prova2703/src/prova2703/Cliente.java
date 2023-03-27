package prova2703;

public class Cliente extends Fisica{
	
	private int protocoloAtendimento;

	public Cliente(int id, String nome, String telefone, String email, Endereco endereco, int idade, Genero genero,
			int protocoloAtendimento) {
		super(id, nome, telefone, email, endereco, idade, genero);
		this.protocoloAtendimento = protocoloAtendimento;
	}

	public int getProtocoloAtendimento() {
		return protocoloAtendimento;
	}

	public void setProtocoloAtendimento(int protocoloAtendimento) {
		this.protocoloAtendimento = protocoloAtendimento;
	}
	
	public String toString() {

		return "\n\n-------CLIENTE-------\n\n" + 
				"\nID: " + super.id +
				"\nNome: " + super.nome +
				"\nTelefone: " + super.telefone +
				"\nEmail: " + super.email +
				"\n\nEndereço:\n " + 
				"\nLogradouro: " + super.endereco.logradouro +
				"\nNúmero: " + super.endereco.numero +
				"\nComplemento: " +super.endereco.complemento +
				"\nCEP: " + super.endereco.cep +
				"\nCidade: " + super.endereco.cidade +
				"\nEstado: " + super.endereco.uf +
				"\nIdade: " + super.idade +
				"\nGenero: " + super.genero.texto +
				"\nProtocolo de Atendimento: " + this.protocoloAtendimento +
				"\n----------------------------------------";
			
	}


}
