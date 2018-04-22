package FigurasGeometricas;

public class Esfera extends Poliedro{
	private double raio;

	public Esfera(double raio, double base, double altura, double comprimento) {
		super(base, altura, comprimento);
		this.raio = raio;
	}

	@Override
	public double volume() {
		return (4*3.14*Math.cbrt(raio))/3;
	}

	@Override
	public double area() {
		return 4*3.14*Math.pow(raio, 2);
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
