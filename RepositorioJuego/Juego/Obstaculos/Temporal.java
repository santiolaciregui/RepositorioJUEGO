package Obstaculos;

import Clases.GameObject;

public interface Temporal {

	public abstract int getTiempo();

	public abstract void setTiempo(int t);

	public abstract void aplicarEfecto(GameObject e);

	public abstract void terminar();

}
