package ObstaculoTemporal;

import javax.swing.ImageIcon;
import Clases.Obstaculo;

public class Lava extends ObstaculoTemporal {

	public Lava(int x, int y) {
		super(x,y);
		monedas=5000;
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LavaGif.gif")));
		label.setBounds(x, y+100, 107, 130);
		vida=400;
		dano=100;
	}

	@Override
	public Obstaculo clonar() {
		return new Lava(0,0);
	}
	
	
}

