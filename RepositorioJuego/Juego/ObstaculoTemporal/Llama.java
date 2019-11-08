package ObstaculoTemporal;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Clases.Obstaculo;

public class Llama extends ObstaculoTemporal {

	public Llama(int x, int y) {
		super(x,y);
		monedas=11;
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LlamaGif.gif")));
		label.setBounds(x, y+100, 155, 155);
		vida=580;
		dano=15;
	}
	
	public void atacar(GameObject e) {
		super.atacar(e);
	}

	@Override
	public Obstaculo clonar() {
		return new Llama(0,0);
	}

}
