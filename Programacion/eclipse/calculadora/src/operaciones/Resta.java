package operaciones;

public class Resta extends Operaciones
{
	public void resta()
	{
		double n1,n2,result=0;
		n1=Double.parseDouble(calc.getOp1());
		n2=Double.parseDouble(calc.getOp2());
		result=n1-n2;
		setResult(String.valueOf(result));
	}
}
