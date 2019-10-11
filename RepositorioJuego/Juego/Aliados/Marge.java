package Aliados;
import javax.swing.ImageIcon;

import Clases.Aliado;

public class Marge extends Aliado {

	public Marge(int x, int y) {
		super(x,y);
		vida=2000;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeParada.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeAtacaGif.gif")));
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeParada.png")));
	}
}
