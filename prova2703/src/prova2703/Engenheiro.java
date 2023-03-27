package prova2703;

public class Engenheiro extends Funcionario{
	
	private String crea;

	
	public Engenheiro(int id, String nome, String telefone, String email, Endereco endereco, int idade, Genero genero,
			String cpf, String rg, String matricula, Setor setor, double salario, String crea) {
		super(id, nome, telefone, email, endereco, idade, genero, cpf, rg, matricula, setor, salario);
		this.crea = crea;
	}



	public String getCrea() {
		return crea;
	}


	public void setCrea(String crea) {
		this.crea = crea;
	}


	public String toString() {

		return "\n\n-------ENGENHEIRO-------\n\n" + 
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
				"\nCREA: " + this.crea +
				"\n----------------------------------------";
	}

}
