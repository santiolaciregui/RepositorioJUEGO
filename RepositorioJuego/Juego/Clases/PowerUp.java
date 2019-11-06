package Clases;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;

import Colisionadores.Colisionador;
import Colisionadores.ColPowerUp;

public abstract class PowerUp extends GameObject{
	protected PowerUp(int x, int y) {
		super(x,y);
		vida=50;
		col= new ColPowerUp(this);
		label.addMouseListener(new oyenteLabel());
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/PremioKrusty.gif")));
		label.setBounds(x, y+55, 75, 60);
		
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