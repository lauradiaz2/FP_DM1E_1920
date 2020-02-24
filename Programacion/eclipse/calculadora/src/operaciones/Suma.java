package operaciones;

public class Suma extends Operaciones
{
	
	public Suma(int cod, double numero1, double numero2, double resultado) 
	{
		super(cod, numero1, numero2, resultado);
		// TODO Auto-generated constructor stub
	}

	public void sum()
	{
		setResult(getOp1()+getOp2());
	}
}
