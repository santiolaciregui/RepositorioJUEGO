package Enemigos;

import javax.swing.ImageIcon;

import Clases.Enemigo;
import Clases.GameObject;
import Estados.EnemigoNormal;

public class BobPatino extends Enemigo {
	public BobPatino(int x, int y) {
		super(x, y);
		dano=300;
		vida=1400;
		monedas=700;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BobCaminaGif.gif")));
		label.setBounds(x, y,117 , 110);
		estado = new EnemigoNormal(this);
	}
	
	public void mover() {
		super.mover();
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BobCaminaGif.gif")));
	}
	public void atacar(GameObject e) {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BobAtacaGif.gif")));
		super.atacar(e);
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BobParado.png")));
	}

	@Override
	public Enemigo clonar() {
		return new BobPatino(0,0);
	}

	@Override
	public void cambiarLabel() {	}
}
