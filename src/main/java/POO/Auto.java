package POO;

//nombre de la clase
public class Auto {
	//atributos de la clase, deben ser privados
	private String color;
	private int anio;
	private long serie;
	private String marca;
	private String modelo;
	private float velocidad;
	private float velocidadMaxima;
	private boolean encendido;
	
	private Motor motor;
	
	//constructor cuando nace el objeto. Sirve para definir los valores x defecto de los atributos.
	//es una inicializacion del objeto.
	
	public Auto(float velocidadMaxima, String marca, Motor motor){
		this.setVelocidadMaxima(velocidadMaxima);
		//velocidad = 0;
		this.setVelocidad(0);
		//anio = 2022;
		this.setAnio(2022);
		//marca = "sin marca";
		this.setMarca(marca);
		modelo = "sin modelo";
		//encendido = false;
		this.setEncendido(false);
		velocidadMaxima = 3;
		this.setMotor(motor);
	}
	
	//metodos
	public void setMotor(Motor motor){
		if(motor == null) {
			Motor motorInterno = new Motor ("default",100); 
			this.motor = motorInterno;
		}else {
			this.motor = motor;
		}
		
	}
	
	public Motor getMotor() {
		return this.motor;
	}
	
	public void encender() {
		if(!this.isEncendido()) {
			this.setEncendido(true);
			System.out.println("Se ha encendido el auto");
		}else {
			System.out.println("ERROR: El auto ya esta encendido");
		}
	}
	
	//si adentro del metodo no hay nada no hay "implementacion"
	public void apagar() {
		if(this.isEncendido()) {
			while(this.getVelocidad() > 0) {
				System.out.println("frenando...");
				frenar();
			}	
			encendido = false;
			this.setEncendido(false);
			
			System.out.println("Se ha apagado el auto");
		}else {
			System.out.println("ERROR: El auto ya esta apagado");
		}		
	}
	
	public void acelerar() {
		if(this.isEncendido()) {
			if(this.getVelocidad() < this.getVelocidadMaxima()) {
			this.setVelocidad(this.getVelocidad() + 1);
			}else {
				System.out.println("ERROR: Ya se ha alcanzado la velocidad maxima permitida");
			}
		}else {
			System.out.println("ERROR: Debe encender el auto antes de acelerar");
		}
	}
	
	public void frenar() {
		if(this.isEncendido()) {
			if(this.getVelocidad() > 0) {
				//velocidad--;
				this.setVelocidad(this.getVelocidad() - 1 );
			}
		}else {
			System.out.println("ERROR: El auto ya esta apagado");
		}
	}	
	
	public void verVelocidad() {
		System.out.println(velocidad);
	}
	
	public String getMarca() {
		//esta logica esta oculta al mundo exterior
		return marca == null ? "" : marca;	
	}
	
	public void setMarca(String marca) {
		//con el operador this hago referencia al atributo interno de la clase y 
		//le asigno la marca que recibo por parametro.
		if(marca != null) {
			this.marca = marca;
		}else {
			this.marca = ""; //esto evita que sea nulo evitando asi errores futuros
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAnio() {
		return anio;
	}

	private void setAnio(int anio) {
		this.anio = anio;
	}

	private long getSerie() {
		return serie;
	}

	public void setSerie(long serie) {
		this.serie = serie;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getVelocidad() {
		return velocidad;
	}

	private void setVelocidad(float velocidad) {
		if(velocidad < 0) {
			this.velocidad = 0;
		}else {
			this.velocidad = velocidad;
		}
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	private void setVelocidadMaxima(float velocidadMaxima) {
		if(velocidadMaxima < 0 || velocidadMaxima > 220) {
			if(velocidadMaxima < 0)
				this.velocidadMaxima = 0;
			if(velocidadMaxima > 220)
				this.velocidadMaxima = 220;
		}else {
			this.velocidadMaxima = velocidadMaxima;
		}
	}

	public boolean isEncendido() {
		return encendido;
	}

	private void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	// alt + shift + s --> para obtener getters y setters de todos los atributos
	
	
}
