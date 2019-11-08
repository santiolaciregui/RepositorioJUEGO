package ObstaculoTemporal;

import javax.swing.ImageIcon;
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

	@Override
	public Obstaculo clonar() {
		Obstaculo clone= new Llama(0,0);
		return clone;
	}

}
