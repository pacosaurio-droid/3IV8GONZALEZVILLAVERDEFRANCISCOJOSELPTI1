import java.util.Scanner;
class programadeabonos{
    public static void main(String [] args){
        System.out.println("Bienvenido al programa de abonos");
        System.out.println("Creado por Francisco Jose Gonzalez Villaverde O_o");
        //declarar las variables 
        Scanner teclado;
        double abono;
        int edad;
        double porcentaje1;
        double abonototal;
        double abono1;
        int opcion;



        //inicializar las variables
        teclado = new Scanner (System.in);
        abono = 0;
        edad =0;
        porcentaje1 = 0;
        abono1 = 0;
        opcion = 0;

      
      
        //proceso
        System.out.println("Por favor ingrese la cantidad del abono");
        abono = teclado.nextDouble();   
        System.out.println("Por favor ingrese su edad");
        edad = teclado.nextInt();
        if(edad > 65 ){
            //Aplicar el algoritmo
            abono1 = abono * .40;
            abonototal = abono1 + abono;
            System.out.println("El total de su abono con todo y descuento es:" + abonototal);
            System.out.println("Gracias por ocupar el programa de abonos pacosaurio");
            System.out.println("Tenga un buen dia");
        }else{
            if( edad < 21){
                System.out.println("Sus padres son socios");
                System.out.println("1 si sus padres si son miembros");
                System.out.println("2 si sus padres no son miembros");
                opcion = teclado.nextInt();
                switch(opcion){
                    case 1:
                        //si sus padres si son miebros entonces se hace lo siguiente 
                        abono1 = abono * .45;
                        abonototal = abono1 + abono;
                        System.out.println("Por se miembros el abono es de:" + abonototal);
                        break;
                    case 2:
                        //en el caso de que sus padres no sean miembros entonces se hace lo siguiente 
                        abono1 = abono * .25;
                        abonototal= abono1 + abono;
                        System.out.println("Por no ser miebros el abono total es de: " + abonototal);
                        System.out.println("Gracias por ocupar el programa de abonos pacosaurio");
                        System.out.println("Tenga un buen dia");
                        break;
                       


                }

            }
        }


    }

}
