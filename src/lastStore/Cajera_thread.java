package lastStore;


public class Cajera_thread extends Thread{

	private String nombre;
	private Costumer cliente;
	private long initialTime;

	public Cajera_thread(String nombre, Costumer cliente, long initialTime) {
		
		this.nombre=nombre;
		this.cliente=cliente;
		this.initialTime=initialTime;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Costumer getCliente() {
		return cliente;
	}

	public void setCliente(Costumer cliente) {
		this.cliente = cliente;
	}

	public long getInitialTime() {
		return initialTime;
	}

	public void setInitialTime(long initialTime) {
		this.initialTime = initialTime;
	}
	@Override
	public void run() {

		System.out.println("-caja- nombre de responsable: " + this.nombre + " procesando la compra del cliente, nombre del cliente: " 
					+ this.cliente.getNombre() + " tiempo empleado: " 
					+ (System.currentTimeMillis() - this.initialTime) / 1000 
					+ "seg" + "\n" );

		for (int i = 0; i < this.cliente.getCarroCompra().length; i++) { 
			this.esperarXsegundos(cliente.getCarroCompra()[i]); 
			System.out.println("Procesado el producto " + (i + 1) 
			+ " del cliente " + this.cliente.getNombre() + "->Tiempo: " 
			+ (System.currentTimeMillis() - this.initialTime) / 1000 
			+ "seg");
		}

		System.out.println("La cajera " + this.nombre + " ha terminado el proceso de venta " 
						+ this.cliente.getNombre() + "tiempo empleado: " 
						+ (System.currentTimeMillis() - this.initialTime) / 1000 
						+ "seg"+ "\n");
		
	}

	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}
