package vetoresAula1;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for (int i=0; i<vet.length; i++) {
			vet[i] = sc.nextDouble();
		}
		for (int i=0; i<vet.length; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		
		
		
		sc.close();
	}

}
