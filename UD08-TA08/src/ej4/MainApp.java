package ej4;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String titulo, genero, creador;
		int numero_temporadas;
		
		System.out.println("Escribe el título:");
		titulo = sc.nextLine();
		System.out.println("Escribe el número de temporadas:");
		numero_temporadas = sc.nextInt();
		sc.nextLine();
		System.out.println("Escribe el género:");
		genero = sc.nextLine();
		System.out.println("Escribe el creador:");
		creador = sc.nextLine();
		
		Serie serie1 = new Serie();		
		Serie serie2 = new Serie(titulo, creador);
		Serie serie3 = new Serie(titulo, numero_temporadas, genero, creador);
		
		sc.close();

	}

}
