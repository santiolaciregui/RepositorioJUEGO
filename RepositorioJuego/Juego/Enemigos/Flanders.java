package Enemigos;

import javax.swing.ImageIcon;

import Clases.Enemigo;

public class Flanders extends Enemigo  {

	public Flanders(int x, int y) {
		super(x,y);
		setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersAtacaGif.gif")));
		puntosDeMuerte=50;
		setBounds(21,123,113,106);
		
	}

}
