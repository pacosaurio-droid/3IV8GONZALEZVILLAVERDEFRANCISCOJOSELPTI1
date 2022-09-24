/*
Programa para calcular el promedio de una clase 
 Author: Francisco Jose Gonzalez Villaverde 
 */
import java.util.Scanner;

class holasnegros{
    public static void main(String[] args){
    //Inputt
	Scanner teclado;
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	double promedio;
	teclado =new Scanner(System.in);
	    num1=0;
	    num2=0;
	    num3=0;
	    num4=0;
	    num5=0;
	    promedio=0;
	    



    //Process
    System.out.println("Bienvenido al programa de promedios");
    System.out.println("Ingrese por favor los promedios de los 5 alumnos para poder sacar el promedio del grupo");
    num1 = teclado.nextInt();
    num2 = teclado.nextInt();
    num3 = teclado.nextInt();
    num4 = teclado.nextInt();
    num5 = teclado.nextInt();
    promedio=( num1 + num2 + num3 + num4 + num5)/5;
    


    //Output 
    System.out.println("El promedio del gripo es de "+promedio);

    }
}