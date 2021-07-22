
/* Realizar la suma, la resta, la división y la multiplicacción de dos números
 leídos por teclado y mostrar en pantalla 
 "La <operación> de <número 1> y <número 2> es igual a <resultado>*/
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        System.out.println("Digite el primer número: ");
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();

        System.out.println("Digite el segundo número: ");
        int numero2 = sc.nextInt();
        sc.close();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        System.out.println("La suma de " + numero1 + "y" + numero2 + " es igual a " + suma);
        System.out.println("La resta de " + numero1 + "y" + numero2 + " es igual a " + resta);
        System.out.println("La multiplicación de " + numero1 + "y" + numero2 + " es igual a " + multiplicacion);
        System.out.println("La división de " + numero1 + "y" + numero2 + " es igual a " + division);
    }
}
