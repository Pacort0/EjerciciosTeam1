package ejerciciostema1;
import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		////Creamos el Scanner, que usaremos para leer los datos que el usuario introduzca desde la consola.
		Scanner sc = new Scanner (System.in);
		//Creamos las variables en las que guardaremos tanto los datos que se introduzcan por consola como las operaciones que realicemos.
		int num1;
		int num2;
		int numSuma;
		int resto;
		
		//Imprimimos por pantalla los mensajes iniciales, pidiéndole al usuario que introduzca dos números.
		System.out.print("Introduzca el primer número: ");
		//Guardamos el primer número introducido por el usuario.
		num1 = sc.nextInt();
		System.out.print("Introduzca el segundo número: ");
		//Guardamos el segundo número introducido por el usuario.
		num2 = sc.nextInt();
		
		//Calculamos el resto resultante de la división de ambos números.
		resto = num1%num2;
		//Usamos un operador ternario para asignar el valor correcto a la variable que vamos a usar para guardar el valor de la suma necesario.
		numSuma = resto == 0 ? 0 : num2 - resto;
		
		//Imprimimos el mensaje final.
		System.out.print("A " + num1 + " hay que sumarle " + numSuma + " para que sea múltiplo de " + num2);
		sc.close();
	}

}
