package State;

import Clases.GameObject;

public abstract class State {
	protected GameObject miEntidad;
	
	public abstract void caminar();
	public abstract void parar();
	public abstract void atacar();
}
