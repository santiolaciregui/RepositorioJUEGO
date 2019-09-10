package GUI;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class GUI extends JFrame{
	
	public static String titulo = "Los Simpsons";
	public static Dimension size = new Dimension(1400,700);
	private JPanel contentPane;
	private JLabel homer;
	private JButton homero, marge, lisa, bart, maggie;
	
	public GUI() {
		contentPane = new JPanelConFondo(new ImageIcon(getClass().getResource("/Imagenes/estas-aqui-inicio-3d-comunidad-simpsons.jpg")).getImage());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(2,2,2,2));
		setTitle(titulo);
		setSize(size);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		init();
	}
	
	public void iniciarBotones() {
		homero=  new JButton();
		marge=  new JButton();
		bart=  new JButton();
		lisa=  new JButton();
		maggie=  new JButton();
		contentPane.add(homero);
		contentPane.add(marge);
		contentPane.add(lisa);
		contentPane.add(maggie);
		contentPane.add(bart);
		homero.setBorder(new LineBorder(Color.GREEN);
		homero.setSize(121, 121);
		homero.addActionListener(new oyenteHomero());
		homero.setVisible(true);
		homero.setHorizontalAlignment(211);
		homero.setVerticalAlignment(321);
		repaint();
	}
	
	public void init() {
		setLayout(new GridLayout(15,1,0,0));
		setVisible(true);

	}		
	private class oyenteHomero implements ActionListener{
		public void actionPerformed(MouseEvent evt) {	
			homer= new JLabel();
			homer.setIcon(new ImageIcon(getClass().getResource("/Imagenes/parado.png")));
			homer.setPreferredSize(getMaximumSize());
			homer.setLocation(evt.getX(), evt.getY());
			repaint();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	public static void main (String [] args) {
		GUI p = new GUI();
	}

}
