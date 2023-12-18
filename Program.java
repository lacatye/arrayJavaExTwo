package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitas?: ");
		int n = sc.nextInt();
	
		String[] name = new String[n];
		int[] age = new int[n];
		double[] height = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			name[i] = sc.next();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			System.out.print("Altura: ");
			height[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for(int i=0; i<n; i++) {
			soma = soma + height [i];
		}
		
		double media = soma / n;
		
		System.out.printf("Altura média: %.2f%n", media);
		
		int count = 0;
		for(int i=0; i<n; i++) {
			if (age[i] < 16) {
				count = count + 1;
			}
		}
		
		double percentage = count * 100 / n;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%", percentage);
		
		
		sc.close();
	}

}
