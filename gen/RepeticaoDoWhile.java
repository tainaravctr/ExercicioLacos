package ExercicioUm;

import java.util.Scanner;

public class RepeticaoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner ler = new Scanner (System.in); 
		
		
		int adicao = 0;
		int number = 0;
		float result = 0;
		float media = 0;
		
		
		
		do{
			System.out.printf("Digite sua média: ");
			number=ler.nextInt();
			
			if(number %3 == 0 && number>0) {
				adicao= adicao+number;
				media++;
			}
			
		}
		
		
		
		while(number != 0);
		
		result =adicao/media;
		System.out.println("A média de todos os números múltiplos de 3 é: "+result);
		
		
	}

}
