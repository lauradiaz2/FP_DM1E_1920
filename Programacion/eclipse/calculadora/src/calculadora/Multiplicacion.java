package calculadora;

public class Multiplicacion extends Operaciones
{
	public void mult()
	{
		double result=0,n1,n2;
		n1=Double.parseDouble(getNumero1());
		n2=Double.parseDouble(getNumero2());
		while (n2>0)
		{
			result+=n1;
			n2--;
		}
		setNumero1(String.valueOf(result));
	}
}
