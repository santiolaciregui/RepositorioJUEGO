package PowerUps;

import Clases.GameObject;
import Clases.PowerUp;
import Colisionadores.ColCuracion;

public class Curacion extends PowerUp {	
	protected int duracion;
	
	public Curacion(int x, int y) {
		super(x,y);
		mejora=500;
		afectacion=new ColCuracion(this);
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
	public void realizarAccion() {
		for(GameObject e: juego.listaEntidades())
			e.serColisionado(afectacion);
	}
	
	public int getMejora() {
		return mejora;
	}
}