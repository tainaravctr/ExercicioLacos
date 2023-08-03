package ExercicioUm;

import java.util.Scanner;

public class RepeticaoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner ler = new Scanner(System.in);
		
		int i;
	
		
		System.out.println("\nDigite o primeiro número: ");
		int numberone = ler.nextInt();
		
		System.out.println("\nDigite o segundo número: ");
		int numbertwo = ler.nextInt();
		
		if (numberone>numbertwo) {
			System.out.println("intervalo inválido");
		}else {
		for(i = numberone; i <= numbertwo; i++){
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("\nÉ divisivel por 3 e 5 " +i);
			}
			}
		}
	}

}
