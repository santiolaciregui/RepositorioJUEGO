package PowerUps;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Clases.PowerUp;

public class MegaFuerza extends PowerUp implements Runnable {	
	protected int duracion;
	private static Congelar instancia;
	
	public MegaFuerza(int x, int y) {
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
		for(GameObject e: juego.listaEntidades()) { 
			e.aumentarDano(e.getDano()*2);
		}
		try {
			Thread.sleep(9000);
		} 
		catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for(GameObject e: juego.listaEntidades()) {
			e.setDano(e.getDano()/2);
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