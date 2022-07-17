package ej3;
//FALTA ENUM
public class Electrodomestico {
	
	// Constantes
	private final double PRECIO_BASE = 100;
	private final String COLOR = "blanco";
	private final String CONSUMO = "F";
	private final double PESO = 5;
	
	// Atributos
	private double precio_base;
	private String color;
	private String consumo;
	private double peso;
	
	// Constructores
	public Electrodomestico() {
		this.precio_base = PRECIO_BASE;
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.peso = PESO;
	}
	
	public Electrodomestico(double precio_base, double peso) {
		this.precio_base = precio_base;
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.peso = peso;
	}
	
	public Electrodomestico(double precio_base, String color, String consumo, double peso) {
		if(controlar_color(color).equals(null)) {
			System.out.println("Ese color no está disponible.");
		} else {
			this.precio_base = precio_base;
			this.color = color;
			this.consumo = consumo;
			this.peso = peso;
		}
	}

	// Getters y setters
	public double getPrecio_base() {
		return precio_base;
	}

	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	// Otros métodos
	public String controlar_color(String color) {
		switch(color) {
		case "blanco":
		case "negro":
		case "rojo":
		case "azul":
		case "gris":
			return color;
		default:
			return null;
		}
	}
}
