package ExercicioUm;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		int idade;
		int contum= 0;
		int contdois = 0;
		
		System.out.println("Digite sua idade: ");
		idade=ler.nextInt();
		
		
		while (idade >0) {
			
			if(idade <21) {
				contum++;	
				
		}else if(idade >50) {
			contdois++;

	}
			System.out.println("Digite sua idade: ");
			idade=ler.nextInt();
			
		}
			
			System.out.println("Total de pessoas menores de 21 anos:" +contum);
			System.out.println("Total de pessoas maiores de 50 anos:" +contdois);

		
	}}
