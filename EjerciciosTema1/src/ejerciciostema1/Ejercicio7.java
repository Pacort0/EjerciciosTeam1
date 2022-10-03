package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		//Creamos el Scanner, que usaremos para leer los datos que el usuario introduzca desde la consola.
		Scanner sc = new Scanner(System.in);
		//Creamos las variables que usaremos tanto para guardar los datos que se introduzcan por consola como las operaciones que realicemos.
		double milimetros, centimetros, metros;
		double total;
		
		//Imprimimos los mensajes por pantalla en los que le pedimos al usuario que introduzca los datos necesarios.
		System.out.print("Introduzca una distancia en milímetros: ");
		//Guardamos los milímetros en una variable.
		milimetros = sc.nextInt();
		System.out.print("\nIntroduzca una distancia en centímetros: ");
		//Guardamos los centímetros en una variable.
		centimetros = sc.nextInt();
		System.out.print("\nIntroduzca una distancia en metros: ");
		//Guardamos los metros en una variable.
		metros = sc.nextInt();
		
		//Calculamos la distancia en centímetros tanto de milímetros como de metros.
		milimetros /= 10;
		metros *= 100;
		
		//Calculamos la distancia total en centímetros.
		total = milimetros + centimetros + metros;
		
		//Imprimimos el mensaje final.
		System.out.print("\nLa distancia total introducida es de " + total + " centímetros");
		sc.close();
	}
}
