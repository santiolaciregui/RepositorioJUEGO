package Enemigos;

import javax.swing.ImageIcon;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.GameObject;
import Estados.EnemigoNormal;

public class Apu extends Enemigo {

	public Apu(int x, int y) {
		super(x,y);
		dano=200;
		vida=1000;
		monedas=500;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/ApuCaminaGif.gif")));
		label.setBounds(x, y,117 , 110);
		estado = new EnemigoNormal(this);
	}
	
	public void atacar(Aliado a) {
		super.atacar(a);
	}		
		
	public void mover() {
		super.mover();
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/ApuCaminaGif.gif")));
	}
	
	public void atacar(GameObject e) {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/ApuAtacaGif.gif")));
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/ApuParado.png")));
	}

	@Override
	public Enemigo clonar() {
		Enemigo clone= new Apu(0,0);
		return clone;
	}

	@Override
	public void cambiarLabel() {	}

}
