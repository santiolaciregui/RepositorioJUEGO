package Enemigos;

import javax.swing.ImageIcon;

import Clases.Enemigo;
import Clases.GameObject;

public class Barney extends Enemigo {

	public Barney(int x, int y) {
		super(x,y);
		dano=100;
		vida=1300;
		monedas=500;
		puntosDeMuerte=1000;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BarneyCaminaGif.gif")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacar(GameObject e) {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BarneyAtacaGif.gif")));
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BarneyParado.png")));
		super.parar();
	}

	@Override
	public Enemigo clonar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
