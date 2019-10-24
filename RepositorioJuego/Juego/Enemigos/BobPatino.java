package Enemigos;

import javax.swing.ImageIcon;

import Clases.Enemigo;
import Clases.GameObject;

public class BobPatino extends Enemigo {

	public BobPatino(int x, int y) {
		super(x, y);
		dano=300;
		vida=1400;
		monedas=700;
		puntosDeMuerte=1000;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BobCaminaGif.gif")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacar(GameObject e) {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BobAtacaGif.gif")));
		e.disminuirVida(dano);
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BobParado.png")));
		super.parar();
	}

	@Override
	public Enemigo clonar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}
}
