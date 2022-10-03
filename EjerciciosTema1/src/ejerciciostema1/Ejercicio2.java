package ejerciciostema1;
import java.util.*;

public class Ejercicio2 {
	public static void main (String args[]) {
		//Creamos el Scanner, que usaremos para leer los datos que el usuario introduzca desde la consola.
		Scanner sc = new Scanner(System.in);
		//Creamos la variable en la que guardaremos el número que se introduzca por consola.
		int numero;
		//Creamos una variable en la que guardaremos el resto de la division entre el número introducido y 7.
		int resto;
		
		//Mostramos el mensaje inicial por pantallam, pidiéndole al usuario que introduzca un número entero.
		System.out.print("Introduzca un número entero: ");
		//Guardamos dicho número en la variable designada.
		numero = sc.nextInt();
		
		//Calculamos el resto entre el número introducido y 7.
		resto = numero % 7;
		//Si el resto no es 0, le restamos a 7 el resto obtenido para conseguir el número que hace falta sumar.
		numero = resto == 0 ? 0 : 7 - resto;
		
		//Imprimimos el mensaje final con el número a sumar.
		System.out.print("Al número introducido hay que sumarle " + numero + " para que sea múltiplo de 7.");
		//Cerramos el escáner.
		sc.close();
	}
}
