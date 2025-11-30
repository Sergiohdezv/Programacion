public class Tienda {
    private String producto;
    private double precio;
    private double iva;
    private double descuento;
    private static int numeroProductos;
    private static double descuentoGlobal;

    public Tienda(String producto) {
        this.producto = producto;
        this.precio = 10;
        this.iva = 21;
        this.descuento = 0;
        numeroProductos++;
    }
    public Tienda(String producto, double precio, double iva, double descuento) {
        this.producto = producto;
        this.precio = precio;
        this.iva = iva;
        this.descuento = descuento;
        numeroProductos++;
    }

    public double calcularPrecio() {
        double precioFinal;
        if (this.descuento >= this.descuentoGlobal) {
            precioFinal = (this.precio + (this.precio * this.iva / 100)) - ((this.precio + (this.precio * this.iva / 100)) * this.descuento / 100);
        } else {
            precioFinal = (this.precio + (this.precio * this.iva / 100)) - ((this.precio + (this.precio * this.iva / 100)) * this.descuentoGlobal / 100);
        }
        return precioFinal;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public static int getNumeroProductos() {
        return numeroProductos;
    }

    public static void setDescuentoGlobal(double descuentoGlobal) {
        Tienda.descuentoGlobal = descuentoGlobal;
    }

    @Override
    public String toString() {
        return
                producto + " cuesta " + calcularPrecio() + " €.";
    }
}
