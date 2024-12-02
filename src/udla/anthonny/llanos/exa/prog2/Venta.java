package udla.anthonny.llanos.exa.prog2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Venta {
    //Atributos
    private String id;
    private String fecha;
    private Empleado empleado;
    private static List<Producto> listaproductosVendidos = new ArrayList<>();
    private double total;

    //Constructores

    public Venta(String id, String fecha, Empleado empleado, List<Producto> listaproductosVendidos, double total) {
        this.id = id;
        this.fecha = fecha;
        this.empleado = empleado;
        Venta.listaproductosVendidos = listaproductosVendidos;
        this.total = total;
    }

    //Metodos

    //Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<Producto> getListaproductosVendidos() {
        return listaproductosVendidos;
    }

    public void setListaproductosVendidos(List<Producto> listaproductosVendidos) {
        Venta.listaproductosVendidos = listaproductosVendidos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    //Metodo para mostrar productos
    public static void mostrarProductos (){
        if (listaproductosVendidos.isEmpty()){
            System.out.println("No hay productos");
        } else {
            for (int i=0; i < listaproductosVendidos.size();i++){
                Producto producto = listaproductosVendidos.get(i);
                System.out.println((i+1)+ "Nombre: " + producto.getNombre() + "\n"
                + "Cantidad: " + producto.getCantidad() + "\n" + "Precio: " + producto.getPrecios());
            }
        }
    }

    //Metodo para agregar productos
    public static void agregarProducto(Scanner scanner){
        Producto producto1 = new Producto();

        System.out.println("Id del producto: ");

        producto1.setId(scanner.nextLine());

        System.out.println("fecha: ");
        producto1.setFecha(scanner.nextLine());

        System.out.println("Cantidad: ");
        producto1.setCantidad(scanner.nextLine());

        listaproductosVendidos.add(producto1);

    }


}
