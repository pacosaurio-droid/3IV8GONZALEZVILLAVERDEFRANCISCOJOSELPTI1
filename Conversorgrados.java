	import java.util.Scanner;
class Conversorgrados {
	public static void main (String[] args){
		//Declarar variables.
		Scanner teclado;
		double Celsius;
		int opcion;
		double Kelvine;
		double Rankine;
		double Fahrenheit;
		char continuar;
		continuar = 's';
		
		//Inicializar variables.
		do {
				
			teclado = new Scanner (System.in);
			Celsius = 0;
			opcion = 0;
			Kelvine = 0;
			Rankine = 0;
			Fahrenheit = 0;
			
			
			System.out.println("Introduce el valor en Celsius: ");
			Celsius = teclado.nextDouble();
			
			System.out.println("Elija una opcion: ");
			System.out.println("1. Kelvine ");
			System.out.println("2. Rankine: ");
			System.out.println("3. Fahrenheit: ");
			opcion = teclado.nextInt();
			
			switch (opcion){
				case 1:
				Kelvine = Celsius + 273.15;
				System.out.println("Kelvine: " + Kelvine);
					break;
				case 2:
				Rankine = (Celsius * 273.15) * 1.8;
				System.out.println("Rankine: " + Rankine);
					break;
				case 3:
				Fahrenheit = (Celsius * 1.8) + 32;
				System.out.println("Fahrenheit: " + Fahrenheit);
					break;
			}
			System.out.println("Deseas continuar? (S/N): ");
			continuar = teclado.next().charAt(0);
		}	while(continuar == 's');
	}
}