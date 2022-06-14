package codo.a.codo;

public class While {

	public static void main(String[] args) {

		int contador = 10;
		
		while(contador > 0) {
			System.out.println("contador:" + contador);
			contador--;
			
			if(contador == 3) {
				break;	//para terminar si llego a 3, salir del ciclo
				//si uso continue saltea el numero y sigue , poniendo el -- abajo.
			}
			
			
			
		}
		int contador2 = 10;
		
		while(contador2 >= 0) {
			System.out.println("contador:" + contador2);
			
			if(contador % 2 == 0) {
				System.out.println(contador + " par");
			}else {
				System.out.println(contador + " impar");
			}
			contador2--;
			
			}
			
			
			
		}
		
		
		
		

}

