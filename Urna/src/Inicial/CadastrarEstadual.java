package Inicial;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Candidatos.Candidato;
import Candidatos.DeputadoEstadual;
public class CadastrarEstadual extends JFrame{
	
	JButton cad;
	JTextField caixaNome, caixaPartido, caixaNumero;
	JLabel nome, partido, numero;
	JButton cadastrar;
	DeputadoEstadual e;
	List<Candidato> listacandidatos = new ArrayList<Candidato>();
	
	public CadastrarEstadual(List<Candidato>estadual){
		super("Cadastrar Deputado Estadual");
		listacandidatos = estadual;
		Container telaest = getContentPane();
		Manipulador objeto = new Manipulador();
		telaest.setLayout(null);
		setSize(300,250);
		setLocationRelativeTo(null);
		setVisible(true);
		
		caixaNome = new JTextField();
		caixaNome.setText("");
		caixaNome.setBounds(80, 10, 120, 30);
		telaest.add(caixaNome);
		
		caixaPartido = new JTextField();
		caixaPartido.setText("");
		caixaPartido.setBounds(80, 50, 50, 30);
		telaest.add(caixaPartido);
		
		caixaNumero = new JTextField();
		caixaNumero.setText("");
		caixaNumero.setBounds(80, 90, 50, 30);
		telaest.add(caixaNumero);
		
		nome = new JLabel("Nome");
		nome.setBounds(20, 10, 50, 30);
		telaest.add(nome);
		
		partido = new JLabel("Partido");
		partido.setBounds(20, 50, 50, 30);
		telaest.add(partido);
		
		numero = new JLabel("Numero");
		numero.setBounds(20, 90, 50, 30);
		telaest.add(numero);
		
		cadastrar = new JButton();
		cadastrar.setText("CADASTRAR");
		cadastrar.addActionListener(objeto);
		cadastrar.setBounds(80, 140, 120, 40);
		telaest.add(cadastrar);
	}
	
	public class Manipulador implements ActionListener{
		public void actionPerformed(ActionEvent evento){
			if(evento.getSource() == cadastrar){
				e = new DeputadoEstadual(caixaNome.getText(), caixaPartido.getText(), Integer.parseInt(caixaNumero.getText()));
				listacandidatos.add(e);	
				dispose();
			}
		}
	}
}
