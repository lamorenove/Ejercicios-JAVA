
/*Realizar un programa que realice el promedio de las notas de un alumno,
para ello el programa va a tener que solicitar el nombre del alumno
y las notas de las 3 evaluaciones.  Si el alumno tiene un promedio mayor o igual 
a 3.0 también debe imprimir "Aprobado", si no alcazó esta nota debe imprimir "Reprobado".  
Requisitos: Las notas que se ingresan pueden tener
decimales.
*/
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Bienvenido!  Por favor ingrese su nombre");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();

        System.out.println("Por favor ingrese la nota de la evaluación 1");
        double nota1 = sc.nextDouble();

        System.out.println("Por favor ingrese la nota de la evaluación 2");
        double nota2 = sc.nextDouble();

        System.out.println("Por favor ingrese la nota de la evaluación 3");
        double nota3 = sc.nextDouble();
        sc.close();

        {double resultado = ((nota1 + nota2 + nota3) / 3);

        if (resultado < 3) {
            System.out.println("Lo siento " + nombre + " su promedio es " + "+df.format(resultado) + " has reprobado.");
        } else {
            System.out.println("Felicidades " + nombre + " su promedio es " + "+df.format(resultado) + " aprobado.");
        }
    }}
}
