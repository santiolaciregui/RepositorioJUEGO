package GUI;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class GUI extends JFrame{
	
	public static String titulo = "Los Simpsons";
	public static Dimension size = new Dimension(1400,700);
	private JPanel contentPane;
	private JLabel homer,krusty;
	private JButton homero, marge, lisa, bart, maggie,krtusty;
	
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
		iniciarBotones();
		homero.addMouseListener(new oyenteHomero());
		krtusty.addMouseListener(new oyenteKrus());
	}
	
	public void iniciarBotones() {
		homero=  new JButton();
		krtusty= new JButton();
//		marge=  new JButton();
//		bart=  new JButton();
//		lisa=  new JButton();
//		maggie=  new JButton();
		
//		contentPane.add(marge);
//		contentPane.add(lisa);
//		contentPane.add(maggie);
//		contentPane.add(bart);
		krtusty.setSize(54, 23);
		homero.setSize(54, 12);
		contentPane.add(krtusty);
		contentPane.add(homero);
		repaint();
	}
	
	public void init() {
		setLayout(new GridLayout(15,1,0,0));
		setVisible(true);

	}		
	private class oyenteHomero implements MouseListener{
		
		@Override
		public void mouseClicked(MouseEvent evt) {
			homer= new JLabel();
			homer.setIcon(new ImageIcon(getClass().getResource("/Imagenes/ataquegif.gif")));
			homer.setBounds(100,400+100, 500, 400);
			homer.setLocation(evt.getX(), evt.getY());
			System.out.println("cree una imagen");
			homer.setVisible(true);
			contentPane.add(homer);
			repaint();
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

		private class oyenteKrus implements MouseListener{
			
			@Override
			public void mouseClicked(MouseEvent evt) {
				krusty= new JLabel();
				krusty.setIcon(new ImageIcon(getClass().getResource("/Imagenes/payaso.gif")));
				krusty.setBounds(100,400, 100, 100);
				krusty.setLocation(evt.getX(), evt.getY()+200);
				krusty.setVisible(true);
				contentPane.add(krusty);
				repaint();
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}


	}
	public static void main (String [] args) {
		GUI p = new GUI();
	}

}
