package primeraPaquete;

public class Vehiculo 
{
	String modelo;
	int ruedas;
	int asientos;
	int ventanas;
	String motor;
	String fechaFabricacion;
	
	public String getModelo()
	{
		return modelo;	
	}
	
	public void setModelo(String _modelo)
	{
		this.modelo = _modelo;
	}
	
	public int getRuedas()
	{
		return ruedas;
	}
	
	public void setRuedas(int _ruedas)
	{
		this.ruedas = _ruedas;
	}
	
	public int getAsientos()
	{
		return asientos;
	}
	
	public void setAsientos(int _asientos)
	{
		this.asientos = _asientos;
	}
	
	public int getVentanas()
	{
		return ventanas;
	}
	
	public void setVentanas(int _ventanas)
	{
		this.ventanas = _ventanas;
	}
	
	public String getMotor()
	{
		return motor;
	}
	
	public void setMotor(String _motor)
	{
		this.motor = _motor;
	}
	
	public String getFechaFabricacion()
	{
		return fechaFabricacion;
	}
	
	public void setFechaFabricacion(String _fechaFabricacion)
	{
		this.fechaFabricacion = _fechaFabricacion;
	}

	public Vehiculo(String _modelo,int _ruedas,int _asientos,int _ventanas,String _motor,String _fechaFabricacion)
	{
		modelo=_modelo;
		ruedas=_ruedas;
		asientos=_asientos;
		ventanas=_ventanas;
		motor=_motor;
		fechaFabricacion=_fechaFabricacion;
		
	}
	
	void mostrarVehiculo()
	{
		System.out.println("Mostramos la información del avion:");
		System.out.println("Modelo: "+getModelo());
		System.out.println("Numero de ruedas: "+getRuedas());
		System.out.println("Numero de asientos:"+getAsientos());
		System.out.println("Numero de ventanas: "+getVentanas());
		System.out.println("Modelo del motor: "+getMotor());
		System.out.println("Fecha de fabricacion: "+getFechaFabricacion());
	}
	
}
