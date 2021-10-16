package br.com.udemy.CalculoArea;

public class CalculoArea {

	private double area;
	private double preco;
	
	public double calculaArea(double largura, double comprimento) {
		area = largura * comprimento;
		return area;
	}

	public double precoArea(double metroQuadrado) {
		preco = metroQuadrado * area;
		return preco;
	}

}
