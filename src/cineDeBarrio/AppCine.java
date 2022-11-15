package cineDeBarrio;


public class AppCine {

	public static void main(String[] args) {
	Espectador[] grupo;	
	Pelicula film1,film2,film3;
	Cine sala1;
	film1 =new Pelicula("STARWARS1",90,16,"Geroge Lucas");
	film2=new Pelicula("Los otros",70,18,"Amenabar");
	film3=new Pelicula("La sirenita",67,14,"Disney");
	sala1=new Cine(film3, 50);
	grupo=new Espectador[20];
	System.out.println("Mostramos la sala con las butacas");
	verButacas(sala1);
	wait(500);//esperamos a la ejecucion siguiente para marcar la diferencia
	System.out.println("Generamos un grupo de espectadores");
	generarEspectadores(grupo);
	verGrupo(grupo);
	wait(500);//esperamos medio segundo
	System.out.println("Asignamos plazas al grupo");
	AsignacionAutomatica(sala1, grupo);
	verGrupo(grupo);
	wait(500);
	System.out.println("Vemos las plazas ocupadas en rojo y las libres en blanco");
	verButacas(sala1);
	

	}
	
	protected static void generarEspectadores(Espectador[] grupo) {
		double saldo;
		int edad;
		for(int i=0; i<grupo.length;i++) {
			saldo=Math.random()*(100-10)+10;
			edad=(int)(Math.random()*(45-14)+14);
			grupo[i]=new Espectador("Espectador_"+(i+1),saldo, edad);
		}
	}
	 protected static void verButacas(Cine sala) {
		for (int i=0;i<8;i++) {
			for (int j=0; j<9; j++) {
				if(sala.getSala()[i][j].getLibre()) {
				System.out.print(sala.getSala()[i][j].getFila()+"-"+sala.getSala()[i][j].getColumna()+" ");
				wait(20);//queda mas vistoso
				}else {
						System.err.print(sala.getSala()[i][j].getFila()+"-"+sala.getSala()[i][j].getColumna()+" ");
						wait(20);//evita que se muestren más rápido que la generación
				}
			}System.out.println("");
		}
	}
	 protected static void AsignacionAutomatica(Cine sala, Espectador[] grupo) {
		 int edad, edadMin;
		 double saldo,precio;
		 boolean estaLibre=true;
		 for(int i=0;i<grupo.length;i++) {
			 edad=grupo[i].getEdad();
			 edadMin=(int)sala.getPelicula().getEdadMin();
			 saldo=grupo[i].getSaldo();
			 precio=sala.getPrecio();

			 if(edad>=edadMin&&saldo>=precio) {
			for(int j=0;j<sala.getSala().length;j++) {
				for(int z=0;z<sala.getSala()[j].length;z++) {
					estaLibre=sala.getSala()[j][z].getLibre();
					if(estaLibre) { 
						grupo[i].setPlaza(sala.getSala()[j][z].getFila(), sala.getSala()[j][z].getColumna(), false);
						sala.getSala()[j][z].setLibre(false);
						break;
					}
					}if(estaLibre) {break;}
				}
			}
			}
		}
	  
	 protected static void verGrupo(Espectador[] grupo) {
		 boolean estaLibre;
		 double saldo;
		for(int i=0; i<grupo.length;i++) {
			estaLibre=grupo[i].getPlaza().getLibre();
			saldo=Math.round(grupo[i].getSaldo()*100.0)/100.0;
			System.out.print("Nombre: "+grupo[i].getNombre()+" edad: "+grupo[i].getEdad()+
					" Saldo: "+saldo+" €. "+" Plaza: "+grupo[i].getPlaza().getFila()+"-"
					+grupo[i].getPlaza().getColumna());
					if (estaLibre) { 
						System.out.println("Sin asiento");
					}else System.out.println("");
		}
	}
	 protected static void  wait(int ms) {
		 try {
		        Thread.sleep(ms);
		    }
		    catch (InterruptedException ex) {
		        Thread.currentThread().interrupt();
	}
  }
}
