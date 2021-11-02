package Candidatos;

public abstract class Candidato {
	
	String nome;
	String partido;
	long numVotos;
	public Candidato(String nome,String partido) {
		this.nome = nome;
		this.partido = partido;
		numVotos = 0;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public long getNumVotos() {
		return numVotos;
	}
	public void incrementaVoto(){
		numVotos++;
	}
	
	public abstract String dados();
	public abstract int getNumero();
}
