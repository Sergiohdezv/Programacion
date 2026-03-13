void main() {
    Scanner sc = new Scanner(System.in);
    ArrayList<Socio> socios = new ArrayList<>();
    Gimnasio.hacerListaSocios(socios);

    socios.add(new Socio("Sergio", "77558869V", 24, "26/07/2021", true));
    socios.add(new Socio("Marta", "66666666", 24, "26/07/2021", true));
    socios.add(new Socio("James", "11111111", 24, "26/07/2021", true));
    socios.add(new Socio("Paco", "88888888", 24, "26/07/2021", true));
    socios.add(new Socio("Walle", "44444444", 24, "26/07/2021", true));



    System.out.println("Bienvenido al gimnasio Twinking. " +
            "-----MENÚ------" +
            "Escribe 1 para añadir un socio." +
            "Escribe 2 para dar de baja un socio." +
            "Escribe 3 para mostrar la lista de socios activos." +
            "Escribe 4 para mostrar la lista de socios inactivos." +
            "Escribe 5 para borrar un socio." +
            "Escribe 6 para salir del menú.");
    int respuesta;

    do {
        System.out.println("Elige la opción que desee: ");
        respuesta = sc.nextInt();

        if (respuesta == 1 || respuesta == 2 || respuesta == 3 || respuesta == 4 || respuesta == 5 || respuesta == 6) {
            switch (respuesta) {
                case 1:
                    Gimnasio.aniadirSocio();
                    break;
                case 2:
                    Gimnasio.darDeBaja();
                    break;
                case 3:
                    Gimnasio.listaSociosActivos();
                    break;
                case 4:
                    Gimnasio.listaSociosInactivos();
                    break;
                case 5:
                    Gimnasio.borrarSocio();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
            }
        } else System.out.println("Error, ese número no es correcto.");
    } while (respuesta != 6);
}


