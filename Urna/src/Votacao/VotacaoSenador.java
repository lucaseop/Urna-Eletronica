package Votacao;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Candidatos.Candidato;

public class VotacaoSenador extends JFrame{
	
	JButton um, dois, tres, quatro, cinco, seis, sete, oito, nove, zero, branco, corrige, confirma, lista;
	ImageIcon ium, idois, itres, iquatro, icinco, iseis, isete, ioito, inove, izero, ititulo, icorrige, ibranco, iconfirma, irig, idow;
	JLabel titulo, candidato, esquerda, cima, baixo, direita;
	JTextField numero;
	String aux="";
	
	List<Candidato> listacandidados = new ArrayList<Candidato>();
	
	public VotacaoSenador(List<Candidato>senador){
		super("Votação Senador");
		listacandidados = senador;
		Container tela = getContentPane();
		tela.setLayout(null);
		Manipulador objeto = new Manipulador();
		ium = new ImageIcon("src/Votacao/1.jpg");
		idois = new ImageIcon("src/Votacao/2.jpg");
		itres = new ImageIcon("src/Votacao/3.jpg");
		iquatro = new ImageIcon("src/Votacao/4.jpg");
		icinco = new ImageIcon("src/Votacao/5.jpg");
		iseis = new ImageIcon("src/Votacao/6.jpg");
		isete = new ImageIcon("src/Votacao/7.jpg");
		ioito = new ImageIcon("src/Votacao/8.jpg");
		inove = new ImageIcon("src/Votacao/9.jpg");
		izero = new ImageIcon("src/Votacao/0.jpg");
		ititulo = new ImageIcon("src/Votacao/justica.jpg");
		ibranco = new ImageIcon("src/Votacao/branco.gif");
		iconfirma = new ImageIcon("src/Votacao/confirma.gif");
		icorrige = new ImageIcon("src/Votacao/corrige.gif");
		irig = new ImageIcon("src/Votacao/marg1.jpg");
		idow = new ImageIcon("src/Votacao/marg2.jpg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 560);
		setVisible(true);
		
		titulo = new JLabel();
		titulo.setIcon(ititulo);
		titulo.setBounds(350, 10, 375, 100);
		tela.add(titulo);
		candidato = new JLabel();
		candidato.setText("SENADOR(A):");
		candidato.setBounds(85, 120, 200, 50);	
		tela.add(candidato);
		direita = new JLabel();
		direita.setIcon(irig);
		direita.setBounds(70, 100, 5, 150);
		tela.add(direita);
		esquerda = new JLabel();
		esquerda.setIcon(irig);
		esquerda.setBounds(240, 100, 5, 150);
		tela.add(esquerda);
		cima = new JLabel();
		cima.setIcon(idow);
		cima.setBounds(70, 100, 190, 5);
		tela.add(cima);
		baixo = new JLabel();
		baixo.setIcon(idow);
		baixo.setBounds(70, 245, 190, 5);
		tela.add(baixo);		
		numero = new JTextField();
		numero.setBounds(85, 170, 50, 30);
		tela.add(numero);

		um = new JButton();
		um.setIcon(ium);
		um.addActionListener(objeto);
		um.setBounds(400, 120, 75, 52);
		tela.add(um);
		dois = new JButton();
		dois.setIcon(idois);
		dois.addActionListener(objeto);
		dois.setBounds(500, 120, 75, 52);
		tela.add(dois);
		tres = new JButton();
		tres.setIcon(itres);
		tres.addActionListener(objeto);
		tres.setBounds(600, 120, 75, 52);
		tela.add(tres);
		quatro = new JButton();
		quatro.setIcon(iquatro);
		quatro.addActionListener(objeto);
		quatro.setBounds(400, 190, 75, 52);
		tela.add(quatro);
		cinco = new JButton();
		cinco.setIcon(icinco);
		cinco.addActionListener(objeto);
		cinco.setBounds(500, 190, 75, 52);
		tela.add(cinco);
		seis = new JButton();
		seis.setIcon(iseis);
		seis.addActionListener(objeto);
		seis.setBounds(600, 190, 75, 52);
		tela.add(seis);
		sete = new JButton();
		sete.setIcon(isete);
		sete.addActionListener(objeto);
		sete.setBounds(400, 260, 75, 52);
		tela.add(sete);
		oito = new JButton();
		oito.setIcon(ioito);
		oito.addActionListener(objeto);
		oito.setBounds(500, 260, 75, 52);
		tela.add(oito);
		nove = new JButton();
		nove.setIcon(inove);
		nove.addActionListener(objeto);
		nove.setBounds(600, 260, 75, 52);
		tela.add(nove);
		zero = new JButton();
		zero.setIcon(izero);
		zero.addActionListener(objeto);
		zero.setBounds(500, 330, 75, 52);
		tela.add(zero);
		
		branco = new JButton();
		branco.setIcon(ibranco);
		branco.addActionListener(objeto);
		branco.setBounds(350, 420, 120, 58);
		tela.add(branco);
		
		confirma = new JButton();
		confirma.setIcon(iconfirma);
		confirma.addActionListener(objeto);
		confirma.setBounds(610, 408, 120, 70);
		tela.add(confirma);
		
		corrige = new JButton();
		corrige.setIcon(icorrige);
		corrige.addActionListener(objeto);
		corrige.setBounds(480, 420, 120, 58);
		tela.add(corrige);
		
		lista = new JButton();
		lista.setText("LISTA DE CANDIDATOS");
		lista.addActionListener(objeto);
		lista.setBounds(50, 420, 200, 40);
		tela.add(lista);
		
	
	}
	
	public class Manipulador implements ActionListener{
		public void actionPerformed(ActionEvent evento){
			
			if (evento.getSource() == branco) {
				new VotacaoFederal(listacandidados);
				dispose();
			}
			if (evento.getSource() == confirma) {
				for (int i = 0; i < listacandidados.size(); i++) {
					if (listacandidados.get(i).getClass().getName().equals("Candidatos.Senador") == true && Integer.parseInt(numero.getText())==listacandidados.get(i).getNumero()) {
						listacandidados.get(i).incrementaVoto();
						new VotacaoFederal(listacandidados);
						dispose();
					}
				}
			}
			if (evento.getSource() == lista) {
				String tudo ="CANDIDATOS A SENADOR\n";
				for (int i = 0; i < listacandidados.size(); i++) {
					if (listacandidados.get(i).getClass().getName().equals("Candidatos.Senador")==true) {
						tudo = tudo + listacandidados.get(i).dados()+"\n";
					}
				}
				JOptionPane.showMessageDialog(null, tudo);
			}
			if(evento.getSource() == um){
				aux = aux + "1";
				numero.setText(aux);
			}
			if(evento.getSource() == dois){
				aux = aux + "2";
				numero.setText(aux);
			}
			if (evento.getSource() == tres) {
				aux = aux + "3";
				numero.setText(aux);				
			}
			if (evento.getSource() == quatro) {
				aux = aux + "4";
				numero.setText(aux);				
			}
			if (evento.getSource() == cinco) {
				aux = aux + "5";
				numero.setText(aux);
			}
			if (evento.getSource() == seis){
				aux = aux + "6";
				numero.setText(aux);
			}
			if (evento.getSource() == sete) {
				aux = aux + "7";
				numero.setText(aux);
			}
			if (evento.getSource() == oito) {
				aux = aux + "8";
				numero.setText(aux);
			}
			if (evento.getSource() == nove){
				aux = aux + "9";
				numero.setText(aux);
			}
			if (evento.getSource() == zero) {
				aux = aux + "0";
				numero.setText(aux);
			}
			if (evento.getSource() == corrige) {
				aux = "";
				numero.setText(aux);
			}
		}
	}
}
