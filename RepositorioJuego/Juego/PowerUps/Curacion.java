package PowerUps;

import java.util.Random;

import javax.swing.ImageIcon;
import Clases.GameObject;
import Clases.PowerUp;

public class Curacion extends PowerUp {	
	protected int duracion;
	
	public Curacion(int x, int y) {
		super(x,y);
	}

	@Override
	public void atacar(GameObject e) {	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
	}


	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void morir() {
		// TODO Auto-generated method stub
	}
	
	public void realizarAccion() {
		for(GameObject e: juego.listaEntidades()) {
			e.aumentarVida(500);
		}
	}
}