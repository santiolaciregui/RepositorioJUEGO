package Aliados;
import javax.swing.ImageIcon;

import Clases.Aliado;

public class Homero extends Aliado {

	public Homero(int x, int y) {
		super(x,y);
		imagen= new ImageIcon(this.getClass().getResource("/Sprites/Aliados/abuelo.png"));
	}

}
