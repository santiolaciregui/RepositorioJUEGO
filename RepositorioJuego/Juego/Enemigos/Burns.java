package Enemigos;

import javax.swing.ImageIcon;

import Clases.Enemigo;
import Clases.GameObject;

public class Burns extends Enemigo {

	public Burns(int x, int y) {
		super(x, y);
		dano=800;
		vida=2000;
		monedas=1000;
		puntosDeMuerte=2000;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BurnsCaminaGif.gif")));
		label.setBounds(x, y,140 , 140);
	}
	
	public void atacar(GameObject e) {
		super.atacar(e);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BurnsAtacaGif.gif")));
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BurnsParado.png")));
	
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
