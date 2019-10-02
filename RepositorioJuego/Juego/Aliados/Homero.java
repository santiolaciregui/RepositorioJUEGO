package Aliados;
import java.util.Random;

import javax.swing.ImageIcon;

import Clases.Aliado;

public class Homero extends Aliado {
	
	public Homero(int x, int y) {
		super(x,y);
		vida=2000;
		label.setBounds(21, 56,113 , 106);
	}
	
	public void atacar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroAtacaGif.gif")));
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
	}

}
