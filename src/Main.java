
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String accion;
        String siONo;
        String nuevoProducto;

        do {
            System.out.println("----------------------------");
            System.out.println("Hola ¿Qué deseas hacer?");
            System.out.println("* Agregar ´pr");
            System.out.println("* Lista de productos");
            System.out.println("* Actualizar cantidad de producto");
            System.out.println("* Eliminar producto");
            System.out.println("* Salir");
            accion = scanner.nextLine().toUpperCase();

            if (accion.equals("AGREGAR PRODUCTO")) {

                System.out.println("¿Comó se llama el nuevo producto?");
                nuevoProducto = scanner.nextLine();

                System.out.println("¿Desea agregar " + nuevoProducto + " a la lista?");

                System.out.println("NO");
                System.out.println("SI");
                siONo = scanner.next().toUpperCase();
                scanner.nextLine();

                if (siONo.equals("SI")) {
                    System.out.println("**Se agregó a la lista**");
                    productos.add(nuevoProducto);
                }
            } else {
                if (accion.equals("LISTA DE PRODUCTOS")) {
                    productos.add("------------------------");
                    System.out.println("La lista de productos es: ");
                    for (String producto : productos) {
                        System.out.println(producto);
                    }
                }
            }

        }while (accion.equals("AGREGAR PRODUCTO") || accion.equals("LISTA DE PRODUCTOS"));
    }
}