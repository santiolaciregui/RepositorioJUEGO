package ObstaculoTemporal;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Clases.ObstaculoTemporal;

public class Llama extends ObstaculoTemporal implements Runnable {

	public Llama(int x, int y) {
		super(x,y);
		monedas=11;
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LlamaGif.gif")));
		label.setBounds(x, y+100, 155, 155);
		vida=10000;
		dano=5;
	}
	
	public void atacar(GameObject e) {
		super.atacar(e);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
