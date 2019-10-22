package Aliados;
import javax.swing.ImageIcon;

import Clases.Aliado;
import Clases.GameObject;

public class Bart extends Aliado {

	public Bart(int x, int y) {
		super(x,y);
		dano=300;
		vida=800;
		precio=1000;
		monedas=precio;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartParado.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacar(GameObject e) {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartAtacaGif.gif")));
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartParado.png")));
	}

	@Override
	public void mover() {	}


}
