package Enemigos;

import javax.swing.ImageIcon;

import Clases.Enemigo;

public class Barney extends Enemigo {

	public Barney(int x, int y) {
		super(x,y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BarneyAtacaGif.gif")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacarGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BarneyAtacaGif.gif")));
	}
	
	public void pararGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BarneyParado.png")));
		inteligencia.parar();
	}

	@Override
	public Enemigo clonar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
