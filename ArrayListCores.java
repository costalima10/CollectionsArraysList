package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListCores {

	public static void main(String[] args) {
		
		String cor;
		int op;
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();

		
		for(int x=0; x<5; x++) {
			System.out.println("\n DIGITE 5 CORES: ");
			cor = ler.nextLine(); 
			cores.add(cor);
			}
		
		System.out.println("\n LISTA DE CORES..");
		
       Iterator<String> icores = cores.iterator();
		
		while(icores.hasNext()) {
			System.out.println(icores.next());
		}
		
		Collections.sort(cores);
		System.out.println("\nCORES ORDENADAS"+cores);
			
		
			
		 }

}
