package primeraPaquete;

public class Main 
{

	public static void main(String[] args) 
	{
		/*Persona p1 = new Persona();
		p1.setNombre("Laura");
		p1.setDni("1234");
		p1.setFechaNacimiento("02/07/2000");
		p1.setPeso(70);
		p1.setAltura(1.70);
		p1.setGrupoSanguineo("A");
		p1.mostrarPersona(); */
		
		/*Vehiculo v1 = new Vehiculo("Boing 747",4,200,50,"x","11/10/2019");
		v1.mostrarVehiculo();*/
		
		/*Perro pe1 = new Perro();
		pe1.setRaza("Bulldog");
		pe1.setSexo(false);
		pe1.setTamaño("Pequeño");
		pe1.setColor("Negro");
		pe1.setFechaNacimiento("02/02/2015");
		pe1.mostrarPerro();
		
		Piso pi1 = new Piso();
		pi1.setPisoAltura("primero");
		pi1.setHabitaciones(4);
		pi1.setPuertas(7);
		pi1.setVentanas(6);
		pi1.mostrarPiso();*/
		
		// TODO Auto-generated method stub
		Mamifero m1 = new Mamifero(); //Creo un objeto de la clase Mamifero //Constructor por defecto
		Mamifero m2 = new Mamifero(false,70,1.50,"02/07/2000","Homo Sapiens Sapiens",290);//Constructor por valor
		Mamifero m3 = new Mamifero(m1);//Constructor por copia
		//Declara variable de tipo Mamifero()
		//Relleno sus atributos
		//mediante el uso de rutinas, funciones,....
		//Les paso el valor por parámetro
		/*m1.setFecha_nacimiento("01/01/2003");
		m1.setEspecie("Homo sapiens sapiens");
		m1.setSexo_masculino(true);//Es verdadero
		//Le damos el valor al atributo peso de dos formas distintas
		m1.setPeso(70);//asignación mediante un valor por parámetro.
		//Primero le hemos dado el valor 70, podemos comprobarlo
		System.out.println("Peso: "+m1.getPeso());
		m1.peso = 80;//asignación directa de un literal.
		//Le acabamos de asignar el valor 80, ya que las instrucciones se ejecutan
		//en orden ascendente, 1, 2, 3, 4, 5, ...
		System.out.println("Peso: "+m1.getPeso());
		m1.setAltura(1.90);
		m1.setTiempo_gestacion_dias(270);
		//Muestro sus atributos
		//muestro el valor
		System.out.println("Ejemplos obtener valor");//Esto es un Escribir
		System.out.println("Peso: "+m1.getPeso());//Aquí ponemos un + en vez de ,
		System.out.println("Peso: "+m1.peso);//Esto es un Escribir */
		
		m1.mostrarInfo();
		m2.mostrarInfo();
		m3.mostrarInfo();
		
	}

}
