package br.com.udemy.While;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valores para somar");
		System.out.println("Ao digitar '0' o programa se encerra! ");
		
		try {
			int numero = sc.nextInt();
			int soma = 0;
			
			while(numero != 0) {
				soma += numero;
				numero = sc.nextInt();
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
