package Clases;

public class GameObject {
	
	protected int vida;
	protected int alcance;
	protected int dano;
	
	public GameObject(int v, int d, int a) {
		vida=v; dano=d; alcance=a;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAlcance() {
		return alcance;
	}

	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}
}