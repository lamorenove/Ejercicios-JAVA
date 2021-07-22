import java.util.ArrayList;
import java.util.Scanner;

// ESTRUCTURA BASE PARA HACER PRUEBAS

public class Prueba {


    // vamos a crear un atributo de la clase y eso va por fuera de cualquier método.
    // los atributos de la clase deben construirse a parte
    private ArrayList<Cliente> listaClientes;

    // vamos a crearle un constructor que crea objetos con el mismo nombre de la
    // clase que hace
    // una función adicional
    public Prueba() {
        listaClientes = new ArrayList<>();
        try{
            //Algoritmo
        } catch(Exception e){
            // Proceso realizado si ocurre error
        }
    }

    // AGREGAR CLIENTES A LA LISTA
    // Ahora vamos a crear un método que me permita agregar elementos a esa
    // listaClientes
    // Cuya finalidad es tomar un objeto cliente que
    // le vamos a pasar desde otro lado y agregarlo a la lista
    // usamos pcliente como parámetro cliente
    public void agregarCliente(Cliente pCliente) {
        listaClientes.add(pCliente);
    }

    // MOSTRAR EL NOMBRE DE LOS CLIENTES
    /* public void mostrarNombreClientes() {
        System.out.println("Nombre de Clientes");
        // Vamos a recorrer la lista. Ya conocemos dos formas for y while.
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println(listaClientes.get(i).getNombre());
            // al tener un objeto en vez de i yo puedo acceder al objeto y
            // con set y get a sus métodos y atributos, al darle . tengo acceso a sus
            // métodos.
        }
    }*/
    public void mostrarNombreClientes() {
        System.out.println("Nombre de clientes");
        for (int i = 0; i < listaClientes.size(); i++){
            System.out.println(listaClientes.get(i).getNombre());
        }
    }


    // MOSTRAR TODOS LOS DATOS DE LOS CLIENTES

    public void mostrarDatosClientes() {
        String cadenaClientes = "";
        System.out.println("Datos de clientes");
        for (int i = 0; i < listaClientes.size(); i++){
            String datos = "\nCédula: " + listaClientes.get(i).getCedula()
                            + "\nNombre: " + listaClientes.get(i).getNombre()
                            + "\nID: " + listaClientes.get(i).getId();
            cadenaClientes.concat(datos);
        }
        System.out.println(cadenaClientes);
    }

    // crear un array list que me va a permitir agregar números de manera indefinida
    // posteriormente vamos a mostrar el contenido de ese array

    // usaremos ciclo while
    // usaremos un scanner y un array list de tipo entero
    // dentro de un método que vamos a llamar generar lista
    // List>>
    public void generarLista() {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        // agregó import java.util.ArrayList automáticamente. ver renglón 1

        // vamos a ingresar los valores por teclado
        Scanner sca = new Scanner(System.in);
        // inicializo una variable enteno numero
        int numero = 0;
        // usaremos ciclo while
        while (numero >= 0) {
            System.out.println("Ingrese un número(Número negativo para salir): ");
            numero = sca.nextInt();
            // condicion para usar cuando el número es negativo
            if (numero >= 0) {
                listaNumeros.add(numero);
            }
        }
        
        System.out.println();

        // ciclo for

        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
            // i++ -> i = i + 1
        }

        System.out.println();

        // Ciclo for each
        // va a recorrer cada posición de la lista y cada posición lo va a llamar
        // elemento
        listaNumeros.forEach((elemento) -> {
            System.out.println(elemento);
            // aquí va sin comillas elemento porque es el nombre de una variable
            // con este elemento puedo hacer operaciones como ejemplo a continuación
            // elemento = elemento * 2;
        });
    }
}