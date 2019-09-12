package Aliados;
import java.util.Random;

import javax.swing.ImageIcon;

import Clases.Aliado;

public class Homero extends Aliado {
	protected int cant;

	public Homero(int x, int y) {
		super(x,y);
		Random r=  new Random();
		cant=r.nextInt(10);
		setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
		vida=2000;
		setBounds(21, 56,115 , 108);
	}
	
	public void atacar() {
		setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroAtacaGif.gif")));
	}
	
	public void parar() {
		setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
	}
	public int obtenercant() {
		return cant;
	}
}
