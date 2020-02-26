package operaciones;

public class Operaciones 
{
	private int cod;
	private double op1;
	private double op2;
	private double result;
	private String codigo;

	//cada operación tendrá dos operandos y un código de operación
	public Operaciones(int cod, double numero1, double numero2, double resultado)
	{
		this.cod = cod;
		this.op1 = numero1;
		this.op2 = numero2;
		result = resultado;
	}
	public String sim()
	{
		switch (getCod()) {
		case 0:
			setCodigo("+");
		break;
		case 1:
			setCodigo("-");
		break;
		case 2:
			setCodigo("*");
		break;
		case 3:
			setCodigo("/");
		break;
		}
		return getCodigo();
	}
	public String mostrarOper()
	{
		String mensaje;
		mensaje=getOp1()+" "+sim()+" "+getOp2()+" = "+getResult();
		//setOp1(getResult());
		return mensaje;
	}

//	SETTERS Y GETTERS
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public double getOp1() {
		return op1;
	}

	public void setOp1(double op1) {
		this.op1 = op1;
	}

	public double getOp2() {
		return op2;
	}

	public void setOp2(double op2) {
		this.op2 = op2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	public String getCodigo() 
	{
		return codigo;
	}
	public void setCodigo(String codigo) 
	{
		this.codigo = codigo;
	}
	
	
		
}
