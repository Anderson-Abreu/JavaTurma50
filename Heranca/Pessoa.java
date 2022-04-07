package Heranca;

public class Pessoa {
	
	protected String nome;
	private int idade;
	private String sexo;
	
	public void aniversario()
	{
		this.idade++;//this.idade=this.idade+1
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
