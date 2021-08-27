
import java.util.Scanner;

public class ArreglosEjemplos {
    public static void main(String[] args) {
        // Ejemplo
        Scanner scanner = new Scanner(System.in);
        int tamano = scanner.nextInt();
        int[] datos = new int[tamano];
        datos[0]= 10;
        
        //System.out.println(datos[0]);
        
        // Recorrer arreglos
        for(int indice = 0; indice <= datos.length-1; indice++){
            System.out.println(datos[indice]);
        }
        
        int[] numero = {1,5,6,8,7,8};
   
}
    
}
