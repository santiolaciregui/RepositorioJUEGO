package Clases;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.ImageIcon;

public class Aliado extends GameObject implements MouseMotionListener{
	protected int monedas;
	protected int cant;

	public Aliado(int x, int y) {
		super(x,y);
		Random r=  new Random();
		cant=r.nextInt(10);
		
	}

	public int obtenercant() {
		return cant;
	}
	@Override
	public void atacar() {}

	@Override
	public void parar() {}

	@Override
	public void mouseDragged(MouseEvent e) {
		setLocation(e.getX(), e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
