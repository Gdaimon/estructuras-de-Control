
import java.util.Scanner;


public class WhileEjemplo {
    public static void main(String[] args) {
       
        // Ejemplo
        //int contador = 1;
        
        /*
        // hacer finito - si no genera Error
        while(contador < 10){
            System.out.println("Hola Mundo");
        }
        */
        
        /*
        while(contador < 10){
            System.out.println("Hola Mundo: " + contador);
            // Opcion 1
            contador++;
            // Opcion 2
            //contador+=1;
            // Opcion 3
            //contador=contador + 1;
        }
        */
        
        /*
        // Ejercicio 1
        int numero = 8965;
        int contador = 0;
        // 100 / 10 => 10
        // 200 / 10 => 20 
        // Cada vez que dividimos por 10 vamos reduciendo el numero
        while(numero > 0){
            numero = numero / 10;
            contador++;
        }
        System.out.println("El numero tiene: " + contador + " digitos");
        */
        
        /*
        // ejercicio 2
        System.out.println("Numeros del 100 al 1: ");
        int numeroMaximo = 100;
        while( numeroMaximo >= 1){
            System.out.println(numeroMaximo);
            numeroMaximo--;
        }
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero (0 para finalizar): ");
        
        int numero = scanner.nextInt();
        while(numero != 0){
            if(numero > 0){
                System.out.println("Postivo");
            }else{
                System.out.println("Negativo");
            }
            if(numero % 2 == 0){
                System.out.println("Par");
            }else{
                System.out.println("Impar");
            }
            
            System.out.println("Introduce un numero (0 para finalizar): ");
            numero = scanner.nextInt();
        }
        
        
    }
}
