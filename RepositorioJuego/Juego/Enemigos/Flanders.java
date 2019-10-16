package Enemigos;

import javax.swing.ImageIcon;

import Clases.Enemigo;

public class Flanders extends Enemigo  {

	public Flanders(int x, int y) {
		super(x, y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersAtacaGif.gif")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersAtacaGif.gif")));
	}
	
	public void parar() {
		super.parar();
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersParado.png")));
	}

	@Override
	public Enemigo clonar() {
		// TODO Auto-generated method stub
		return null;
	}
	

}