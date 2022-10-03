package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Creamos el Scanner, que usaremos para leer los datos que el usuario introduzca desde la consola.
		Scanner sc = new Scanner(System.in);
		//Creamos las variable que usaremso para guardar tanto los datos introducidos por consola como las operaciones que realicemos.
		double importeTotal;
		int nEntradasNinio;
		int nEntradasAdulto;
		double descuento;
		//Estas dos variables son estáticas porque corresponden a valores de precios inamovibles.
		final double entradaNinio = 15.50;
		final double entradaAdulto = 20;
		
		//Imprimimos los mensajes iniciales por consola, pidiéndole al usuario que introduzca los datos necesarios.
		System.out.print("Introduzca el número de entradas infantiles que desea adquirir: ");
		//Guardamos el número de entradas infantiles en una variable.
		nEntradasNinio = sc.nextInt();
		System.out.print("Introduzca el número de entradas para adultos que desea adquirir: ");
		//Guardamos el número de entradas adultas en una variable.
		nEntradasAdulto = sc.nextInt();
		
		//Calculamos el valor del importe total.
		importeTotal = (nEntradasNinio * entradaNinio)+(nEntradasAdulto * entradaAdulto);
		//Calculamos el valor del descuento en función del valor del importe total.
		descuento = importeTotal * 0.05;
		//Usamos un operador ternario para determinar si se aplica el descuento o no.
		importeTotal = importeTotal >= 100 ? importeTotal-descuento : importeTotal;
		
		//Imprimimos el mensaje final.
		System.out.print("El importe final de su compra es de " + importeTotal);
		sc.close();
	}

}
