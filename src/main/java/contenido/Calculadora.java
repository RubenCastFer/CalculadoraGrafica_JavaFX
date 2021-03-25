package contenido;

public class Calculadora {
	
	private Double a;
	private Double b;
	
	
	public Calculadora() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Calculadora(Double a, Double b) {
		super();
		this.a = a;
		this.b = b;
	}


	public Double getA() {
		return a;
	}


	public void setA(Double a) {
		this.a = a;
	}


	public Double getB() {
		return b;
	}


	public void setB(Double b) {
		this.b = b;
	}
	
	public Double suma(Double a, Double b) {
		Double resul=0.0;
		resul=a+b;
		return resul;
	}
	
	public Double restar(Double a, Double b) {
		Double resul=0.0;
		resul=a-b;
		return resul;
	}
	
	public Double multiplicar(Double a, Double b) {
		Double resul=0.0;
		resul=a*b;
		return resul;
	}
	
	public Double dividir(Double a, Double b) {
		Double resul=0.0;
		resul=a/b;
		return resul;
	}
}
