package operaciones;

public class Operaciones 
{
	private int cod;
	private static double op1;
	private double op2;
	private static double result;

	//cada operación tendrá dos operandos y un código de operación
	public Operaciones(int cod, double numero1, double numero2, double resultado)
	{
		this.cod = cod;
		this.op1 = numero1;
		this.op2 = numero2;
		this.result = resultado;
	}
	
	//metodo
	

//	SETTERS Y GETTERS
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public static double getOp1() {
		return op1;
	}

	public static void setOp1(double op1) {
		Operaciones.op1 = op1;
	}

	public double getOp2() {
		return op2;
	}

	public void setOp2(double op2) {
		this.op2 = op2;
	}

	public static double getResult() {
		return result;
	}

	public static void setResult(double result) {
		Operaciones.result = result;
	}


		
}
