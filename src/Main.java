
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String accion;

        System.out.println("Hola ¿Qué deseas hacer?");
        System.out.println("* AGREGAR PRODUCTO");
        System.out.println("* LISTA DE PRODUCTOS");
        System.out.println("* ACTUALIZAR CANTIDAD DE PRODUCTO");
        System.out.println("* ELIMINAR PRODUCTO");
        accion = scanner.nextLine().toUpperCase();

        if (accion.equals("AGREGAR PRODUCTO")) {

            String siONo;
            String nuevoProducto;

            do {
                System.out.println("¿Comó se llama el nuevo producto?");

                nuevoProducto = scanner.nextLine();

                System.out.println("¿Desea agregar " + nuevoProducto + " a la lista?");

                System.out.println("NO");
                System.out.println("SI");
                siONo = scanner.next().toUpperCase();
                scanner.nextLine();

            } while (siONo.equals("NO"));
            if (siONo.equals("SI")) {
                System.out.println("Se agregó a la lista");
                productos.add(nuevoProducto);
            }
        } else {
            if (accion.equals("LISTA DE PRODUCTOS")) {
                System.out.println("La lista de productos es: ");
                for (String producto : productos) {
                    System.out.println(producto);
                }

            }
        }
    }
}