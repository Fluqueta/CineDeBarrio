package cineDeBarrio;

public class Asiento {
	private int fila;
	private char columna;
	private boolean libre;
	
	public Asiento(int fila, char columna){
		setFila(fila);
		setColumna(columna);
		setLibre(true);
	}
	protected void setFila(int Fila) {
		this.fila=Fila;
	}
	protected void setColumna(char columna) {
		this.columna=columna;
	}
	protected void setLibre(boolean libre) {
		this.libre=libre;
	}
	public char getColumna() {
		return this.columna;
	}
	public int getFila() {
		return this.fila;
	}
	public boolean getLibre() {
		return this.libre;
	}
}
