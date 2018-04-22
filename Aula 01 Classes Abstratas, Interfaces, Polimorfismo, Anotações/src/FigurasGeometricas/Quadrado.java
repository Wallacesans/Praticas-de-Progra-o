package FigurasGeometricas;

public class Quadrado extends Poligono implements Diagonal{

	public Quadrado(double base, double altura) {
		super(base, altura);
		
	}

	@Override
	public double area() {
		
		return getBase() * getAltura();
	}

	@Override
	public double diagonal() {
		
		return getAltura() * Math.sqrt(2);
	}
	
	@Override
	public double perimetro() {
		
		return getAltura() * 2 + getBase() * 2; 
	}

}
