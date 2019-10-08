package Enemigos;

import javax.swing.ImageIcon;

import Clases.Enemigo;

public class Flanders extends Enemigo  {

	public Flanders(int x, int y) {
		super(x, y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersParado.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacarGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersAtacaGif.gif")));
	}
	
	public void pararGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersParado.png")));
	}
	
	public void acaestoy() {
		System.out.println(label.getX()+"  :  "+label.getY());
	}

	@Override
	public Enemigo clonar() {
		// TODO Auto-generated method stub
		return null;
	}
	

}