
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Tego Calderon
 * 
 */
public class Fibonacci_IterativoYRecursivo {

    public static int fibonacciRecursivo(int numero) {

        if (numero == 1) {
            return 0;
        } else if (numero == 2) {
            return 1;
        } else {
            return fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero - 2);
        }

    }

    public static int fibonacciIterativo(int numero) {
        int a = 0, b = 1, c = 0;

        for (int i = 0; i < numero; i++) {
            //System.out.print(a + " , ");

            c = a + b;
            a = b;
            b = c;
            //fibonacci = a;
        }

        return numero = c - a;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número para fibonacci: ");
        int numero = entrada.nextInt();

        System.out.println("Fibonacci en iterativo es: " + fibonacciIterativo(numero));
        for (int i = 1; i <= numero; i++) {
            System.out.print(fibonacciIterativo(i) + " , ");
            
        }
        System.out.println();
        System.out.println("Fibonacci en recursivo es: " + fibonacciRecursivo(numero));
        for (int i = 1; i <= numero; i++) {
            System.out.print(fibonacciRecursivo(i) + " , ");

        }

    }
}
