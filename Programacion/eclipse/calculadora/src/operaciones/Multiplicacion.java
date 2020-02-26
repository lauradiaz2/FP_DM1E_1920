package operaciones;

public class Multiplicacion extends Operaciones
{
	public Multiplicacion(int cod, double numero1, double numero2, double resultado) 
	{
		super(cod, numero1, numero2, resultado);
	}
	public void mult()
	{
		double resultado=0,n1=getOp1();
		int contador=0;
		while (contador<getOp2())
		{
			resultado+=n1;
			contador++;
		}
		setResult(resultado);
	}
}
