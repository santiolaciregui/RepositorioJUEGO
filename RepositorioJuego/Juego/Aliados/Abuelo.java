package Aliados;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import Clases.Aliado;

public class Abuelo extends Aliado {
	public Abuelo(int x, int y) {
		super(x,y);
		vida=2000;
		setBounds(21, 56,127 , 116);
	}
	
	public void atacar() {
		setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloAtacaGif.gif")));
	}
	
	public void parar() {
		setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloParado.png")));
	}
}
