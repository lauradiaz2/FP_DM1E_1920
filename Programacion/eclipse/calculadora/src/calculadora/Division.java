package calculadora;

public class Division extends Operaciones
{
	public static void div(String num1,String num2)
	{
		double n1,n2,aux;
		int y,s,l=0;
		String lau;
		String resultado="";
		n1=Double.parseDouble(num1);
		n2=Double.parseDouble(num2);
		aux=n1;
		
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
		setOperacion(resultado);
	}
}
