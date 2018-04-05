package FigurasGeometricas;

public class Cilindro extends Poliedro {
	private double raio;

	public Cilindro(double raio, double base, double altura, double comprimento) {
		super(base, altura, comprimento);
		this.raio = raio;
	}

	@Override
	public double volume() {
		return 3.14*Math.pow(raio, 2) * getAltura();
	}

	@Override
	public double area() {
		return (3*3.14*raio)*raio + getAltura();
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
