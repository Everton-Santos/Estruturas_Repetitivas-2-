package br.com.udemy.For;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int quantRep;
		int soma = 0;
		int numero;
		
		System.out.print("Quantidade de repetição: ");
		quantRep = sc.nextInt();
		
		try {
						
			for(int count = 0; count < quantRep; count++) {
				System.out.print("#" + (count + 1) + " = ");
				numero = sc.nextInt();
				soma += numero;
			}
			
			System.out.println("Soma = " + soma);
			
		} catch (NullPointerException n) {
			System.err.println("A váriavel não pode ser nula;");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}

	}

}
