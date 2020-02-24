package operaciones;

public class Resta extends Operaciones
{
	public Resta(int cod, double numero1, double numero2, double resultado) 
	{
		super(cod, numero1, numero2, resultado);
	}

	public void resta(String a, String b)
	{
		setResult(getOp1()-getOp2());
	}
}
