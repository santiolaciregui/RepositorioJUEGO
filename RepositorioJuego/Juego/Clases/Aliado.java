package Clases;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import Armas.Arma;
import Colisionadores.Visitor;
import Estados.EstadoAliado;
import Estados.AliadoNormal;
import Colisionadores.ColAliado;

public abstract class Aliado extends GameObject {
	protected int precio;
	protected Arma arma;
	protected boolean herido;
	protected EstadoAliado estado;
	
	protected Aliado(int x,int y) {
		super(x,y);	
		label.addMouseListener(new oyenteLabel());
		herido = false;
		col = new ColAliado(this);
		estado=new AliadoNormal(this);
	}
	
	public void aumentarVida(int vida ) {
		this.vida+=vida;	
	}
	
	public void atacar(GameObject e) {
		e.disminuirVida(dano);
		estado.atacar();
	}
	
	public void reducirVida(int dano) {
		vida-=dano;
		if (!herido) {
			herido = true;
			monedas /= 2;
		}
	}
	public void disminuirVida(int damage) {
		estado.disminuirVida(damage);
	}

	public void serColisionado(Visitor col) {
		col.visitar(this);
	}	
	
	public void aumentarDano(int d) {
		estado.aumentarDano(d);
	}

	public void setEstado(EstadoAliado e) {
		estado=e;
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
	
	public abstract void atacarSuperPoderoso();
	public abstract void atacarNormal();
	public abstract void pararSuperPoderoso();
	public abstract void pararNormal();
}
