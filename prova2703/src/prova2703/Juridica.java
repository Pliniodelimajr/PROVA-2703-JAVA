package prova2703;

public class Juridica extends Pessoa {
	
	protected String cnpj;
	protected String inscricaoEstadual;
	
	public Juridica(int id, String nome, String telefone, String email, Endereco endereco, String cnpj,
			String inscricaoEstadual) {
		super(id, nome, telefone, email, endereco);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	

	public String toString() {

		return "\n\n-------EMPRESA-------\n\n" + 
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
				"\nCNPJ: " + this.cnpj +
				"\nInscrição Estadual: " + this.inscricaoEstadual +
				"\n----------------------------------------";
			
	}
}
