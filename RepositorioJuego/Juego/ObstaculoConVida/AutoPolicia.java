
package ObstaculoConVida;

import javax.swing.ImageIcon;
import Clases.GameObject;

public class AutoPolicia extends ObstaculoConVida{
	
	public AutoPolicia(int x, int y) {
		super(x,y);
		monedas=11;
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AutoPolicia.png")));
		label.setBounds(x, y+100, 250, 130);
		vida=100;
	}
	@Override
	public void mover() {	}
	
	@Override
	public void atacar(GameObject e) {
		// TODO Auto-generated method stub
		
	}
	
	public ObstaculoConVida clonar() {
		// TODO Auto-generated method stub
		return null;
	}

}