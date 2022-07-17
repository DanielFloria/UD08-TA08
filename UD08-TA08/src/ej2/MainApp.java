package ej2;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int longitud;
		
		
		System.out.println("Escribe la longitud de la contraseña:");
		longitud = sc.nextInt();
		sc.nextLine();
		

		Password password1 = new Password();
		Password password2 = new Password(longitud);
		
		password1.toString();
		
		sc.close();

	}

}
