package PowerUps;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.ImageIcon;

import Clases.Enemigo;
import Clases.GameObject;
import Clases.PowerUp;
import Colisionadores.ColMegaFuerza;

public class MegaFuerza extends PowerUp implements Runnable {	
	protected int duracion;
	private static MegaFuerza instancia;
	protected Map<Enemigo, Integer> mapeo;
	
	public MegaFuerza(int x, int y) {
		super(x,y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/PremioKrusty.gif")));
		label.setBounds(x, y+55, 75, 60);
		afectacion= new ColMegaFuerza(this);
		mapeo=new LinkedHashMap<Enemigo, Integer>();
	}

	public static MegaFuerza getInstancia(int x, int y) {
		if(instancia==null) {
			instancia= new MegaFuerza(x,y);
		}
		return instancia;
	}
	
	public void realizarAccion() {
		(new Thread(this)).start();
	}

	public void run() {
		for(GameObject e: juego.getMapa().listaEnemigos()) { 
			e.serColisionado(afectacion);
		}
		try {
			Thread.sleep(9000);
		} 
		catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for(Map.Entry<Enemigo,Integer> entry: mapeo.entrySet()) {
			entry.getKey().setVelocidad(entry.getValue());
		}
		instancia=null;
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
	}
}