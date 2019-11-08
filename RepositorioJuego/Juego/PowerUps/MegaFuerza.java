package PowerUps;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.ImageIcon;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.GameObject;
import Clases.PowerUp;
import Colisionadores.ColMegaFuerza;

public class MegaFuerza extends PowerUp implements Runnable {	
	private static MegaFuerza instancia;
	protected Map<Aliado, Integer> mapeo;
	protected int mejora;
	
	public MegaFuerza(int x, int y) {
		super(x,y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/PremioKrusty.gif")));
		label.setBounds(x, y+55, 75, 60);
		afectacion= new ColMegaFuerza(this);
		mapeo=new LinkedHashMap<Aliado, Integer>();
		mejora=700;
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

	public void agregarAMapeo(Aliado a) {
		mapeo.put(a, a.getDano());
		
	}
	
	public void run() {
		for(GameObject e: juego.listaEntidades()) { 
			e.serColisionado(afectacion);
		}
		try {
			Thread.sleep(20000);
		} 
		catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for(Map.Entry<Aliado,Integer> entry: mapeo.entrySet()) {
			entry.getKey().setDano(entry.getValue());
		}
		instancia=null;
	}
}