package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Creamos el Scanner, que usaremos para leer los datos que el usuario introduzca desde la consola.
		Scanner sc = new Scanner(System.in);
		//Creamos las variables en las que guardaremos tanto los datos que el usuario introduzca por consola como las operaciones que haremos.
		double a, b, c;
		double x;
		double y;
		
		//Imprimimos los diferentes mensajes por pantalla, pidiéndole al usuario que introduzca los datos necesarios para el programa.
		System.out.print("Introduzca un valor para 'a': ");
		//Guardamos el valor de 'a' en una variable.
		a = sc.nextDouble();
		System.out.print("\nIntroduzca un valor para 'b': ");
		//Guardamos el valor de 'b' en una variable.
		b = sc.nextDouble();
		System.out.print("\nIntroduzca un valor para 'c': ");
		//Guardamos el valor de 'c' en una variable.
		c = sc.nextDouble();
		System.out.print("\nIntroduzca un valor para 'x': ");
		//Guardamos el valor de 'x' en una variable.
		x = sc.nextDouble();
		
		//Calculamos el valor de 'y' y lo guardamos en una variable.
		y = a*(Math.pow(x, 2)) + b*x + c;
		
		//Imprimimos el mensaje final.
		System.out.print("\nEl valor de y es " + y);
		sc.close();
	}

}

