package Candidatos;

public class Governador extends Candidato{
	
	private int numero;
	private static int limite = 22;
	
	public Governador(String nome, String partido, int numero){
		super(nome, partido);
		setNumero(numero);		
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		if (numero>=10 && numero<=99) {
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
