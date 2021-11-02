package Votacao;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Candidatos.Candidato;

public class Resultado extends JFrame{
			
	public Resultado(List<Candidato>listacandidatos){
		int presidente = 0, governador = 0, senador = 0, federal = 0, estadual = 0;
		long vPresidente = 0, vGovernador = 0, vSenador = 0, vFederal = 0, vEstadual = 0;
		String resultados = "Resultado das Eleições:\n";
		
		for (int i = 0; i <listacandidatos.size(); i++) {
			if (listacandidatos.get(i).getClass().getName().equals("Candidatos.Presidente")==true && listacandidatos.get(i).getNumVotos()>vPresidente) {
				presidente = i;
				vPresidente = listacandidatos.get(i).getNumVotos();
			}
			if (listacandidatos.get(i).getClass().getName().equals("Candidatos.Governador")==true && listacandidatos.get(i).getNumVotos()>vGovernador) {
				governador = i;
				vGovernador = listacandidatos.get(i).getNumVotos();
			}
			if (listacandidatos.get(i).getClass().getName().equals("Candidatos.Senador")==true && listacandidatos.get(i).getNumVotos()>vSenador) {
				senador = i;
				vSenador = listacandidatos.get(i).getNumVotos();
			}
			if (listacandidatos.get(i).getClass().getName().equals("Candidatos.DeputadoFederal")==true && listacandidatos.get(i).getNumVotos()>vFederal) {
				federal = i;
				vFederal = listacandidatos.get(i).getNumVotos();
			}
			if (listacandidatos.get(i).getClass().getName().equals("Candidatos.DeputadoEstadual")==true && listacandidatos.get(i).getNumVotos()>vEstadual) {
				estadual = i;
				vEstadual = listacandidatos.get(i).getNumVotos();
			}
		}
		
		resultados += "\nPresidente(a): " + listacandidatos.get(presidente).dados() + "\nNumero de Votos: " + vPresidente;
		resultados += "\n\nGovernador(a): " + listacandidatos.get(governador).dados() + "\nNumero de Votos: " + vGovernador;
		resultados += "\n\nSenador(a): " + listacandidatos.get(senador).dados() + "\nNumero de Votos: " + vSenador;
		resultados += "\n\nDeputado(a) Federal: " + listacandidatos.get(federal).dados() + "\nNumero de Votos: " + vFederal;
		resultados += "\n\nDeputado(a) Estadual: " + listacandidatos.get(estadual).dados() + "\nNumero de Votos: " + vEstadual;
		JOptionPane.showMessageDialog(null, resultados);
		
		
	}

}
