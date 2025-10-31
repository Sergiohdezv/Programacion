void main() {
    //Introducción
    Scanner sc = new Scanner(System.in);
    String cadena;
    int contador = 0;

    //Desarrollo
    System.out.println("Introduce una cadena de caracteres:");
    cadena = sc.nextLine();

    for (int i = 0; i < cadena.length(); i++) {
        contador++;
    }

    //Final
    System.out.println("Tu cadena tiene " + contador + " caracteres.");

    sc.close();
}