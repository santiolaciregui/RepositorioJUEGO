package Aliados;
import javax.swing.ImageIcon;

import Clases.Aliado;

public class Marge extends Aliado {

	public Marge(int x, int y) {
		super(x,y);
		vida=2000;
		setBounds(21, 56,115 , 108);
	}
	
	public void atacar() {
		setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeAtacaGif.gif")));
	}
	
	public void parar() {
		setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeParada.png")));
	}

}
