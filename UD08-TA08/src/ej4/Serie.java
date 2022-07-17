package ej4;

public class Serie {
	// Atributos
	private String titulo;
	private int numero_temporadas = 3;
	private boolean entregado = false;
	private String genero;
	private String creador;
	
	// Constructores
	public Serie() {
		
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie(String titulo, int numero_temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numero_temporadas = numero_temporadas;
		this.genero = genero;
		this.creador = creador;
	}

	// Getters y setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumero_temporadas() {
		return numero_temporadas;
	}
	public void setNumero_temporadas(int numero_temporadas) {
		this.numero_temporadas = numero_temporadas;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
}
