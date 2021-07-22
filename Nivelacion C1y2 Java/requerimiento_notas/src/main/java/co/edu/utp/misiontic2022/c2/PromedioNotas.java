package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class PromedioNotas {

    // Paso a paso --> Algoritmo
    // 1) Recogere la información: código del estudiante y las cinco notas.
    // 2) Identificar cuál es la peor nota
    // 3) Hayar el promedio ajustado (descartar la peor de las notas) -> 0 a5
    // (decimal)
    // 4) Realizar la conversion a esccala de 0 a 5
    // 4) Reportar el promedio con el formato indicado.

    // Funciones que resuelven el problema --> Modularizado
    // public static alcance tipo_de_retorno nombreFuncion(especificación
    // argumentos){Bloque de código}
    public static int obtenerPeorNota(int nota1, int nota2, int nota3, int nota4, int nota5) {
        // Declarar
        int peorNota;
        // Inicialización de la variable
        peorNota = nota1;

        // 2) Identificar cuál es la peor nota
        // Comparación una por una con las demás
        if (peorNota > nota1) {
            peorNota = nota1;

        }
        if (peorNota > nota2) {
            peorNota = nota2;
        }

        if (peorNota > nota3) {
            peorNota = nota3;
        }

        if (peorNota > nota4) {
            peorNota = nota4;
        }
        if (peorNota > nota5) {
            peorNota = nota5;
        }
        return peorNota;
    }

    // 3) Hayar el promedio ajustado (descartar la peor de las notas) -> 0 a5
    // (decimal)
    public static double calcularPromedioAjustado(int nota1, int nota2, int nota3, int nota4, int nota5) {

        int peorNota = obtenerPeorNota(nota1, nota2, nota3, nota4, nota5);

        int sumatoria = 0;

        double promedioAjustado = 0;

        sumatoria = (nota1 + nota2 + nota3 + nota4 + nota5) - peorNota;

        promedioAjustado = sumatoria / 4;

        return promedioAjustado;

    }

    // 4) Realizar la conversion a esccala de 100 => a escala de 0 a 5
    public static double convertirEscala5(double calificacion100) {
        return (calificacion100 / 20);
    }

    // 5) Reportar el promedio con el formato indicado.
    public static void reportarPromedioAjustado(String codigo, double promedioAjustado) {
        System.out.println("El promedio ajustado del estudiante " + codigo + " es: " + promedioAjustado);
    }

    // Sección principal o punto de entrada para consumir estas funciones

    public static void main(String[] args) {

        // 2) Recoger la informacion: código dele studiante y las 5 notas
        Scanner sc = new Scanner(System.in); // Scanner va a manejar flujos de información de la consola
        System.out.println("Ingrese el código del estudiante: ");
        String codigoEstudiante = sc.nextLine();
        System.out.println("Ingrese nota1: ");
        int nota1 = sc.nextInt();
        System.out.println("Ingrese nota2: ");
        int nota2 = sc.nextInt();
        System.out.println("Ingrese nota3: ");
        int nota3 = sc.nextInt();
        System.out.println("Ingrese nota4: ");
        int nota4 = sc.nextInt();
        System.out.println("Ingrese nota5: ");
        int nota5 = sc.nextInt();

        // Ejecutar las funciones ==> paso 3 (internamente realiza el paso2)
        // double promedioAjustado = calcularPromedioAjustado(nota1, nota2, nota3,
        // nota4, nota5);
        double promedioAjustado = calcularPromedioAjustado(nota1, nota2, nota3, nota4, nota5);
        promedioAjustado = convertirEscala5(promedioAjustado);

        // Reportar el resultado
        // reportar PromedioAjsutado(códigoEstudiante, Math.round(promedioAjustado));
        reportarPromedioAjustado(codigoEstudiante, promedioAjustado);

    }

}