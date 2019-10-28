package Enemigos;

import javax.swing.ImageIcon;


import Clases.Enemigo;
import Clases.GameObject;
import Clases.Juego;

public class Flanders extends Enemigo  {

	public Flanders(int x, int y) {
		super(x, y);
		dano=30;
		vida=1100;
		monedas=700;
		puntosDeMuerte=1300;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersCaminaGif.gif")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void mover() {
		super.mover();
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersCaminaGif.gif")));
	}
	public void atacar(GameObject e) {
		super.atacar(e);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersAtacaGif.gif")));
		e.disminuirVida(dano);
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersParado.png")));
		
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