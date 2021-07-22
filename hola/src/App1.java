/*import java.util.Scanner;*/

public class App1 {
    public static void main(String[] args) throws Exception {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        String nombre = sc.nextLine();
        System.out.println("Hello, World!" +  nombre);
        sc.close();*/
        
        
        /*Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es el número?");
        int numero = sc.nextInt();
        if (numero > 0){
            System.out.println("El número es mayor");
        } else {
            System.out.println("El número no es mayor"); 
        }*/
        
        
        /*Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es la opción?");
        int opcion = Integer.parseInt(sc.nextLine());
        
        switch (opcion) {
            case 1:
                System.out.println("Es la opción 1");
                break;
            case 2:
                System.out.println("Es la opción 2");
                break;            
            case 3:
                System.out.println("Es la opción 3");
                break; 
            default:
            System.out.println("Opción no válida");
        }*/

        for (int i = 0 ; i < 10; i++){
            System.out.println(i);
        }

        /*String saludo;
        saludo = "hola";
        char letra = 'a';
        System.out.println(saludo);
        System.out.println(letra);
        System.out.println("hola");*/


        /*for (int i = 0; i < 10;i++) {
            System.out.println(i);
            }*/

        /*for (int i = 0; i < 10;i+=2) {
            System.out.println(i);
            }*/

        /*int numero = 0;
        while(numero < 10){
            System.out.println(numero);
            numero = numero  + 2;
        }*/

        int numero = 0;
        do {
            System.out.println(numero);
            numero++;
        } while (numero != 0);
    }
}
