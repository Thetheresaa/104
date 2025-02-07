import pacchetto.Persona;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
    	
		
	        Scanner input = new Scanner(System.in);
	        Persona prova = new Persona ("Pippo", "Rossi","scemochilegge1315");
	   
		
	        System.out.println("Cosa vuoi fare?");
	        System.out.println("Premi 1 per stampare ciao");
	        System.out.println("Premi 2 per uscire");

	        Integer scelta = null; // La variabile scelt la devi dichiarare
	        try
	         {
	             scelta = input.nextInt();
	         }catch (InputMismatchException e) {
	        	 e.printStackTrace();
	        	 return;
	         }
	        
	        // scelta = input.nextInt(); Questo è inutile
	       

	    boolean check = true;
	   
	    switch(scelta) {
	        case 1:
	            System.out.println("Ciao");
	            break;
	        case 2:
	            System.out.println("Esco");
	            break;
	        case 3:
	            System.out.println("Hai inserito un valore non valido");
	            break;
	    }while(check);
	    

	}
}
