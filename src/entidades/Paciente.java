package entidades;

public class Paciente {
	private String nome;
	private int idade;
	
	
	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String toString() {
		return "\nNome: " + nome + "\nIdade: " + idade;
	}
	
	
}
