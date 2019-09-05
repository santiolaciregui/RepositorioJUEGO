package Aliados;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import Clases.Aliado;

public class Abuelo extends Aliado {
	public Abuelo(int x, int y) {
		super(x,y);
		imagen= new ImageIcon(this.getClass().getResource("/Sprites/Aliados/abuelo.png"));
	}

}
