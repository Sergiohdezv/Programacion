void main() {
    Sistema_Gestion sistema = new Sistema_Gestion();

    sistema.agregarEstudiantes("D:\\PROGRAMACIÓN\\TEMA 8 COLECCIONES\\Sistema_Gestion_Estudiantes\\src\\estudiantes.csv");

    System.out.println("Lista de estudiantes:");
    sistema.mostrarEstudiantes();

    System.out.println("Ciudades únicas:");
    sistema.generarCiudades();
    sistema.mostrarCiudades();

    System.out.println("Estudiantes por ciudad:");
    sistema.agruparPorCiudad();
    sistema.mostrarAgrupados();

    System.out.println("Sistema de atención:");
    sistema.generarCola();
    sistema.atenderEstudiantes();
}