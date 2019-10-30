package ObjetoPrecioso;

import javax.swing.ImageIcon;
import Clases.GameObject;
import Clases.ObjetoPrecioso;
import Clases.ObstaculoConVida;

public class Bomba extends ObjetoPrecioso{
	
	public Bomba(int x, int y) {
		super(x,y);
		monedas=11;
		dano=100;
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BombaGif.gif")));
		label.setBounds(x, y+100, 174, 174);
		vida=13;
	}
	@Override
	public void mover() {super.mover();}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}
	
}