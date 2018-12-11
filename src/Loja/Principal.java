package Loja;

import java.awt.Color;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Principal extends JFrame implements ActionListener {
	
	JButton inserirPagamento = new JButton("INCLUIR PAGAMENTO");
	JLabel ini = new JLabel("Bem vindo!");
	ImageIcon fundo = new ImageIcon(getClass().getResource("Tela inicial.png"));

	public Principal() {

		Container cont = this.getContentPane();
		cont.setLayout(null);
		
		inserirPagamento.setBackground(Color.green);
		inserirPagamento.setBounds(300, 200, 200, 50);
		inserirPagamento.addActionListener(this);
		
		ini.setBounds(0, 0, 800, 600);
		
		ini.setIcon(fundo);
		cont.add(ini);
		cont.add(inserirPagamento);
		

		setSize(800, 600);
		setTitle("Loja");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		Principal janela = new Principal();
		janela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == inserirPagamento) {
			IncluirPagamento temp = new IncluirPagamento();
			temp.setVisible(true);
		}
	}
}
