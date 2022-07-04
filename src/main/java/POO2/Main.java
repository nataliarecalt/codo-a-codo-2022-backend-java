package POO2;

import POO.Auto;
import POO.Motor;

public class Main {

	public static void main(String[] args) {
		
		Motor motorDesdeAfuera = new Motor("MCLAREN",150f);
		//auto tiene un constructor publico
		
		Auto auto = new Auto(220f,"AUDI",motorDesdeAfuera);
		auto.getMarca();
		auto.getColor();
		auto.getVelocidad();
		auto.getVelocidadMaxima();
		
		
		
	}

}
