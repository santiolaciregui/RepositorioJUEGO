package ObstaculoTemporal;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Clases.ObstaculoTemporal;

public class Lava extends ObstaculoTemporal implements Runnable {

	public Lava(int x, int y) {
		super(x,y);
		monedas=11;
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LavaGif.gif")));
		label.setBounds(x, y+100, 130, 130);
		vida=10000;
		dano=10;
	}
	@Override
	public void atacar(GameObject e) {
		e.disminuirVida(dano);
		this.run();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(40);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
