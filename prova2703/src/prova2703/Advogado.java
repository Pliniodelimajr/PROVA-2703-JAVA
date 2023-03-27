package prova2703;

public class Advogado extends Funcionario{
	
	private String oab;

	public Advogado(int id, String nome, String telefone, String email, Endereco endereco, int idade, Genero genero,
			String cpf, String rg, String matricula, Setor setor, double salario, String oab) {
		super(id, nome, telefone, email, endereco, idade, genero, cpf, rg, matricula, setor, salario);
		this.oab = oab;
	}


	public String getOab() {
		return oab;
	}



	public void setOab(String oab) {
		this.oab = oab;
	}



	public String toString() {

		return "\n\n-------ADVOGADO-------\n\n" + 
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
				"\nCPF: " + super.cpf +
				"\nRG: " + super.rg +
				"\nMatrícula: " + super.matricula +
				"\nSetor: " + super.setor.texto + 
				"\nSalário: R$ " + super.salario +
				"\nOAB: " + this.oab +
				"\n----------------------------------------";
	}

}
