/**
 * 
 * @author andreseiro
 * @version 1.0 18/02/22
 * 
 * Programa que captura un número desde el teclado en un rango de 0 a 99.999 y determina el 
 * número de digitos
 * 
 */


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// creación de variables
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		//lectura de número
		System.out.print("Introduzca un número entre 0 y 99.999: "); 
		numero = teclado.nextInt();
		
		//validar el número de dígitos
		if(numero<10) {
			System.out.println("tiene 1 cifra");
		}
		else{
			if(numero<100) { 
				System.out.println("tiene 2 cifras"); 
			}
			else { 
				if(numero<1000) { 
					System.out.println("tiene 3 cifras");
				}
				else { 
					if (numero<10000) { 
					System.out.println("tiene 4 cifras");
					}
					else { 
						if(numero<100000) { 
							System.out.println("tiene 5 cifras"); 
						}
						else {
							System.out.println("El numero excede el limite de 99.999");
						}
					}
				}
			}
		}
	}
}