import java.util.Scanner;
class Numerosbinarios{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa de Francisco Jose Gonzalez Villaverde UwU  ");
		System.out.println("Ingrese el numero positivo entero que desee convertir a binario");
			String binario = "";
                    int numbinario;
                    numbinario = entrada.nextInt();
                    binario = "";
                    
                    // Tengo que comprobar que sea entero positivo
                    if (numbinario > 0) {
                        // Debo aplicar el Algoritmo
                        while (numbinario > 0) {
                            if (numbinario % 2 == 0) {
                                binario = "0" + binario;
                            } else {
                                binario = "1" + binario;
                            }
                            numbinario = (int) numbinario / 2;
                        }

                    } else if (numbinario == 0) {
                        binario = "0";
                    } else {
                        binario = "\n No se pudo convertir el numero, ingrese solo positivos";
                    }
                    System.out.println("El numero binario es:" + binario);

	}
}