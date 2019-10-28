package Botones;

import Clases.Aliado;
import Clases.Tienda;
import Obstaculos.Tambor;
import Obstaculos.ObstaculoConVida;

public class BotonObstaculoConVida extends RoundButton{

	public BotonObstaculoConVida(Tienda tien) {
		super(tien);
	}

	@Override
	public Tambor crear() {
		return new ObstaculoConVida(0,0);
	}
	

}
