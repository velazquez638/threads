package lastStore;

public class Contenedor {

	private Interfaz interfaz;
	 
	public Contenedor(Interfaz interfaz){
	 
	this.interfaz=interfaz;
	 
	}
	 
	public void mensaje(){
	 
		interfaz.mensaje();
	 
	}

}
