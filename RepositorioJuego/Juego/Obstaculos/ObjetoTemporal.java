package Obstaculos;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Colisionadores.Colisionador;

public class ObjetoTemporal extends GameObject {
	protected int duracion;
	
	public ObjetoTemporal(int x, int y) {
		super(x,y);
		duracion = 10;
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/PremioKrusty.png")));
		label.setBounds(x, y,117 , 110);
	}

	@Override
	public void atacar(GameObject e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	public void golpearJugador(GameObject j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearEnemigo(GameObject e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Colisionador v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearAliado(GameObject j) {
		// TODO Auto-generated method stub
		
	}

}
