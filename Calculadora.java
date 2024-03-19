import java.util.Scanner;

public class Calculadora {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int opcion = 0;
          double num1 = 0, num2 = 0;

          do {
               
               System.out.println("\t---- Menu ----\n");
               System.out.print("Elija la opcion a desear\n");
               System.out.print("1-Sumar\n");
               System.out.print("2-Resta\n");
               System.out.print("3-Multiplicacion\n");
               System.out.print("4-Division\n");
               System.out.print("5-Salir\n");
               opcion = sc.nextInt();
               switch (opcion) {
                    case 1:
                         System.out.print("\n\t---- Ingrese los numeros que desea calcular ----\n");
                         System.out.print("Numero 1: ");
                         num1 = sc.nextFloat();
                         System.out.print("Numero 2: ");
                         num2 = sc.nextFloat();
                         sumar(num1, num2);
                         System.out.println("Su resultado es: " + sumar(num1, num2));
                         break;
                    case 2:
                         System.out.print("\n\t---- Ingrese los numeros que desea calcular ----\n");
                         System.out.print("Numero 1: ");
                         num1 = sc.nextFloat();
                         System.out.print("Numero 2: ");
                         num2 = sc.nextFloat();
                         resta(num1, num2);
                         System.out.println("Su resultado es: " + resta(num1, num2));
                         break;
                    case 3:
                         System.out.print("\n\t---- Ingrese los numeros que desea calcular ----\n");
                         System.out.print("Numero 1: ");
                         num1 = sc.nextFloat();
                         System.out.print("Numero 2: ");
                         num2 = sc.nextFloat();
                         multiplicar(num1, num2);
                         System.out.println("Su resultado es: " + multiplicar(num1, num2));
                         break;
                    case 4:
                         System.out.print("\n\t---- Ingrese los numeros que desea calcular ----\n");
                         System.out.print("Numero 1: ");
                         num1 = sc.nextFloat();
                         System.out.print("Numero 2: ");
                         num2 = sc.nextFloat();
                         dividir(num1, num2);
                         System.out.println("Su resultado es: " + dividir(num1, num2));
                         break;
                    case 5:
                         System.out.print("\nGracias por utilizar nuestra calculadora\n");
                         break;

                    default:
                         break;
               }
          } while (opcion < 5);

     }

     public static double sumar(double num1, double num2) {
          return num1 + num2;
     }

     public static double resta(double num1, double num2) {
          return num1 - num2;
     }

     public static double multiplicar(double num1, double num2) {
          return num1 * num2;
     }

     public static double dividir(double num1, double num2) {
          return num1 / num2;
     }
}
