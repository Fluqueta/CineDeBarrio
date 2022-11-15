package cineDeBarrio;

public class Pelicula {
	private String titulo;
	private double tiempo;
	private int edadMin;
	private String director;

	public Pelicula(String titulo, double tiempo, int edad, String director) {
	setTitulo(titulo);
	setTiempo(tiempo);
	setEdadMin(edad);
	setDirector(director);
	}
	public Pelicula() {
		this("", 90, 16, "");
	}
	protected void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	protected void setTiempo(double tiempo) {
		this.tiempo=tiempo;
	}
	protected void setEdadMin(int edadMin){
		this.edadMin=edadMin;
	}
	protected void setDirector(String director) {
		this.director=director;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public double getTiempo() {
		return this.tiempo;
	}
	public double getEdadMin() {
		return this.edadMin;
	}
	public String getDirector() {
		return this.director;
	}
	
}
