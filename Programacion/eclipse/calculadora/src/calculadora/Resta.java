package calculadora;

public class Resta extends Operaciones
{
	public void resta()
	{
		double n1,n2,result=0;
		n1=Double.parseDouble(getNumero1());
		n2=Double.parseDouble(getNumero2());
		result=n1-n2;
		setNumero1(String.valueOf(result));
	}
}
