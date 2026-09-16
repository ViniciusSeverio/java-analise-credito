import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario;
		int score;
		
		System.out.println("Digite o salario bruto do cliente:");
			salario = sc.nextDouble();
		System.out.println("Digite o score:");	
			score = sc.nextInt();
			
			if (salario >= 3000 && score >= 700) {
				System.out.println("Crédito Aprovado.");
				
			}
			else if (salario >= 3000 && score < 700) {
				System.out.println("Crédito recusado por score.");
			}
			else if (salario < 3000 && score >= 700) {
				System.out.println("Crédito recusado por renda.");
				
			} else {
				System.out.println("Crédito recusado por renda e score.");
			}
			
	}
}
