package Vista;

import Controlador.Controlador;

public class Inici {
	
	Controlador c;
	
	public Inici(){
		// podemos modificar las variables del controlador
		c = new Controlador("localhost", "restaurante", "root", "");
	}
	
	public static void main(String[] args) {
		Inici i = new Inici();
		Platos p = new Platos();
		p.setLocationRelativeTo(null);
	}

}
