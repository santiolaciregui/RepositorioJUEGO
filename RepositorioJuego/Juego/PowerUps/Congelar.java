package PowerUps;

import javax.swing.ImageIcon;

import Clases.Enemigo;
import Clases.GameObject;
import Clases.PowerUp;

public class Congelar extends PowerUp implements Runnable {	
	protected int duracion;
	private static Congelar instancia;
	
	public Congelar(int x, int y) {
		super(x,y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/PremioKrusty.gif")));
		label.setBounds(x, y+55, 75, 60);
	}

	public static Congelar getInstancia(int x, int y) {
		if(instancia==null) {
			instancia= new Congelar(x,y);
		}
		return instancia;
	}
	
	public void realizarAccion() {
		(new Thread(this)).start();
	}

	public void run() {
		for(GameObject e: juego.getMapa().listaEnemigos()) { 
			Enemigo e1=(Enemigo) e;
			e1.setVelocidad(1);
		}
		try {
			Thread.sleep(9000);
		} 
		catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for(GameObject e: juego.getMapa().listaEnemigos()) {
			Enemigo e1=(Enemigo) e;
			e1.setVelocidad(3);
		}
		instancia=null;
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}
}