package ejerciciostema1;
import java.util.*;

public class Ejercicio1 {
	public static void main (String args[]) {
		//Creamos el Scanner, que usaremos para leer los datos que el usuario introduzca desde la consola.
		Scanner sc = new Scanner(System.in);
		//Creamos la variable en la que almacenaremos el número que el usuario introduzca por consola.
		double numero;
		
		//Mostramos por pantalla el mensaje inicial pidiendo al usuario un número con decimales.
		System.out.print("Introduzca un número con decimales: ");
		//Guardamos el número introducido en la variable mediante el escáner.
		numero = sc.nextDouble();
		
		//Sumamos 0'5 al número original y el resultado lo almacenamos en la misma variable
		numero += 0.5;
		
		//Imprimimos el número resultante haciendo casting a 'int', lo que le quitará los decimales y nos mostrará el número entero.
		System.out.print("El número que ha introducido, redondeado, es: " + (int) numero);
		//Cerramos el escáner.
		sc.close();
	}
}
