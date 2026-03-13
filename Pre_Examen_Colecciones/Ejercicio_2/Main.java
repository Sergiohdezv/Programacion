void main() {
    Tiendecilla tienda = new Tiendecilla(new HashMap<>());

    tienda.aniadirProdcuto(new Producto("34565Y", "Batidora", 76.4, 34, true));
    tienda.aniadirProdcuto(new Producto("564567T", "Nevera", 100.6, 65, true));
    tienda.aniadirProdcuto(new Producto("ERTYFB5", "Teclado", 54.6, 2, true));
    tienda.aniadirProdcuto(new Producto("2452345T", "Televisión", 55.5, 43, true));
    tienda.aniadirProdcuto(new Producto("CVBNCVN4", "Lavadora", 76.4, 7, true));

    Scanner sc = new Scanner(System.in);

    System.out.println("Bienvenido a Nonote tienda. " +
            "-----MENÚ------" +
            "Escribe 1 para registrar un producto." +
            "Escribe 2 para modificar el stock un producto." +
            "Escribe 3 para mostrar la lista de productos disponibles." +
            "Escribe 4 para mostrar la lista de productos sin stock." +
            "Escribe 5 para borrar un producto." +
            "Escribe 6 para salir del menú.");

    int respuesta;

    do {
        System.out.println("Elige la opción que desee: ");
        respuesta = sc.nextInt();

        if (respuesta == 1 || respuesta == 2 || respuesta == 3 || respuesta == 4 || respuesta == 5 || respuesta == 6) {
            switch (respuesta) {
                case 1:
                    tienda.altaProducto();
                    break;
                case 2:
                    tienda.modificarStock();
                    break;
                case 3:
                    tienda.listaDisponibles();
                    break;
                case 4:
                    tienda.listaSinStock();
                    break;
                case 5:
                    tienda.borrarProducto();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
            }
        } else System.out.println("Opción incorrecta");
    } while (respuesta != 6);
}