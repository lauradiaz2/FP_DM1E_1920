package calculadora;

public class Division extends Operaciones
{
	public void div()
	{
		double n1,n2,aux;
		int y,s,l=0;
		String lau;
		String resultado="";
		n1=Double.parseDouble(getNumero1());
		n2=Double.parseDouble(getNumero2());
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
			setNumero1(String.valueOf(resultado));
	}
}
