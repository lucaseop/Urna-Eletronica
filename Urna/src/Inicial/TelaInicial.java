package Inicial;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Votacao.VotacaoPresidente;
import Candidatos.Candidato;

public class TelaInicial extends JFrame{
	
	List<Candidato> listacandidatos = new ArrayList<Candidato>();
	
	JButton cadPres, cadGov, cadSen, cadDef, cadDee, votar;
	Icon figura;
	JLabel campo;
	
	public TelaInicial(){
		Container tela = getContentPane();
		tela.setLayout(null);
		Manipulador objeto = new Manipulador();
		campo = new JLabel("Tela Inicial");
		figura = new ImageIcon("src/Inicial/urna_eletronica_66.jpg");
		setSize(350, 550);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cadPres = new JButton();
		cadPres.setText("Cadastrar Presidente");
		cadPres.addActionListener(objeto);
	    cadPres.setBounds(60, 10, 210, 50);
		tela.add(cadPres);
		
		cadGov = new JButton();
		cadGov.setText("Cadastrar Governador");
		cadGov.addActionListener(objeto);
		cadGov.setBounds(60, 70, 210, 50);
		tela.add(cadGov);
		
		cadSen = new JButton();
		cadSen.setText("Cadastrar Senador");
		cadSen.addActionListener(objeto);
		cadSen.setBounds(60, 130, 210, 50);
		tela.add(cadSen);
		
		cadDef = new JButton();
		cadDef.setText("Cadastrar Deputado Federal");
		cadDef.addActionListener(objeto);
		cadDef.setBounds(60, 190, 210, 50);
		tela.add(cadDef);
		
		cadDee = new JButton();
		cadDee.setText("Cadastrar Deputado Estadual");
		cadDee.addActionListener(objeto);
		cadDee.setBounds(60, 250, 210, 50);
		tela.add(cadDee);
		
		votar = new JButton();
		votar.setIcon(figura);
		votar.addActionListener(objeto);
		votar.setBounds(60, 350, 200, 117);
		tela.add(votar);
		
		
	}
	
	public static void main(String[] args){
		new TelaInicial();
	}
	
	public class Manipulador implements ActionListener{
		public void actionPerformed(ActionEvent evento){
			if(evento.getSource() == cadPres){
				new CadastrarPresidente(listacandidatos);
			}
			if(evento.getSource() == cadGov){
				new CadastrarGovernador(listacandidatos);				
			}
			if(evento.getSource() == cadSen){
				new CadastrarSenador(listacandidatos);
			}
			if(evento.getSource() == cadDef){
				new CadastrarFederal(listacandidatos);
			}
			if(evento.getSource() == cadDee){
				new CadastrarEstadual(listacandidatos);				
			}
			if(evento.getSource() == votar){
				new VotacaoPresidente(listacandidatos);	
				dispose();
			}
		}
	}
}
