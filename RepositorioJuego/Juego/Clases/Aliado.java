package Clases;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.ImageIcon;

public class Aliado extends GameObject{
	protected int monedas;
	protected int cant;

	public Aliado(int x, int y) {
		super(x,y);
		altura=70;
		ancho=40;
		Random r=  new Random();
		cant=r.nextInt(10);
		
	}

	public int obtenercant() {
		return cant;
	}
	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parar() {		
	}
	
}
