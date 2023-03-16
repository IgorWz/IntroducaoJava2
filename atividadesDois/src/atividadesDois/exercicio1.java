package atividadesDois;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		int a,b,c,soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número A: ");
		a = leia.nextInt();
		
		System.out.println("\nDigite o número B: ");
		b = leia.nextInt();
		
		System.out.println("\nDigite o número C: ");
		c = leia.nextInt();
		
		soma = a+b;
		
		if(soma>c){
			System.out.println("\nA soma é maior");
		}
		else if(soma<c){
			System.out.println("\nA soma é menor");
		}
		else if(soma == c){
			System.out.println("\nA soma é igual");
		}
	}

}
