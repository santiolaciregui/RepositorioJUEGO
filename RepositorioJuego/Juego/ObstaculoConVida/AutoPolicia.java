
package ObstaculoConVida;

import javax.swing.ImageIcon;
import Clases.Obstaculo;

public class AutoPolicia extends ObstaculoConVida{
	
	public AutoPolicia(int x, int y) {
		super(x,y);
		monedas=11;
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AutoPolicia.png")));
		label.setBounds(x, y+100, 250, 130);
		vida=100000;
	}
	@Override
	public void mover() {	}
	
	@Override
	public Obstaculo clonar() {
		Obstaculo clone= new AutoPolicia(0,0);
		return clone;
	}

}