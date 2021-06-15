package modelo;

public class DadosPessoais {
	
	private final String nomePersongem;
	private int idade;
	private double peso;
	private double altura;
	private int massaCorporal;
	

	public DadosPessoais(String nomePersongem, int idade, double peso, double altura, 
			int massaCorporal) {
		this.nomePersongem = nomePersongem;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.massaCorporal = massaCorporal;
	}
}
