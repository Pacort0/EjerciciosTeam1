package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Creamos el Scanner, que usaremos para leer los datos que el usuario introduzca desde la consola.
		Scanner sc = new Scanner (System.in);
		//Creamos la variable que usaremos para guardar los datos introducidos por pantalla.
		double distancia;
		
		//Imprimimos el mensaje inicial por pantalla, esperando a la introducción de un valor que guardaremos en la variable "distancia".
		System.out.print("Introduzca la distancia recorrida por su algoritmo (metros): ");
		distancia = sc.nextDouble();
		
		//Imprimimos el mensaje final.
		System.out.print("Su algoritmo ha recorrido " + (int)distancia + " centímetros.");
		sc.close();
	}

}
