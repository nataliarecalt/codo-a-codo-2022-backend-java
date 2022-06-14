package codo.a.codo;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		//leer la nota desde el teclado
		Scanner teclado = new Scanner(System.in);
		//Solicito por teclado
		System.out.println("Ingrese nota");
		int nota = teclado.nextInt();
		
		//Ingresando la nota hardcodeada
		int nota2 = 3;
		
		switch (nota2) {
		case 7:
			System.out.println("Aprobado");
			break;
		case 10:
			System.out.println("Sobresaliente");
		default:
			System.out.println("Desaprobado");
			break;
		}	
		//hay que cerrar el teclado al finalizar 
		teclado.close();	
	}

}
