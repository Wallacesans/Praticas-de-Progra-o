package FigurasGeometricas;

public class Circulo extends Figura {
	
	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double area() {
		
		return 3.14*Math.pow(raio, 2);
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
