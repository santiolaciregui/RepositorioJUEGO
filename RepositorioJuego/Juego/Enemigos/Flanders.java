package Enemigos;

import javax.swing.ImageIcon;


import Clases.Enemigo;
import Clases.GameObject;
import Clases.Juego;

public class Flanders extends Enemigo  {

	public Flanders(int x, int y) {
		super(x, y);
		dano=300;
		vida=1100;
		monedas=700;
		puntosDeMuerte=1300;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersCaminaGif.gif")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacar(GameObject e) {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersAtacaGif.gif")));
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersParado.png")));
		super.parar();
	}

	@Override
	public Enemigo clonar() {
		// TODO Auto-generated method stub
		return null;
	}
	

}