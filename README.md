# threads


Firstly the programe show a short menu. The options of this menu are titles which are in a containers. 

Through the interface i define the void which show the menu lines. When i have defined the interface i have created three classes whith 

the menu options. After that i only need to call the container in the main menu with the parameters that i have created.


In this code we define the interface:



      public interface Interfaz {

	public abstract void mensaje();
     }




In this code we define the container:



        public class Contenedor {

	private Interfaz interfaz;
	 
	public Contenedor(Interfaz interfaz){
	 
	this.interfaz=interfaz;
	 
	}
	 
	public void mensaje(){
	 
		interfaz.mensaje();
	 
	}



Now we generate de message that we wont send to the container:




        public class Books implements Interfaz{

	 public void mensaje(){
			 
			 System.out.println("Show all books");

			}

	}


When we have these procces we create the calls in the main manu: 



                Interfaz titulo = new Titulo();
		Interfaz exit = new Exit();
		Interfaz List = new Books();
		
		
                Contenedor contenedor = new Contenedor(titulo); 
	        contenedor.mensaje(); // the code show us the title
			
		contenedor = new Contenedor(List);
	        contenedor.mensaje();  // the code show us the list books option
		    
		contenedor = new Contenedor(exit);
	        contenedor.mensaje();   // the code show us the exit option
 













 
 
