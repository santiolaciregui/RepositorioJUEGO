package Aliados;
import javax.swing.ImageIcon;

import Clases.Aliado;

public class Bart extends Aliado {

	public Bart(int x, int y) {
		super(x,y);
		vida=2000;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartParado.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartAtacaGif.gif")));
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartParado.png")));
	}


}
