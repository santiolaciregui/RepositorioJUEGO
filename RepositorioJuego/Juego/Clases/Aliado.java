package Clases;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Armas.Arma;
import Colisionadores.Colisionador;
import Colisionadores.ColAliado;

public abstract class Aliado extends GameObject {
	protected int precio;
	protected Arma arma;
	protected boolean herido;

	protected Aliado(int x,int y) {
		super(x,y);	
		col = new ColAliado(this);
		label.addMouseListener(new oyenteLabel());
		herido = false;
	}
	
	public void aumentarVida(int vida ) {
		this.vida+=vida;	
	}
	public void disminuirVida(int damage) {
		super.disminuirVida(damage);
		if (!herido) {
			herido = true;
			monedas /= 2;
		}
	}

	public void serColisionado(Colisionador col) {
		col.visitar(this);
	}
	
	@Override
	public void atacar(GameObject e) {	}
	
	public void mover() {	}
	
	public void aumentarDano(int d) {
		dano+=d;
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
		public void mouseReleased(MouseEvent e) {
			vida = 0;
			juego.aumentarMonedas(monedas);
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
