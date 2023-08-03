package ExercicioUm;

import java.util.Scanner;

public class LacoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int menuitem;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("\n\t\tMenu do restaurante:");
			System.out.println("\n1- Cachorro Quente");
			System.out.println("\n2- X-Salada");
			System.out.println("\n3- X-Bacon");
			System.out.println("\n4- Bauru");
			System.out.println("\n5- Refrigerante");
			System.out.println("\n6- Suco de laranja");
			System.out.println("\nDigite sua opção: ");
			menuitem = ler.nextInt();
			
			switch(menuitem) {
			case 1:
				System.out.println("\nO Cachorro Quente custa R$10.00");
				break;
			case 2:
				System.out.println("\nO X-Salada custa R$15.00");
				break;
			case 3:
				System.out.println("\nO X-Bacon custa R$18.00");
				break;
			case 4:
				System.out.println("\nO Bauru custa R$12.00");
				break;
			case 5:
				System.out.println("\nO Refrigerante custa R$8.00");
				break;
			case 6:
				System.out.println("\nO Suco de laranja custa R$13.00");
				break;
			default:
				System.out.println("\nOpção inválida.");
			}
			
			
		}

	}


