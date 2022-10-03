package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		//Creamos el Scanner, que usaremos para leer los datos que el usuario introduzca desde la consola.
		Scanner sc = new Scanner(System.in);
		//Creamos las variables en las que guardaremos los valores que introduzca el usuario por consola.
		int segundos, minutos, horas;

		//Imprimimos el primer mensaje por pantalla, pidiéndole los datos necesarios al usuario.
		System.out.print("Introduzca una cantidad de segundos: ");
		//Guardamos los datos en una variable.
		segundos = sc.nextInt();
		
		//Calculamos el número de horas que corresponden a los segundos introducidos.
		horas = segundos / 3600;
		//Ahora el valor de los segundos es igual al resto sobrante de la división realizada para conocer las horas.
		segundos %= 3600;
		//Calculamos el número de minutos a partir de los segundos que quedan aún.
		minutos = segundos/60;
		//Ahora el valor de los segundos es igual al resto sobrante de la división realizada para conocer los minutos.
		segundos %= 60;
		
		//Imprimimos por consola el mensaje final.
		System.out.print("\nLa cantidad ingresada equivale a " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
		sc.close();
	}
}
