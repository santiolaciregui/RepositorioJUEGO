package PowerUps;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Clases.PowerUp;
import Colisionadores.ColCuracion;

public class Curacion extends PowerUp {	
	protected int duracion;
	
	public Curacion(int x, int y) {
		super(x,y);
		mejora=500;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/corazonPower.png")));
		label.setBounds(x+30, y+30, 65, 56);
		afectacion=new ColCuracion(this);
	}

	@Override
	public void atacar(GameObject e) {	}
	public void realizarAccion() {
		for(GameObject e: juego.listaEntidades())
			e.serColisionado(afectacion);
		
	}
	
	public int getMejora() {
		return mejora;
	}
}