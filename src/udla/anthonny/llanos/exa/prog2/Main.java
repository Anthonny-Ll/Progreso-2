package udla.anthonny.llanos.exa.prog2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion;
        //Bucle para los metodos
        do{
            System.out.println("Menu Principal"+"\n");
            System.out.println("1. Mostrar Productos");//Metodo para mostrar productos
            System.out.println("2. Agregar Productos");//Metodo para agregar productos
            System.out.println("3. Reducir Productos");//Metodo para reducir productos
            System.out.println("4. Ver el precio Total");//Metodo para ver el precio total
            System.out.println("5. Salir");
            System.out.println("Selecciona una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    Venta.mostrarProductos();
                    break;

                case 2:
                    Venta.agregarProducto(scanner);
                    break;

                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion invalida intente nuevamente");
            }

        }while (opcion !=10);

        scanner.close();
    }
}
