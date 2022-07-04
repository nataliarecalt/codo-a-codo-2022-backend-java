package codo.a.codo;

public class Operadores {

	public static void main(String[] args) {
		//ARITMETICOS
		//+, - , / , *
		
		//RELACIONALES
		//<, >, !=, >=, <=
		
		//LOGICOS
		//and && or || not !
		
		
		String usuario = "root1";
		String contrasenia = "root";
				//asi se pregunta por un string en java
		if("root".equals(usuario) && "root".equals(contrasenia)){
			System.out.println("OK");
			
		}else {
			System.out.println("FAIL");
		}

	}

}
