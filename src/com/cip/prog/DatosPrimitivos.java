package com.cip.prog;

import java.util.Scanner;




public class DatosPrimitivos {
	

	public static void main(String[] args) {
		
		final double PI= 3.1416;
		//crear una variable de tipo int 
		//le asignamos el valor 5 e imprimimos la variable por pantalla
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intrododuzca el diametro: ");
		int D= sc.nextInt();
		double r=(double)D/3;
		
			
		System.out.println("El radio es: "+r);
		sc.close();
		*/
		//ejercicio 2 masa corporal
		/*Scanner sc = new Scanner (System.in);
		
		System.out.println("Introdusca el P: ");
		double P= sc.nextDouble();
		
		System.out.println("Introdusca el Altura: ");
		double A= sc.nextDouble();
		
		double IMC= P/(A*A);
		
		System.out.println("La IMC del sujeto es: "+ IMC);
		*/
		//ejercicio 3 radio de un circulo
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdusca Radio: ");
		double r= sc.nextDouble();
		double A= PI /(r*r);
		
		System.out.println("El areas es: "+ A);
		*/
		//ejercicio 4 convierta euros en dolares
		
		/*Scanner sc = new Scanner (System.in);
		double € = 1.1845;//el cambio de un euro a dolares
		
		System.out.println("Introdusca el numero de €: ");
		double E = sc.nextDouble();
		double usd= E*€;
		
		System.out.println("En numero de dolares es: "+usd);
		*/
		//ejercicio 5 pedir 3 numeros y calcular la media
		
		Scanner sc = new Scanner (System.in);
						
		System.out.println("Introduzca primer número: ");
		int n1= sc.nextInt();
		System.out.println("Introduzca segundo número: ");
		int n2= sc.nextInt();
		System.out.println("Introduzca tercer número: ");
		int n3= sc.nextInt();
		
		double media = (n1+n2+n3)/3;
		
		System.out.println("La media de edad es: "+media);
		
		
		
		
	
	
	
		
	}

}
