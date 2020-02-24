package operaciones;

public class Multiplicacion extends Operaciones
{
	public Multiplicacion(int cod, double numero1, double numero2, double resultado) 
	{
		super(cod, numero1, numero2, resultado);
		// TODO Auto-generated constructor stub
	}

	public void mult()
	{
		double resultado=0,n1=getOp1();
		while (getOp2()>0)
		{
			resultado+=n1;
		}
		setResult(resultado);
	}
}
