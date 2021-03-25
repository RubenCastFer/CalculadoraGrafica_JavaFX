package contenido;

public class Calculadora {
	
	private int a;
	private int b;
	
	
	public Calculadora() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Calculadora(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}
	
	public int suma(int a, int b) {
		int resul=0;
		resul=a+b;
		return resul;
	}
	
	public int restar(int a, int b) {
		int resul=0;
		resul=a-b;
		return resul;
	}
	
	public int multiplicar(int a, int b) {
		int resul=0;
		resul=a*b;
		return resul;
	}
	
	public int dividir(int a, int b) {
		int resul=0;
		resul=a/b;
		return resul;
	}
}
