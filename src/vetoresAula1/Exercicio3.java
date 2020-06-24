package vetoresAula1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(), menor=0;
		//nome, idade, altura
		String[] nome = new String[N];
		int[] idade = new int[N];
		double[] altura = new double[N];
		
		for (int i=0; i < N; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
			if(idade[i] < 16) {
				menor = menor + 1;
			}
			altura[i] = sc.nextDouble();
		}
	
		//altura media
		double soma=0.0, mediaAlt=0.0;
		for (int i=0; i<N; i++) {
			soma = soma + altura[i];
			
		}
		mediaAlt = soma / N;
		System.out.printf("Altura média: %.2f%n", mediaAlt);
		//porcentagem menores
		double percetualMenor = (menor * 100) / N;
		System.out.println("Pessoas com menos de 16 anos: " + percetualMenor + "%%");
		
		sc.close();
	}

}
