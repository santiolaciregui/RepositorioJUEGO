package ObjetoPrecioso;

import javax.swing.ImageIcon;
import Clases.ObjetoPrecioso;

public class Bomba extends ObjetoPrecioso{
	
	public Bomba(int x, int y) {
		super(x,y);
		monedas=11;
		dano=350;
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BombaGif.gif")));
		label.setBounds(x-20, y+70, 230, 230);
		vida=30;
	}
	@Override
	public void mover() {super.mover();}
}