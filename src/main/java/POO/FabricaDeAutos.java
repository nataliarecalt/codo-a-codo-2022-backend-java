package POO;

public class FabricaDeAutos {

	public static void main(String[] args) {
		//Quiero crear mi primer objeto de la clase Auto.
		Auto fiatPunto = new Auto(300f,"AUTO",new Motor("motor,300f", 0)); // es el constructor
	//	fiatPunto.encender();
		
		
		//quiero ver la velocidad del auto. nombredelobjeto.atributo
	//	System.out.println("velocidad actual: " + fiatPunto.velocidad);
		
	//	fiatPunto.acelerar();
	//	fiatPunto.apagar();
		
	//	System.out.println("fin");
		
		fiatPunto.encender();
		fiatPunto.verVelocidad();
		fiatPunto.acelerar();
		fiatPunto.verVelocidad();
		fiatPunto.acelerar();
		fiatPunto.verVelocidad();
		fiatPunto.acelerar();
		fiatPunto.verVelocidad();
		
		fiatPunto.frenar();
		fiatPunto.verVelocidad();
		
		fiatPunto.apagar();
		fiatPunto.verVelocidad();
		
		
	}

}
