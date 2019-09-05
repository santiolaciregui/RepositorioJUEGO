package Aliados;
import javax.swing.ImageIcon;

import Clases.Aliado;

public class Bart extends Aliado {

	public Bart(int x, int y) {
		super(x,y);
		imagen= new ImageIcon(this.getClass().getResource("RepositorioJuego/Sprites/Aliados/abuelo.png"));
	}

}
