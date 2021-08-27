
import java.util.Scanner;

public class SwitchEjemplo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        // Ejemplo 
        int numeroDia = scanner.nextInt();
        switch (numeroDia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default: // se concidera como el else del if
                System.out.println("No existe el dia");
                break;
        }
         */

 /*
        // Ejercicio 1 
        System.out.print("Escribe el numero del mes: ");
        int mes = scanner.nextInt();
        int numeroDias = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 2:
                numeroDias = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            default: // se concidera como el else del if
                System.out.println("No existe el mes");
                break;
        }
        System.out.println("El mes tiene: " + numeroDias + " días");
         */
        // Ejercicio 2
        System.out.println("Ingrese su calificacion");
        String calificacion = scanner.next();

        switch (calificacion) {
            case "A":
                System.out.println("Excelente");
                break;
            case "B":
                System.out.println("Bien hecho");
                break;
            case "C":
                System.out.println("Bien hecho");
                break;
            case "D":
                System.out.println("Aprobo");
                break;
            case "F":
                System.out.println("Puedes mejorar");
                break;
            default: // se concidera como el else del if
                System.out.println("Calificacion no valida");
                break;
        }

    }
}
