package Clases;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;

public class Aliado extends GameObject implements MouseMotionListener{
	protected int monedas;

	public Aliado(int x, int y) {
		super(x,y);
		altura=70;
		ancho=40;
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		this.setLocation(e.getXOnScreen()-200, e.getYOnScreen()-235);
		this.setVisible(true);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
