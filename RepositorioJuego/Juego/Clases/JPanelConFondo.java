package Clases;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelConFondo extends JPanel {

	private Image imagen = new ImageIcon(this.getClass().getResource("/Imagenes/menuFondo.png")).getImage();
	
	public void paint(Graphics g) {
		 g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
	     setOpaque(false);
	     super.paint(g);
	}
}
