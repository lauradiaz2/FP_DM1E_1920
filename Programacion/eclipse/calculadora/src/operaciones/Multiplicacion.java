package operaciones;

public class Multiplicacion extends Operaciones
{
	public void mult()
	{
		double result=0,n1,n2;
		n1=Double.parseDouble(calc.getOp1());
		n2=Double.parseDouble(calc.getOp2());
		while (n2>0)
		{
			result+=n1;
			n2--;
		}
		setResult(String.valueOf(result));
	}
}
