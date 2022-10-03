package ejerciciostema1;
import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Creamos el Scanner, que usaremos para leer los datos que el usuario introduzca desde la consola.
		Scanner sc = new Scanner (System.in);
		//Creamos las variables que usaremos tanto para guardar los datos que se introduzcan por consola como las operaciones que realicemos.
		double base;
		double altura;
		double area;
		
		//Imprimimos los mensajes iniciales, pidiéndole al usuario las medidas del triángulo.
		System.out.print("Introduzca la medidad de la base del triángulo (m): ");
		//Guardamos la medida de la base en una variable.
		base = sc.nextDouble();
		System.out.print("Introduzca la medidad de la altura del triángulo (m): ");
		//Guardamos la medida de la altura en una variable.
		altura = sc.nextDouble();
		
		//Calculamos y guardamos el valor de la base del triángulo.
		area = (base*altura)/2;
		
		//Imprimimos el mensaje final.
		System.out.print("El área de su triángulo mide " + area + " metros cuadrados.");
		
		sc.close();
	}

}
