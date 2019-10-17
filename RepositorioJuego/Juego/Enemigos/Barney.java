package Enemigos;

import javax.swing.ImageIcon;

import Clases.Enemigo;

public class Barney extends Enemigo {

	public Barney(int x, int y) {
		super(x,y);
		dano=100;
		vida=1300;
		monedas=500;
		puntosDeMuerte=1000;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BarneyAtacaGif.gif")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacarGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BarneyAtacaGif.gif")));
	}
	
	public void pararGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BarneyParado.png")));
		super.parar();
	}

	@Override
	public Enemigo clonar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
