package atividadesDois;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		double num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		num = leia.nextInt();
		
		if(num>=0 && num % 2 == 0){
			System.out.println("\nO número "+num+" é par e positivo");
		}
		else if(num>=0 && num % 2 != 0){
			System.out.println("\nO número "+num+" é positivo e impar");
		}
		else if(num<0 && num % 2 == 0) {
			System.out.println("\nO número"+num+" é negativo e par");
		}
		else if(num<0 && num % 2 != 0) {
			System.out.println("\nO número"+num+" é negativo e impar");
		}
	}

}
