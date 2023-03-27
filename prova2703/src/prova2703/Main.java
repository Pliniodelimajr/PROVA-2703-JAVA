package prova2703;

public class Main {

	public static void main(String[] args) {
		
		Advogado Adv1 = new Advogado(852, "Plínio", "992491040", "plinio212@gmail.com", new Endereco("Rua 15", "57", "casa", "40415115", "Salvador", UnidadeFederativa.BAHIA), 25, Genero.MASCULINO, "06565227551", "1496161556", "02188734", Setor.JURIDICO, 8000, "963258");
		Medico Med1 = new Medico(852, "Plínio", "992491040", "plinio212@gmail.com", new Endereco("Rua 15", "57", "casa", "40415115", "Salvador", UnidadeFederativa.BAHIA), 25, Genero.MASCULINO, "06565227551", "1496161556", "02188734", Setor.SAUDE, 8000, "963258");
		Engenheiro Eng1 = new Engenheiro(852, "Plínio", "992491040", "plinio212@gmail.com", new Endereco("Rua 15", "57", "casa", "40415115", "Salvador", UnidadeFederativa.BAHIA), 25, Genero.MASCULINO, "06565227551", "1496161556", "02188734", Setor.ENGENHARIA, 8000, "963258");
		Cliente Cliente1 = new Cliente(852, "Plínio", "992491040", "plinio212@gmail.com", new Endereco("Rua 15", "57", "Casa", "40415115", "Salvador", UnidadeFederativa.BAHIA), 25, Genero.MASCULINO, 98657);
		Juridica Empresa1 = new Juridica(121, "Plínio", "992491040", "plinio212@gmail.com", new Endereco("Rua 15", "57", "40415115", "casa", "Salvador", UnidadeFederativa.BAHIA), "55564"	, "55587");
		
		System.out.println(Adv1.toString());
		System.out.println(Med1.toString());
		System.out.println(Eng1.toString());
		System.out.println(Cliente1.toString());
		System.out.println(Empresa1.toString());
	}
}
