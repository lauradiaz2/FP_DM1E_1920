package algoritmos;

import java.util.Scanner;

public class algoritmos 
{
	
	public static void seleccion(Scanner input)
	{
		double tiempoini = System.currentTimeMillis();
		System.out.println("Tiempo inicio "+tiempoini);
		double tiempofin;
		int array1[] = {10,2,5,8,4,1,6,9,3,7};
		int comp=0,asig=0;
		for (int i=0; i<array1.length-1; i++)
		{
			for (int j=i+1; j<array1.length; j++)
			{
				if (array1[j]<array1[i])
				{
					int aux;
					aux=array1[i];
					asig++;
					array1[i]=array1[j];
					asig++;
					array1[j]=aux;
					asig++;
					comp++;
				}
				asig++;
				asig++;
				comp++;
			}
			asig++;
			asig++;
			comp++;
		}
		for (int i=0; i<array1.length; i++)
		{
			asig++;
			asig++;
			comp++;
			System.out.println(array1[i]);
		}
		tiempofin=System.currentTimeMillis();
		System.out.println("Tiempo final "+tiempofin);
		System.out.println(tiempofin-tiempoini+" es lo que ha tardado.");
		System.out.println("Comparaciones: "+comp+"\nAsignaciones: "+asig);
	}
	
	public static void insercion()
	{
		double tiempoini = System.currentTimeMillis();
		System.out.println("Tiempo inicio "+tiempoini);
		double tiempofin;
		int j,aux;
		int array1[] = {10,2,5,8,4,1,6,9,3,7};
		int comp=0,asig=0;
		for (int i=1; i<array1.length; i++)
		{
			aux=array1[i];
			asig++;
			j=i-1;
			asig++;
			while(j>=0 && aux<array1[j])
			{
				array1[j+1]=array1[j];
				asig++;
				j--;
				asig++;
				comp++;
				comp++;
				comp++;
			}
			array1[j+1]=aux;
			asig++;
			asig++;
			comp++;
		}
		tiempofin=System.currentTimeMillis();
		System.out.println("Tiempo final "+tiempofin);
		System.out.println(tiempofin-tiempoini+" es lo que ha tardado.");
		System.out.println("Comparaciones: "+comp+"\nAsignaciones: "+asig);
	}

	public static void burbuja()
	{
		double tiempoini = System.currentTimeMillis();
		System.out.println("Tiempo inicio "+tiempoini);
		double tiempofin;
		int aux;
		int array1[] = {10,2,5,8,4,1,6,9,3,0};
		int comp=0,asig=0;
		for (int i=1; i<array1.length; i++)
		{
			for (int j=1; j<array1.length-i; j++)
			{
				if (array1[j]>array1[j+1])
				{
					aux=array1[j];
					array1[j]= array1[j+1];
					array1[j+1]=aux;
					asig++;
					comp++;
				}
				asig++;
				asig++;
				comp++;
			}
			asig++;
			asig++;
			comp++;
		}
		for (int i=1; i<array1.length; i++)
		{
			System.out.println(array1[i]);
		}
		tiempofin=System.currentTimeMillis();
		System.out.println("Tiempo final "+tiempofin);
		System.out.println(tiempofin-tiempoini+" es lo que ha tardado.");
		System.out.println("Comparaciones: "+comp+"\nAsignaciones: "+asig);
	}
	
	public static void quicksort()
	{
		
//		i<-inf
//		j<-sup
//		x<-array [(inf+sup)div 2]
//		mientras i=<j hacer
//		mientras array[i]< x hacer
//		i<-i+1
//		finmientras
//		mientras array[j]>x hacer
//		j<- j-1
//		finmientras
//		si i=<j entonces
//		tam<-array[i]
//		array[i]<-array[j]
//		array[j]<-tam
//		i=i+1
//		j=j-1
//		finsi
//		finmientras
//		si inf<j entonces
//		Quicksort(array,inf,j)
//		finsi
//		si i<sup entonces
//		Quicksort(array,i,sup)
//		finsi
	}
}
