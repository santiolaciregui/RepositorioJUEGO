package ObstaculoTemporal;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Clases.ObstaculoTemporal;

public class Lava extends ObstaculoTemporal {

	public Lava(int x, int y) {
		super(x,y);
		monedas=11;
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LavaGif.gif")));
		label.setBounds(x, y+100, 130, 130);
		vida=10000;
		dano=10000;
	}
	@Override
	public void atacar(GameObject e) {
		System.out.print("aas ");
		e.disminuirVida(dano);
	}


}
