package FigurasGeometricas;

public abstract class Poliedro extends Figura {
	
	private double base;
	private double altura;
	private double comprimento;
	
	public Poliedro(double base, double altura, double comprimento) {
		super();
		this.base = base;
		this.altura = altura;
		this.comprimento = comprimento;
	}	
	
	public abstract double volume();
	
	
	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}


	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
