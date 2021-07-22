public class Ejercicio1 {
    public static void main(String[] args) {
        var nombre = "César Díaz";

        var resultado = saludo(nombre);

        System.out.println(resultado);
    }

    public static String saludo(String nombre) {
        return "Hola" + nombre + "!";
    }
}