package Aliados;
import javax.swing.ImageIcon;

import Clases.Aliado;

public class Marge extends Aliado {

	public Marge(int x, int y) {
		super(x,y);
		imagen= new ImageIcon(this.getClass().getResource("/Sprites/Aliados/abuelo.png"));
	}

}
