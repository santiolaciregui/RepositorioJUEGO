package Aliados;
import javax.swing.ImageIcon;

import Clases.Aliado;
import Clases.GameObject;

public class Bart extends Aliado {

	public Bart(int x, int y) {
		super(x,y);
		dano=400;
		vida=800;
		precio=1000;
		monedas=precio;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartParado.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacar(GameObject e) {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartAtacaGif.gif")));
		super.atacar(e);
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartParado.png")));
	}

	@Override
	public void mover() {	
		estado.parar();
	}

	public void cambiarLabel() {
		if(dano>400)
			label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartAtacaMejoradoGif.gif")));
		else
			if(dano==400)
				label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartAtacaGif.gif")));
	}


}
