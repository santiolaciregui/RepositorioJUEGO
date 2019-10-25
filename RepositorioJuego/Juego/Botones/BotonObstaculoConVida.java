package Botones;

import Clases.Aliado;
import Clases.Tienda;
import Obstaculos.Obstaculo;
import Obstaculos.ObstaculoConVida;

public class BotonObstaculoConVida extends RoundButton{

	public BotonObstaculoConVida(Tienda tien) {
		super(tien);
	}

	@Override
	public Obstaculo crear() {
		return new ObstaculoConVida(0,0);
	}
	

}
