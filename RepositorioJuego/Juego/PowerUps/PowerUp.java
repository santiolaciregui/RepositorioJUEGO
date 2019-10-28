package PowerUps;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;

import Clases.GameObject;
import Colisionadores.Colisionador;
import Colisionadores.ColisionadorPowerUp;

public abstract class PowerUp extends GameObject{
	protected PowerUp(int x, int y) {
		super(x,y);
		vida=50;
		col= new ColisionadorPowerUp(this);
		label.addMouseListener(new oyenteLabel());
		
	}
	public void mover() {	}
	
	@Override
	public void serColisionado(Colisionador col) {	
		col.visitar(this);
	}
	
	public void atacar(GameObject a) {	}
	
	
	public abstract void realizarAccion() ;
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
			realizarAccion();
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