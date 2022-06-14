package codo.a.codo;

public class Arrays {

	public static void main(String[] args) {

		int[] array = new int[3];	//de 0 a 2
		
		array[0] = 10;
		array[1] = 11;
		array[2] = 12;
		
		System.out.println("FIN");
		
		//recorrer el array con el metodo lenght
		
		for(int i=0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//mostrar solo un valor en su posicion
		//	System.out.println("Mostrando solo el valor del indice 0" + array[i]);
			
			for(int aux : array) {
				System.out.println(aux);
			}
			
	}

}
