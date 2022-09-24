import java.util.Scanner;
class NumerosPositivos {
    public static void main(String [] args){
        int n,
        cp=0,cn=0,x, Ccero=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar cantidad de elementos a   ingresar:");
        n= teclado.nextInt();
        for(int i=1;int;=n;i++)
        {
            System.out.println("x(“+i+”)=");
            x=teclado.nextInt();
            if(x==0)
            {
                cero++;
            }
            else if(x&lt0)
            {
                cn++;
            }
            else{
                cp++;
            }
                    
        }
        System.out.println("Cantidad de Positivos:" + cp);
        System.out.println("Cantidad de Negativos:" + cn);
        System.out.println("Cantidad de Ceros: + cero"); 
    }    
}
