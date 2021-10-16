package br.com.udemy.CalculoArea;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Largura: ");
			double largura = sc.nextDouble();
			
			System.out.print("Comprimento: ");
			double comprimento = sc.nextDouble();
			
			System.out.print("Metro Quadrado: ");
			double metroQuadrado = sc.nextDouble();
			
			CalculoArea ca = new CalculoArea();
			System.out.printf("\nArea = %.2f metros\n", ca.calculaArea(largura, comprimento));
			System.out.printf("Preço = %.2f$\n", ca.precoArea(metroQuadrado));
			
			System.out.println("\nPrograma encerrado com sucesso!");
			
		} catch (NullPointerException n) {
			System.err.println("\n*** O campo não pode ser nulo ***");
		} catch (InputMismatchException e) {
			System.err.println("\n*** Caracter inválido ***");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
		
	}
}
