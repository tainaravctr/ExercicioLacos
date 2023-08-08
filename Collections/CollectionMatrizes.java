package ExercicioUm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionMatrizes {
	

	  public static void main(String[] args) {

	        Set<Integer> numbers = new HashSet<>(); 
	        Scanner ler =new Scanner(System.in);



	        for (int i = 0; i <10 ; i++) {
	            System.out.println("Digite os numeros desejados:");

	           int l = ler.nextInt();

	           numbers.add(l);

	        }
	        System.out.println(numbers);
	        System.out.println("\n\tDados Listados");

	        for (Integer l:numbers){
	            System.out.println(l);
	        }

		
	        
			System.out.println("\n*******************************************************************");



	        
	    



}}
