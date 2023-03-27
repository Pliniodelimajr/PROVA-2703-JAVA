package prova2703;

public class Medico extends Funcionario{
	
	private String crm;
	
	public Medico(int id, String nome, String telefone, String email, Endereco endereco, int idade, Genero genero,
			String cpf, String rg, String matricula, Setor setor, double salario, String crm) {
		super(id, nome, telefone, email, endereco, idade, genero, cpf, rg, matricula, setor, salario);
		this.crm = crm;
	}


	public String getCrm() {
		return crm;
	}



	public void setCrm(String crm) {
		this.crm = crm;
	}


	public String toString() {

		return "\n\n-------MÉDICO-------\n\n" + 
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
				"\nCRM: " + this.crm +
				"\n----------------------------------------";
	}


}
