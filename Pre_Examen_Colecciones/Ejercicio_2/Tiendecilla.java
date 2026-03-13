import java.util.*;

public class Tiendecilla {

    private Map<String, Producto> productillos;

    public Tiendecilla(Map<String, Producto> productillos) {
        this.productillos = productillos;
    }

    public void aniadirProdcuto(Producto nuevo) {
        if (productillos.containsKey(nuevo.getCodigo())) {
            System.out.println("Ya existe un producto con ese código.");
        } else {
            productillos.put(nuevo.getCodigo(), nuevo);
        }
    }

    public void altaProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el código del producto:");
        String codigo = sc.nextLine();

        if (productillos.containsKey(codigo)) {
            System.out.println("NO");
            return;
        }

        System.out.println("Introduce el nombre del producto:");
        String nombre = sc.nextLine();
        System.out.println("Introduce el precio del producto:");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduce el número de stock del producto:");
        int stock = sc.nextInt();
        sc.nextLine();

        Producto nuevo = new Producto(codigo, nombre, precio, stock, true);
        productillos.put(codigo, nuevo);
        System.out.println("Producto añadido");
    }

    public void modificarStock() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el código del producto que quieres actualizar:");
        String codigo = sc.nextLine();
        System.out.println("Introduce el stock actualizado:");
        int stock = sc.nextInt();

        if (productillos.containsKey(codigo)) {
            Producto nuevo = productillos.get(codigo);
            nuevo.setStock(stock);
            System.out.println("Stock actualizado.");
        } else System.out.println("Ese producto no existe.");
    }

    public void listaDisponibles() {
        List<Producto> listaDisponibles = new ArrayList<>(productillos.values());

        listaDisponibles.sort(new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return o1.getNombres().compareToIgnoreCase(o2.getNombres());
            }
        });
    }

    public void listaSinStock() {
        for (Producto noDisponible : productillos.values()) {
            if (noDisponible.getStock() == 0) {
                System.out.println(noDisponible);
            }
        }
    }

    public void borrarProducto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el código para eliminar el producto: ");
        String codigo = sc.nextLine();

        if (productillos.containsKey(codigo)){
            productillos.remove(codigo);
            System.out.println("Producto eliminado");
        }else {
            System.out.println("El producto no existe");
        }
    }
}
