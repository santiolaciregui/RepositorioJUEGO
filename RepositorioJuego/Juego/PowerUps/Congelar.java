package PowerUps;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.ImageIcon;

import Clases.Enemigo;
import Clases.GameObject;
import Clases.PowerUp;
import Colisionadores.ColCongelar;

public class Congelar extends PowerUp implements Runnable {	
	protected int duracion;
	private static Congelar instancia;
	protected Map<Enemigo, Integer> mapeo;
	
	public Congelar(int x, int y) {
		super(x,y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/PremioKrusty.gif")));
		label.setBounds(x, y+55, 75, 60);
		afectacion= new ColCongelar(this);
		mapeo=new LinkedHashMap<Enemigo, Integer>();
		mejora=1;
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

	public void agregarAMapeo(Enemigo e) {
		mapeo.put(e, e.getVelocidad());
		
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
	
	public int getMejora() {
		return mejora;
	}
}