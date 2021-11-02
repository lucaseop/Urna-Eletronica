package Candidatos;

public class Senador extends Candidato{
	
	private int numero;
	private static int limite = 222;
	
	public Senador(String nome, String partido, int numero){
		super(nome, partido);
		setNumero(numero);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero>=100 && numero<=999) {
			this.numero = numero;			
		}
		else{
			this.numero = limite;
			limite++;
		}
	}
	
	public String dados(){
		return getNumero() + " - " + getPartido() + " - " + getNome();
	}
}
