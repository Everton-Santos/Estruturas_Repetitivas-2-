package br.com.udemy.CalculoArea;

import java.util.Locale;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Largura: ");
		double largura = sc.nextDouble();
		
		System.out.print("Comprimento: ");
		double comprimento = sc.nextDouble();
		
		System.out.print("Metro Quadrado: ");
		double metroQuadrado = sc.nextDouble();
		
		CalculoArea ca = new CalculoArea();
		System.out.printf("Area = %.2f metros\n", ca.calculaArea(largura, comprimento));
		System.out.printf("Preço = %.2f$\n", ca.precoArea(metroQuadrado));
	}
}
