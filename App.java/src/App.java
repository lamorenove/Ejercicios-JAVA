import jdk.tools.jlink.internal.plugins.StripNativeCommandsPlugin;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("La Tienda de Ropa");
    
        Producto productoUno = new Producto();

        productoUno.setNombre("Falda");
        productoUno.setPrecio(70000);
        productoUno.mostrar();  
        
        //int no = 124750;
        String precioTexto = String.format("%,d",(int)precio);
        //str = 124.750
        System.out.println(nombre + ": "+ precioTexto);
        }
}
