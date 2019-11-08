package Aliados;
import javax.swing.ImageIcon;

import Clases.Aliado;
import Clases.GameObject;

public class Marge extends Aliado {

	public Marge(int x, int y) {
		super(x,y);
		vida=2000;
		dano=200;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeParada.png")));
		label.setBounds(x, y,117 , 110);
		precio = 1000;
		monedas = precio;
	}
	
	public void atacar(GameObject e) {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeAtacaGif.gif")));
		super.atacar(e);
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeParada.png")));
	}

	@Override
	public void mover() {

		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeParada.png")));
	}

	public void cambiarLabel() {
		if(dano>200)
			label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeAtacaMejoradaGif.gif")));
		else
			if(dano==200)
				label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeAtacaGif.gif")));
	}
}
