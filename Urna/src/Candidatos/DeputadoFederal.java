package Candidatos;

public class DeputadoFederal extends Candidato{
	
	private int numero;
	private static int limite = 3006;
	
	public DeputadoFederal(String nome, String partido, int numero){
		super(nome, partido);
		setNumero(numero);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero>=1000 && numero<=9999) {
			this.numero = numero;			
		}
		else{
			this.numero = limite;
			limite--;
		}
	}
	
	public String dados(){
		return getNumero() + " - " + getPartido() + " - " + getNome();
	}
}
