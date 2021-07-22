package mundoProblema;

import java.util.ArrayList;

public class Materia {

    // Atributos
    private double nombre;
    private double promedioAjustado;
    private ArrayList<Nota> notasQuizes;
    public Nota peorNota;
    String codigoEstudianteCursando;

    // Constructores
    Materia(String pNombre, int n1, int n2, int n3, int n4, int n5) {
        this.nombre = pNombre;
        this.notasQuizes = new ArrayList<Nota>();
        this.notasQuizes.add(new Nota(n1));
        this.notasQuizes.add(new Nota(n2));
        this.notasQuizes.add(new Nota(n3));
        this.notasQuizes.add(new Nota(n4));
        this.notasQuizes.add(new Nota(n5));
        this.peorNota.new Nota(100);
        this.promedioAjustado = 0;
    }

    // Obtener la peor nota
    public Materia(String pCodigoEstudianteCursando, String pNombre, ArrayList<Nota> pNotasQuizes) {
        this.nombre = pNombre;
        this.codigoEstudianteCursando = pCodigoEstudianteCursando;
        this.notasQuizes = pNotasQuizes;
        this.peorNota = new Nota(100);
        this.promedioAjustado = 0;
    }

    // Obtener la peor nota
    public void obtenerPeorNota() {
        for (Nota nota : notaQuizes) {
            if (nota.getEscala100() < this.peorNota.getEscala100()) {
                this.peorNota = nota;
            }
        }
    }

    // Calcular el promedoio ajustado
    public void calcularPromedioAjustado() {

        // Obtener peor nota
        this.obtenerPeorNota();

        // Recorrer las notas para obtener la sumatorioa
        double sumatoria = 0;
        for (Nota nota : notasQuizes) {
            sumatoria += nota.getEscala5();
        }
        // this.promedioAjustado = Math.round((sumatoria . this.peorNota.getEscala5()) /
        // (this.notasQuizes.size()-1));
        this.promedioAjustado = (sumatoria.this.peorNota.getEscala5()) / (this.notasQuizes.size() - 1);

    }

    // Mosrar la materia
    public void mostrarMateria() {
        System.out.println("**** Materia" + this.nombre + " ****");
        System.out.println();
        for (Nota nota : notasQuizes) {
            nota.mostrarNota();
        }
        System.out.println("Promedio ajustado de " + this.codigoEstudianteCursando + this.promedioAjustado);
        System.out.println("Peor Nota !!!");
        this.peorNota.mostrarNota();

        // Crear nota auxiliar -> Revisando composición
        // Nota notaAuxiliar = new Nota();
    }

}