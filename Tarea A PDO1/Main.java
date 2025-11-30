void main() {
    Tienda impresora_HP = new Tienda("Impresora HP", 100, 21, 5);
    Tienda raton = new Tienda("Ratón Logitech");
    Tienda libro_java = new Tienda("Libro Java", 20, 4, 15);

    System.out.println("Productos disponibles:");
    System.out.println(impresora_HP);
    System.out.println(raton);
    System.out.println(libro_java);
    System.out.println("Número de productos: " + Tienda.getNumeroProductos());

    System.out.println();
    System.out.println("Llegó el Black Friday:");
    Tienda.setDescuentoGlobal(10);
    raton.setPrecio(12);
    System.out.println(impresora_HP);
    System.out.println(raton);
    System.out.println(libro_java);
    System.out.println("Número de productos: " + Tienda.getNumeroProductos());
}
