package Obstaculos;

import javax.swing.ImageIcon;


import Clases.GameObject;
import Colisionadores.Colisionador;

public class ObstaculoConVida extends Obstaculo {
	protected int duracion;
	
	public ObstaculoConVida(int x, int y) {
		super(x,y);
		duracion = 10;
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersMuerto.png")));
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
		

	public void accept(Colisionador col) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void serColisionado(Colisionador col) {
		col.visitar(this);
		
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}

}
