package Candidatos;

public class DeputadoEstadual extends Candidato{
	
	private int numero;
	private static int limite = 30006;
	
	public DeputadoEstadual(String nome, String partido, int numero){
		super(nome, partido);
		setNumero(numero);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero>=10000 && numero<=99999) {
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
