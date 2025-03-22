
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listaProductos = new ArrayList<>();
        ArrayList<String> listaCantidadPoducto = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String accion;
        String siONo;
        String nuevoProducto;
        String cantidadProducto;
        String nuevaCantidad;
        int numCambioCantidad;
        int eliminarProducto;
        do {
            System.out.println("----------------------------");
            System.out.println("Hola ¿Qué deseas hacer?");
            System.out.println("* Agregar producto");
            System.out.println("* Lista de productos");
            System.out.println("* Actualizar cantidad de producto");
            System.out.println("* Eliminar producto");
            System.out.println("* Salir");
            accion = scanner.nextLine().toUpperCase();

            if (accion.equals("SALIR")) {
                break;
            }

            if (accion.equals("AGREGAR PRODUCTO")) {

                System.out.println("¿Comó se llama el nuevo producto?");
                nuevoProducto = scanner.nextLine();

                System.out.println("¿Qué cantidad de producto es?");
                cantidadProducto = scanner.nextLine();

                System.out.println("¿Desea agregar x" + cantidadProducto + " " + nuevoProducto + " a la lista?");

                System.out.println("NO");
                System.out.println("SI");
                siONo = scanner.next().toUpperCase();
                scanner.nextLine();

                if (siONo.equals("SI")) {
                    System.out.println("**Se agregó a la lista**");
                    listaProductos.add(nuevoProducto);
                    listaCantidadPoducto.add(cantidadProducto);
                }
            }

            if (accion.equals("LISTA DE PRODUCTOS")) {

                listaProductos.add("**Producto**");
                listaCantidadPoducto.add("**Cantidad**");

                System.out.println("La lista de productos es: ");
                for (int i = 0; i < listaCantidadPoducto.size(); i++) {
                    System.out.println((i + 1) + ". " + "x" + listaCantidadPoducto.get(i) + " " + listaProductos.get(i));
                }
            }

            if (accion.equals("ACTUALIZAR CANTIDAD DE PRODUCTO")) {
                System.out.println("A que producto desea cambiar la cantidad de producto. (1,2...)");
                numCambioCantidad = scanner.nextInt();

                System.out.println("¿Cuál es la nueva cantidad?");
                nuevaCantidad = scanner.next();

                listaCantidadPoducto.set((numCambioCantidad - 1), nuevaCantidad);
            }

            if (accion.equals("ELIMINAR PRODUCTO")) {
                System.out.println("¿Qué producto desea eliminar? (1,2...)");
                eliminarProducto = scanner.nextInt();

                listaCantidadPoducto.remove(eliminarProducto - 1);
                listaProductos.remove(eliminarProducto - 1);
            }


        } while (true);

    }
}