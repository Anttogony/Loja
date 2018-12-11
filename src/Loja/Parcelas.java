package Loja;

import java.awt.Color;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Parcelas extends JFrame implements ActionListener {
	
	JButton buscar = new JButton("pagar");
	JLabel ini = new JLabel("Bem vindo!");
	ImageIcon fundo = new ImageIcon(getClass().getResource("Tela inicial menor.png"));

	public Parcelas() {

		Container cont = this.getContentPane();
		cont.setLayout(null);
		
		 //buscar.setBackground(Color.green);
		 buscar.setBounds(150, 100, 80, 35);
		 buscar.addActionListener(this);
		
		ini.setBounds(0, 0, 400, 200);
		
		//ini.setIcon(fundo);
		cont.add(ini);
		cont.add(buscar);
		

		setSize(600, 450);
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
		if (evento.getSource() ==  buscar) {
			setVisible(false);
		}
	}
}