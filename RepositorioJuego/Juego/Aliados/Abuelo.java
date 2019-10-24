package Aliados;
import javax.swing.ImageIcon;

import Clases.Aliado;
import Clases.GameObject;
import Clases.Juego;

public class Abuelo extends Aliado {
	public Abuelo(int x, int y) {
		super(x,y);
		vida=2000;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloParado.png")));
		label.setBounds(x, y,127 , 116);
	}
	
	public void atacar(GameObject e) {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloAtacaGif.gif")));
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloParado.png")));
	}

	@Override
	public void mover() {	}

	@Override
	public void morir() {	
	}
	

}
