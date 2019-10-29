package Clases;

import javax.swing.ImageIcon;

import Colisionadores.ColObstaculoTemporal;
import Colisionadores.Colisionador;

public class ObstaculoTemporal extends GameObject {
	protected int duracion;
	
	public ObstaculoTemporal(int x, int y) {
		super(x,y);
		col = new ColObstaculoTemporal(this);
	}

	
	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
	}

	public void mover() {
		vida--;
		System.out.println(vida
				);
	}

	@Override
	public void serColisionado(Colisionador col) {
		col.visitar(this);
		
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}

	public int getTiempo() {
		return duracion;
	}

	public void setTiempo(int t) {
		// TODO Auto-generated method stub
		
	}

	public void aplicarEfecto(GameObject e) {
		// TODO Auto-generated method stub
		
	}

	public void terminar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void atacar(GameObject e) {
		e.disminuirVida(dano);		
	}

}
