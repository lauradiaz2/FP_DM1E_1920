package operaciones;

public class Division extends Operaciones
{
	public Division(int cod, double numero1, double numero2, double resultado) 
	{
		super(cod, numero1, numero2, resultado);
		// TODO Auto-generated constructor stub
	}

	public void div()
	{
		double n1=getOp1(),n2=getOp2(),aux;
		int y,s,l=0;
		String lau;
		String resultado="";
		aux=getOp1();
			while (aux!=0)
			{
				y=0;
				while(n1>=n2)
				{
					n1=n1-n2;
					y++;
				}
				lau=String.valueOf(y);
				if(l==0)
				{
					resultado+=lau;
					l++;
				}
				else if(l==1)
				{
					resultado+="."+lau;
					l++;
				}
				else if(l<10)
				{
					resultado+=lau;
					l++;
				}
				else
				{
					n1=0;
				}
				aux=n1;
				s=0;
				while(s<9)
				{
					n1+=aux;
					s++;
				}
			}
			setResult(Double.parseDouble(resultado));
	}
}
