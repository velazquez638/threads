package lastStore;


public class Cajera {

	
	//la buena
	private String nombre;

	

	public Cajera(String nombre) {

		this.nombre=nombre;
	
	}


	public void procesarCompra(Costumer cliente, long timeStamp) {

		System.out.println("");
		System.out.println("-caja- nombre del responsable: " + this.nombre + 
				", procesando la compra del cliente: ");
		System.out.println(" nombre del cliente: " + cliente.getNombre() + 
				" tiempo empleado: " + (System.currentTimeMillis() - timeStamp) / 1000	+
				"seg");

		for (int i = 0; i < cliente.getCarroCompra().length; i++) { 
				this.esperarXsegundos(cliente.getCarroCompra()[i]); 
				System.out.println("Procesado el producto " + (i + 1) +  
				" ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + 
				"seg");
		}

		System.out.println("");
		System.out.println("La cajera " + this.nombre + " ha terminado el proceso de venta de " + 
				cliente.getNombre() + " EN EL TIEMPO: " + 
				(System.currentTimeMillis() - timeStamp) / 1000 + "seg");
		System.out.println("");

	}


	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}
