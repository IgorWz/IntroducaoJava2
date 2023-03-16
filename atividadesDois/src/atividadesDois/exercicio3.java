package atividadesDois;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		String nome;
		int idade;
		boolean doou;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nNome do doador: ");
		nome = leia .nextLine();
		System.out.println("\nIdade do doador: ");
		idade = leia .nextInt();
		System.out.println("\nVocê já realizou doação de sangue alguma vez ?: ");
		doou = leia .nextBoolean();
		
		if (idade >= 18 && idade <= 60) {
			System.out.println("\nEstá apto a doar sangue");
		}else if (idade > 60 && idade <= 69 && doou == true) {
			System.out.println("\nEstá apto a doar sangue");
		}else if (idade > 60 && idade <= 69 && doou == false) {
			System.out.println("\nNão esta apto a doar sangue");
		}else {
			System.out.println("\nNão esta apto a doar sangue");
		}
		
		
		
	}

}
