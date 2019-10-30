package ObstaculoTemporal;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Clases.ObstaculoTemporal;

public class Llama extends ObstaculoTemporal {

	public Llama(int x, int y) {
		super(x,y);
		monedas=11;
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LlamaGif.gif")));
		label.setBounds(x, y+100, 155, 155);
		vida=100;
		dano=10;
	}
	
	public void atacar(GameObject e) {
		super.atacar(e);
	}

}
