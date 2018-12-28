package lastStore;



public class Principal_threat {


	public static void main(String[] args) {

		Costumer cliente1 = new Costumer("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Costumer cliente2 = new Costumer("Cliente 2", new int[] { 1, 3, 5, 1, 1 });
		Costumer cliente3 = new Costumer("Cliente 3", new int[] { 1, 2, 5, 1, 1, 2, 4});


		long initialTime = System.currentTimeMillis();
		Cajera_thread cajera1 = new Cajera_thread("Cajera 1", cliente1, initialTime);
		Cajera_thread cajera2 = new Cajera_thread("Cajera 2", cliente2, initialTime);
		Cajera_thread cajera3 = new Cajera_thread("Cajera 3", cliente3, initialTime);


		cajera1.start();
		cajera2.start();
		cajera3.start();

	}
} 
