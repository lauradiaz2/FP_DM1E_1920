package primeraPaquete;

public class Piso 
{
	int habitaciones;
	int ventanas;
	String pisoAltura;
	int puertas;
	
	
	public int getHabitaciones()
	{
		return habitaciones;	
	}
	
	public void setHabitaciones(int _habitaciones)
	{
		this.habitaciones = _habitaciones;
	}
	
	public int getPuertas()
	{
		return puertas;
	}
	
	public void setPuertas(int _puertas)
	{
		this.puertas = _puertas;
	}
	
	
	public int getVentanas()
	{
		return ventanas;
	}
	
	public void setVentanas(int _ventanas)
	{
		this.ventanas = _ventanas;
	}
	
	public String getPisoAltura()
	{
		return pisoAltura;
	}
	
	public void setPisoAltura(String _pisoAltura)
	{
		this.pisoAltura = _pisoAltura;
	}

	void mostrarPiso()
	{
		System.out.println("Mostramos la información del piso:");
		System.out.println("Nº de habitaciones: "+getHabitaciones());
		System.out.println("Numero de ventanas: "+getVentanas());
		System.out.println("Numero de puertas:"+getPuertas());
		System.out.println("Está en el piso "+getPisoAltura());
	}

}
