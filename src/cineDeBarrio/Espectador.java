package cineDeBarrio;

public class Espectador {
	private String nombre;
	private double saldo;
	private int edad;
	private Asiento plaza;
	
	public Espectador(String nombre, double saldo, int edad) {
		setNombre(nombre);
		setSaldo(saldo);
		setEdad(edad);
		this.plaza=new Asiento(0, '0');
	
	}
	public  Espectador() {
		this("", 0, 18);
	}
	protected void setNombre(String nombre) {
		this.nombre=nombre;
	}
	protected void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	protected void setEdad(int edad) {
		this.edad=edad;
	}
	protected void setPlaza(int fila, char columna, boolean libre) {
		this.plaza.setFila(fila);
		this.plaza.setColumna(columna);
		this.plaza.setLibre(libre);
	}
	public String getNombre() {
		return this.nombre;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public int getEdad() {
		return this.edad;
	}
	public Asiento getPlaza(){
		return this.plaza;
	}
}
