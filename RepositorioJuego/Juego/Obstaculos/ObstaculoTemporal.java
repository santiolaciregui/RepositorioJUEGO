package Obstaculos;

import javax.swing.ImageIcon;
import Clases.GameObject;
import Colisionadores.Colisionador;

public class ObstaculoTemporal extends Obstaculo {
	protected int duracion;
	
	public ObstaculoTemporal(int x, int y) {
		super(x,y);
		duracion = 10;
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/TamborGif.gif")));
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

	public void mover() {
		// TODO Auto-generated method stub
		
	}

	public void golpearJugador(GameObject j) {
		// TODO Auto-generated method stub
		
	}

	public void golpearEnemigo(GameObject e) {
		// TODO Auto-generated method stub
		
	}

	public void accept(Colisionador v) {
	
	}

	@Override
	public void serColisionado(Colisionador col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}

	public int getTiempo() {
		// TODO Auto-generated method stub
		return 0;
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

}
