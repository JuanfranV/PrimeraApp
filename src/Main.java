
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola ¿Qué deseas hacer?");
        System.out.println("* AGREGAR PRODUCTO");
        System.out.println("* LISTA DE PRODUCTOS");
        System.out.println("* ACTUALIZAR CANTIDAD DE PRODUCTO");
        System.out.println("* ELIMINAR PRODUCTO");
        String accion;
        accion = (scanner.nextLine()).toUpperCase();

        if (accion.equals("AGREGAR PRODUCTO")){
            System.out.println("¿Comó se llama el nuevo producto?");
            String nuevoProducto;
            nuevoProducto = scanner.next();

            System.out.println("¿Desea agregar " + nuevoProducto + " a la lista?");
            System.out.println("NO");
            System.out.println("SI");
            String siONo;
            siONo = (scanner.next()).toUpperCase();
            if (siONo.equals("SI")){
                System.out.println("Se agregó a la lista");

            }else {
                System.out.println("no ahadfyd f er");
            }

        }


    }
}