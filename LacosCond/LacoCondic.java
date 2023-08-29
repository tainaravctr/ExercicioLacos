package ExercicioUm;

import java.util.Scanner;

public class LacoCondic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner ler = new Scanner(System.in);

		 
	        System.out.print("Digite um número:");
	        int number = ler.nextInt();

	        
	        if (number < 0 && number % 2 == 0){
	        	
	            System.out.printf("O número %d é par e negativo", number);
	        } else if (number > 0 && number % 2 == 0){
	        	
	        	
	            System.out.printf("O número %d é par e positivo", number);
	        } else if (number < 0){
	        	
	        	
	            System.out.printf("O número %d é impar e negativo", number);
	        } else if (number % 2 != 0){
	        	
	        	
	            System.out.printf("O número %d é impar e positivo", number);
	        }

		
	}

}
