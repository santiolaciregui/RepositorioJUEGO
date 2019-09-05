package Clases;

public class Aliado extends GameObject {
	protected int monedas;

	public Aliado(int v, int d, int a) {
		super(v,d,a);
	}
	public void bajarVida(int cant) {
		vida-=cant;
//		if(vida==0)
//			eliminarAliado();
	}
	
}
