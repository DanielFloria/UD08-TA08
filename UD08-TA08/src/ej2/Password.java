package ej2;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Random;

public class Password {
	// Atributos
	private int longitud = 8;
	private String contrasena;
	
	// Constructores
	public Password() {
		this.contrasena = generar_contrasena(longitud);
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena = generar_contrasena(longitud);
	}

	// Getters y setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	// Otros métodos
	public String generar_contrasena(int longitud) {
		String todos_caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String[] array = new String[longitud];
		int posicion_caracter;
		String nueva_contrasena = "";
		
		for(int i = 0; i < longitud; i++) {
			posicion_caracter = (int)(Math.random() * (todos_caracteres.length() - 1));
			nueva_contrasena += todos_caracteres.charAt(posicion_caracter);
		}
		
		return nueva_contrasena;
	}
	
	@Override
	public String toString() {
		return this.getContrasena();
	}
}
