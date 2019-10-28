package Clases;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Armas.Arma;
import Clases.PowerUp.oyenteLabel;
import Colisionadores.Colisionador;
import Colisionadores.ColAliado;

public abstract class Aliado extends GameObject {
	protected int monedas;
	protected int precio;
	protected Arma arma;

	protected Aliado(int x,int y) {
		super(x,y);	
		col= new ColAliado(this);
		label.addMouseListener(new oyenteLabel());
	}
	
	public void disminuirVida(int damage) {
		super.disminuirVida(damage);
		monedas=monedas/2;
	}

	public void serColisionado(Colisionador col) {
		col.visitar(this);
	}
	
	@Override
	public abstract void atacar(GameObject e);

	@Override
	public abstract void parar();
	
	public int getMonedas() {
		return monedas;
	}

	public class oyenteLabel implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e1) {
			vida=0;			
			juego.aumentarMonedas(precio);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

}
