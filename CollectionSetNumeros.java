package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSetNumeros {

	public static void main(String[] args) {
		
		int num;
		Scanner ler = new Scanner(System.in);
		
		Set<Integer> numero = new HashSet<Integer>();
		
		
		for(int x=0; x<10; x++) {
			System.out.println("\n DIGITE 10 NUMEROS: ");
			num = ler.nextInt();
			numero.add(num);
		}
		
		System.out.println("\n LISTA DE DADOS.."+numero);
		

			
		
	}

}
