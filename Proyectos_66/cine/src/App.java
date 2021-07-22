import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al cine");

        // Cliente Uno

        Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese su cédula");
        String cedula = sca.nextLine();
        System.out.println("Ingrese su nombre");
        String nombre = sca.nextLine();

        Cliente clienteUno = new Cliente();
        clienteUno.setCedula("1120548787");
        clienteUno.setNombre("Maria");
        clienteUno.setId(1);
        clienteUno.generarSaludo();
        clienteUno.generarSaludo("Buenos días");
        clienteUno.mostrarDatos();
        float costo = clienteUno.calcularCosto(8000);

        System.out.println(" Cédula: " + clienteUno.getCedula() + "\nNombre: " + clienteUno.getNombre() + "\nID: "
                + clienteUno.getId() + "\nCosto tiquete: " + costo);

        // Cliente Dos
        ClientePremium clienteDos = new ClientePremium();
        clienteDos.setCedula("111657777");
        clienteDos.setNombre("José");
        clienteDos.setNumeroTarjeta(100);
        clienteDos.mostrarDatos();
        float costoDos = clienteDos.calcularCosto(8000);
        System.out.println(" Cédula: " + clienteDos.getCedula() + "\nNombre: " + clienteDos.getNombre()
                + "\nNumero tarjeta: " + clienteDos.getNumeroTarjeta() + "\nCosto tiquete: " + costoDos);
        System.out.println();
        // Prueba de contenedores

        System.out.println();
        Prueba pruebaContenedor = new Prueba();
        pruebaContenedor.generarLista();

        // LISTA DE OBJETOS
        // Vamos a pedir los datos del objeto cliente
        // vamos a realizar un ciclo while que me permita agregar varios elementos, en
        // este caso varios clientes
        // hasta que yo le de un caracter que me permita salir
        String opcion = "S";
        System.err.println("CREACIÓN DE CLIENTES");
        while (opcion.equalsIgnoreCase("S")) {// Este médoto compara dos cadenas de texto e Ignora mayúsculas
            // INGRESAR DATOS POR TECLADO
            System.out.println("Ingrese su cédula: ");
            cedula = sca.next(); // uso de next solución para que no me omita por consola la pregunta de la
                                 // cédula
            sca.nextLine();
            System.out.println("Ingrese su nombre:");
            nombre = sca.nextLine();
            System.out.println("Ingrese su ID:");
            int id = sca.nextInt();
            // Esta primera parte está solicitando por teclado al usuario los datos
            // vamos a crear un objeto de la clase cliente y se lo vamos a asignar.
            // CREAR OBJETO CLIENTE
            /*Cliente nuevoCliente = new Cliente();
            nuevoCliente.setCedula(cedula);
            nuevoCliente.setNombre(nombre);
            nuevoCliente.setId(id);*/
            Cliente nuevoCliente = new Cliente(cedula, nombre, id);

            // AGREGAR CLIENTE A LA LISTA
            // vamos a pasarselo al metodo que llamamos agregar ciente

            pruebaContenedor.agregarCliente(nuevoCliente);

            // PREGUNTAR NUEVO CLIENTE
            System.out.println("Dese agregar otro cliente? (x/n):");
            opcion = sca.next();
            sca.nextLine();
        }

        // LLAMAR EL OBJETO MOSTRAR NOMBRE CLIENTES
        pruebaContenedor.mostrarNombreClientes();
// PRUEBA CONTENEDOR MOSTRAR TODOS LOS DATOS DE TODOS LOS CLIENTES

        pruebaContenedor.mostrarDatosClientes();

    }
}
