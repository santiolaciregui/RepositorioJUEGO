package Aliados;
import javax.swing.ImageIcon;

import Clases.Aliado;

public class Abuelo extends Aliado {
	public Abuelo(int x, int y) {
		super(x,y);
		vida=2000;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloParado.png")));
		label.setBounds(x, y,127 , 116);
	}
	
	public void atacar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloAtacaGif.gif")));
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloParado.png")));
	}

}
