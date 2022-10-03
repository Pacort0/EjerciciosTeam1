package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Creamos el Scanner, que usaremos para leer los datos que el usuario introduzca desde la consola.
		Scanner sc = new Scanner (System.in);
		//Creamos las variables que usaremos tanto para guardar los valores introducidos por consola como las operaciones que hagamos.
		double num1, num2;
		Boolean igualdad;
		
		//Imprimimos los mensajes por pantalla, pidiéndole al usuario los datos necesarios.
		System.out.print("Introduzca el primer número: ");
		//Guardamos el valor del primer número en una variable.
		num1 = sc.nextDouble();
		System.out.print("\nIntroduzca el segundo número: ");
		//Guardamos el valor del segundo número en una variable.
		num2 = sc.nextDouble();
		
		//Usamos un operador ternario para determinar si ambos números son iguales o diferentes.
		igualdad = num1 == num2 ? true : false;
		
		//Imprimimos el mensaje final.
		System.out.print("\n¿Son los dos números iguales? " + igualdad);
		sc.close();
	}

}
