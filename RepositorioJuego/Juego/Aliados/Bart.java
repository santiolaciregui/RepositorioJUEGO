package Aliados;
import javax.swing.ImageIcon;

import Clases.Aliado;

public class Bart extends Aliado {

	public Bart(int x, int y) {
		super(x,y);
		vida=2000;
		setBounds(21, 56,115 , 108);
	}

	public void atacar() {
		setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartAtacaGif.gif")));
	}
	
	public void parar() {
		setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartParado.png")));
	}
}
