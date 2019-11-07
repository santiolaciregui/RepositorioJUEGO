package Enemigos;

import javax.swing.ImageIcon;

import Clases.Enemigo;
import Clases.GameObject;
import Colisionadores.Visitor;

public class Barney extends Enemigo {

	public Barney( int x, int y) {
		super(x,y);
		dano=100;
		vida=1300;
		monedas=500;
		puntosDeMuerte=1000;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BarneyCaminaGif.gif")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void mover() {
		super.mover();
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BarneyCaminaGif.gif")));
	}
	public void atacar(GameObject e) {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BarneyAtacaGif.gif")));
		
	}
	
	public void parar() {
		super.parar();
	}

	@Override
	public Enemigo clonar() {
		Enemigo clone= new Barney(0,0);
		setearValoresClone(clone);
		return clone;
	}

	@Override
	public void cambiarLabel() {	}
}
