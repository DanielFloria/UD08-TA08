package ej3;
//FALTA ENUM
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double precio, peso;
		String color, consumo;
		
		System.out.println("Escribe el precio:");
		precio = sc.nextDouble();
		sc.nextLine();
		System.out.println("Escribe el color:");
		color = sc.nextLine();
		System.out.println("Escribe el consumo:");
		consumo = sc.nextLine();
		System.out.println("Escribe el peso:");
		peso = sc.nextDouble();
		sc.nextLine();
		

		Electrodomestico electrodomestico1 = new Electrodomestico();
		Electrodomestico electrodomestico2 = new Electrodomestico(precio, peso);
		Electrodomestico electrodomestico3 = new Electrodomestico(precio, color, consumo, peso);
		
		sc.close();

	}

}
