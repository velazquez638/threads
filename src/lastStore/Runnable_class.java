package lastStore;



public class Runnable_class implements Runnable{

	private Costumer cliente;
	private Cajera cajera;
	private long initialTime;
	
	public Runnable_class (Costumer cliente, Cajera cajera, long initialTime){
		this.cajera = cajera;
		this.cliente = cliente;
		this.initialTime = initialTime;
	}

	public static void main(String[] args) {
		
		Costumer cliente1 = new Costumer("Juan Pedro", new int[] { 2, 2, 1, 5, 2, 3 });
		Costumer cliente2 = new Costumer("Manoli", new int[] { 1, 3, 5, 1, 1 });
		Costumer cliente3 = new Costumer("luis", new int[] { 1, 2, 5, 1, 1, 2, 4});

		
		Cajera cajera1 = new Cajera("Sara");
		Cajera cajera2 = new Cajera("Marta");
		Cajera cajera3 = new Cajera("Manuel");
		
		long initialTime = System.currentTimeMillis();
		
		Runnable proceso1 = new Runnable_class(cliente1, cajera1, initialTime);
		Runnable proceso2 = new Runnable_class(cliente2, cajera2, initialTime);
		Runnable proceso3 = new Runnable_class(cliente3, cajera3, initialTime);

		new Thread(proceso1).start();
		new Thread(proceso2).start();
		new Thread(proceso3).start();


	}

	@Override
	public void run() {
		this.cajera.procesarCompra(this.cliente, this.initialTime);
	}

}
