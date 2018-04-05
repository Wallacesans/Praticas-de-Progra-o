package FigurasGeometricas;

import java.util.ArrayList;

public class Geometria {
	
	public static void main(String[] args) {
		
		ArrayList<Figura> figuras = new ArrayList<>();
		
		figuras.add(new Circulo(5));
		figuras.add(new Triangulo(4,7));
		figuras.add(new Retangulo(5,9));
		figuras.add(new Losango(3,7));
		figuras.add(new Quadrado(4,4));
		figuras.add(new Trapezio(6,5));
		
		
		
		for(Figura fig:figuras) {
			
			System.out.println("Area = " + fig.area());
			System.out.println("Perimetro = " + fig.perimetro());
			System.out.println("diagonal = " + fig.diagonal());
			
			
		}
		
		ArrayList<Poliedro> poliedros = new ArrayList<>();
		
		
		poliedros.add(new Cubo(2,5,6));
		poliedros.add(new Cilindro(5,4,7,2));
		poliedros.add(new Piramide(3,5,6));
		poliedros.add(new Esfera(5,3,8,9));
		
		for (Poliedro pol:poliedros) {
			
			System.out.println("Area = " + pol.area());
			System.out.println("Volume = "+ pol.volume());
			
		}
		
	}

	

}
