package ej1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, dni, sexo;
		int edad;
		double peso, altura;
		
		System.out.println("Escribe el nombre:");
		nombre = sc.nextLine();
		System.out.println("Escribe la edad:");
		edad = sc.nextInt();
		sc.nextLine();
		System.out.println("Escribe el DNI:");
		dni = sc.nextLine();
		System.out.println("Escribe el sexo:");
		sexo = sc.nextLine();
		System.out.println("Escribe el peso:");
		peso = sc.nextDouble();
		sc.nextLine();
		System.out.println("Escribe la altura:");
		altura = sc.nextDouble();
		sc.nextLine();

		Persona persona1 = new Persona();
		Persona persona2 = new Persona(nombre, edad, sexo);
		Persona persona3 = new Persona(nombre, edad, dni, sexo, peso, altura);		
		
		System.out.println(persona1.getSexo());
		
		sc.close();
	}

}
