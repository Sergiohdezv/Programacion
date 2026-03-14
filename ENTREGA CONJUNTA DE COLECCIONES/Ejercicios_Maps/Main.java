import java.util.*;
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;

    Map<String, String> mapaPaisCapital = new HashMap<>();
    Map<String, Integer> mapaFrecuencia = new HashMap<>();
    Map<String, String> mapaAgenda = new HashMap<>();
    Map<String, Integer> mapaLista = new HashMap<>();
    Map<String, String> mapaDiccionario = new HashMap<>();
    Map<String, List<Integer>> mapaNotasEstudiantes = new HashMap<>();
    Map<String, Integer> mapaInventario = new HashMap<>();
    Map<Character, Integer> mapaCaracteres = new HashMap<>();
    TreeMap<Integer, Ejercicio_9_Empleado> mapaEmpleados = new TreeMap<>();
    Map<String, Integer> mapaVotos = new HashMap<>();

    do {
        System.out.println("=====================MENÚ=====================");
        System.out.println("1. Crear y mostrar un Map de países y capitales");
        System.out.println("2. Contar la frecuencia de palabras en una frase");
        System.out.println("3. Crear una agenda telefónica");
        System.out.println("4. Convertir una lista en un Map");
        System.out.println("5. Traducir palabras de español a inglés");
        System.out.println("6. Añadir notas de estudiantes");
        System.out.println("7. Crear un inventario de productos");
        System.out.println("8. Contar carácteres en una palabra");
        System.out.println("9. Gestión de empleados con Map");
        System.out.println("10. Crear un sistema de votaciones");
        System.out.println("11. Salir");
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                mapaPaisCapital = Ejercicio_1.crearMapaPaisesYCapitales();
                Ejercicio_1.mostrarMapa(mapaPaisCapital);
                break;

            case 2:
                System.out.println("Introduce una frase:");
                String frase = sc.nextLine();
                mapaFrecuencia = Ejercicio_2.contarPalabras(frase);
                Ejercicio_2.mostrarFrecuencia(mapaFrecuencia);
                break;

            case 3:
                System.out.println("Introduce el nombre del contacto:");
                String nombre = sc.nextLine();
                System.out.println("Introduce el número del contacto:");
                String numero = sc.nextLine();
                Ejercicio_3.agregarContacto(mapaAgenda, nombre, numero);
                System.out.println("Agenda:");
                Ejercicio_3.mostrarContactos(mapaAgenda);
                System.out.println("Introduce el nombre que quieres buscar:");
                String nombreBuscar = sc.nextLine();
                Ejercicio_3.buscarNumero(mapaAgenda, nombreBuscar);
                break;

            case 4:
                List<String> listaNombres = Arrays.asList("Carmen", "María", "Marta", "Carlos", "Jose", "Manu");
                mapaLista = Ejercicio_4.convertirListaAMapa(listaNombres);
                Ejercicio_4.mostrarMapa(mapaLista);
                break;

            case 5:
                Ejercicio_5.agregarPalabras(mapaDiccionario);
                System.out.println("Introduce palabra en español a traducir:");
                String palabra = sc.nextLine();
                Ejercicio_5.traducir(mapaDiccionario, palabra);
                break;

            case 6:
                System.out.println("Introduce el nombre del estudiante:");
                String alumno = sc.nextLine();
                System.out.println("Introduce las notas de " + alumno + " separadas por espacios:");
                String[] notasStr = sc.nextLine().split("\\s+");
                List<Integer> notas = new ArrayList<>();
                for (String n : notasStr) {
                    notas.add(Integer.parseInt(n));
                }
                Ejercicio_6.agregarEstudianteYNota(mapaNotasEstudiantes, alumno, notas);
                Ejercicio_6.mostrarPromedio(mapaNotasEstudiantes);
                break;

            case 7:
                System.out.println("Introduce el nombre del producto:");
                String producto = sc.nextLine();
                System.out.println("Introduce la cantidad:");
                int cantidad = sc.nextInt();
                sc.nextLine();
                Ejercicio_7.agregarProducto(mapaInventario, producto, cantidad);
                System.out.println("Inventario:");
                Ejercicio_7.mostrarInventario(mapaInventario);
                System.out.println("Introduce el nombre del producto que quiere actualizar:");
                String productoAct = sc.nextLine();
                System.out.println("Introduce la cantidad del producto actualizada:");
                int cantidadAct = sc.nextInt();
                sc.nextLine();
                Ejercicio_7.actualizarProducto(mapaInventario, productoAct, cantidadAct);
                System.out.println("Inventario actualizado:");
                Ejercicio_7.mostrarInventario(mapaInventario);
                System.out.println("Introduce el nombre del producto que quiere eliminar:");
                String productoEli = sc.nextLine();
                Ejercicio_7.eliminarProducto(mapaInventario, productoEli);
                System.out.println("Producto eliminado");
                break;

            case 8:
                System.out.println("Introduce una palabra:");
                String palabraContar = sc.nextLine();
                mapaCaracteres = Ejercicio_8.contarCaracteres(palabraContar);
                Ejercicio_8.mostrarMapa(mapaCaracteres);
                break;

            case 9:
                System.out.println("Introduce la ID del empleado:");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Introduce el nombre del empleado:");
                String nombreEmp = sc.nextLine();
                System.out.println("Introduce el salario del empleado:");
                double salario = sc.nextDouble();
                sc.nextLine();
                Ejercicio_9.agregarEmpleado(mapaEmpleados, id, nombreEmp, salario);
                System.out.println("Lista de empleados: ");
                Ejercicio_9.listarEmpleados(mapaEmpleados);
                System.out.println("Introduce la ID del empleado que quiere buscar:");
                int idBuscar = sc.nextInt();
                sc.nextLine();
                Ejercicio_9.buscarEmpleado(mapaEmpleados, idBuscar);
                break;

            case 10:
                System.out.println("Introduce nombre del candidato:");
                String candidato = sc.nextLine();
                Ejercicio_10.registrarVoto(mapaVotos, candidato);
                Ejercicio_10.mostrarResultados(mapaVotos);
                Ejercicio_10.ganador(mapaVotos);
                break;

            case 11:
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("Opción incorrecta, vuelve a elegir.");
        }

    } while (opcion != 11);

    sc.close();
}