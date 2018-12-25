package lastStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	
	static List<Books_dates> books_list = new ArrayList<Books_dates>();

	
	
	
	public static void main(String[] args){
		books_list.add(new Books_dates("-Horror-", "las Almas", "Pepe Villuela", 20 ));
		books_list.add(new Books_dates("-action-", "el Bosque oscuro", "Andres de la Huerta", 19 ));
		books_list.add(new Books_dates("-comedi-", "las Calles", "Sergio Perez", 15 ));
		books_list.add(new Books_dates("-Horror-", "el Camino", "Ana Claus", 10 ));
		books_list.add(new Books_dates("-Horror-", "la Carretera", "Marian Dos", 30));
		books_list.add(new Books_dates("-thriller-", "las luces", "Mario Gaus", 26 ));
		books_list.add(new Books_dates("-action-", "el dia mas oscuro", "Macian Perez", 12 ));
		books_list.add(new Books_dates("-comedi-", "las niñas del patio", "Paco Sanz", 5 ));
		books_list.add(new Books_dates("-thriller-", "el señor de la puerta", "Roberto Alamo", 15 ));
		books_list.add(new Books_dates("-comedi-", "la señal", "Luis el Pillo", 35 ));
		
		Interfaz titulo = new Titulo();
		Interfaz exit = new Exit();
		Interfaz List = new Books();


		
		@SuppressWarnings("resource")
		Scanner respuesta1 = new Scanner (System.in);
		int respuesta = 0;
		while (respuesta!=3) {
			
			System.out.println("");
			System.out.println("");
			System.out.println("select 1, 2 or 3");
			System.out.println("");


			Contenedor contenedor = new Contenedor(titulo); 
		    contenedor.mensaje(); // the code show us the title
			
		    contenedor = new Contenedor(List);
			contenedor.mensaje();
		    
		    contenedor = new Contenedor(exit);
			contenedor.mensaje();
			
			
		  
			respuesta = respuesta1.nextInt();

			switch(respuesta){
			case 1:
				
				Costumer cliente1 = new Costumer("Juan Pedro", new int[] { 2, 2, 1, 5, 2, 3 });
				Costumer cliente2 = new Costumer("Manoli", new int[] { 1, 3, 5, 1, 1 });
				Costumer cliente3 = new Costumer("luis", new int[] { 1, 2, 5, 1, 1, 2, 4});


				Cajera cajera1 = new Cajera("Sara");
				Cajera cajera2 = new Cajera("Ana");
				Cajera cajera3 = new Cajera("Manuel");


				long initialTime = System.currentTimeMillis();

				cajera1.procesarCompra(cliente1, initialTime);
				cajera2.procesarCompra(cliente2, initialTime);
				cajera3.procesarCompra(cliente3, initialTime);


				break;
			case 2:
				for (int i=0; i<=books_list.size() -1 ; i++) {
		    		   
		   			System.out.println("categorie name: " + books_list.get(i).categorie + "Book name: " + books_list.get(i).name + 
		   					"Author name: " + books_list.get(i).author + "Book price: " + books_list.get(i).price);

		    	   }
					
				break;
				
			case 3:

				
				break;
		
				
			}
			
			System.out.println("\t--------------------------------");
			System.out.println("\tThanks for coming come back soon");
			System.out.println("\t--------------------------------");

		
		}
		
	}
	
	

}
