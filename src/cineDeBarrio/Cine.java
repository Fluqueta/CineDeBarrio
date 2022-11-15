package cineDeBarrio;

public class Cine {
	private Asiento[][] sala;
	private Pelicula pelicula;
	private double precio;
	
	public Cine(Pelicula pelicula, double precio) {
		setSala();
		setPelicula(pelicula);
		setPrecio(precio);
	}
	
	protected void setSala() {
		sala=new Asiento[8][9];
		for (int i=0;i<=7;i++) {
			for (int j=0;j<=8;j++) {
				sala[i][j]=new Asiento((sala[i].length-i-1), (char)(j+65));
			
			}
		}
	}
	
	protected void setPelicula(Pelicula pelicula) {
		this.pelicula=pelicula;
	}
	
	protected void setPrecio(double precio) {
		this.precio=precio;
	}
	
	public Pelicula getPelicula() {
		return this.pelicula;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	public Asiento[][] getSala() {
		return sala;
	}
}
