void main() {
    //Introducción
    String usuario, contrasenia, nivel;
    Scanner sc = new Scanner(System.in);

    //Desarrollo y final
    System.out.println("Introduce el nombre de usuario:");
    usuario = sc.nextLine();
    System.out.println("Introduce la contraseña:");
    contrasenia = sc.nextLine();

    if (usuario.equals("admin") && contrasenia.equals("1234")) {
        nivel = "1, Administrador";
        System.out.println("Tu nivel de acceso es: " + nivel);
    } else if (usuario.equals("user") && contrasenia.equals("abcd")) {
        nivel = "2, Usuario normal";
        System.out.println("Tu nivel de acceso es: " + nivel);
    } else if (usuario.equals("guest") && contrasenia.equals("xyz")) {
        nivel = "3, Invitado";
        System.out.println("Tu nivel de acceso es: " + nivel);
    } else {
        System.out.println("Acceso denegado.");
    }
    sc.close();
}