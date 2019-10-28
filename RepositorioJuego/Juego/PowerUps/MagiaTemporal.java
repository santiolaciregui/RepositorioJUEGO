package PowerUps;

import java.util.Random;

import javax.swing.ImageIcon;
import Clases.GameObject;

public class MagiaTemporal extends PowerUp {	
	protected int duracion;
	
	public MagiaTemporal(int x, int y) {
		super(x,y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/PremioKrusty.gif")));
		label.setBounds(x, y+55, 75, 60);
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
	@Override
	public void morir() {
		// TODO Auto-generated method stub
	}
	
	public void realizarAccion() {
		Random r = new Random();
		int valorDado = r.nextInt(2);
		for(GameObject e: juego.listaEntidades()) {
			if(valorDado==0)
				e.aumentarVida(500);
			else
				e.setDano(1000);
		}		
	}
	

}