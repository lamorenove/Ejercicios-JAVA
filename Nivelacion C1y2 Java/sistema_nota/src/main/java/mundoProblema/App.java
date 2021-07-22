package mundoProblema;

import java.util.ArrayList;
/**
 * Alicación de Notas
 * *
 */
public class App {


    public static void main (String[] args){

        System.out.println("Bienvenido al Sistema de Notas");

        //probar la clase Nota
        //Nota nota1 = new Nota(); //opción de construirla vacía
        //nota1.mostrarNota();
        //Nota nota2 = new Nota(77); //opción de construirla con un entero    
        //nota2.mostrarNota();
        //Nota nota3 = new Nota(2.0); //opción de construirla con un decimal. Otra opcion es   Nota nota4 = new Nota("Primer Parcial", 3.8); //opción de construirla con un decimal y con nombre
        //nota3.mostrarNota();

        //Llamado ejemplo composición
        //Materia materia = nev Materia("AAA10276", "Programación Básica", 40,50,39,76,96);
        //materia.calcularPromedioAjustado();
        //materia.mostrarMateria();

        //Llamado ejemplo agregación
        ArrayList<Nota> notasAgregacion = new ArrayList<Nota>();
        notasAgregacion.add(new Nota(40));
        notasAgregacion.add(new Nota(50));
        notasAgregacion.add(new Nota(39));
        notasAgregacion.add(new Nota(76));
        notasAgregacion.add(new Nota(96));
        Materia materia = new Materia("AA0010276", "Programación Básica", notasAgregacion);
        materia.calcularPromedioAjustado();
        materia.mostrarMateria();
    }
}
