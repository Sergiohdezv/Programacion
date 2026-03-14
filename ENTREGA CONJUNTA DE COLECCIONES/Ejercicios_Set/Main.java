void main() {
    Scanner sc = new Scanner(System.in);
    int opcion;

    do {
        System.out.println("==================== MENÚ DE EJERCICIOS ====================");
        System.out.println("1. Crear lista de nombres y mostrarla");
        System.out.println("2. Ordenar ascendentemente los números del 1 al 10");
        System.out.println("3. Listar palabras y mostrarlas por orden de escritura");
        System.out.println("4. Comprobar si existe un elemento en una lista");
        System.out.println("5. Eliminar un elemento y mostrar el contenido restante.");
        System.out.println("6. Combinar dos listas");
        System.out.println("7. Crear una lista con los elementos comunes de dos listas distintas");
        System.out.println("8. Eliminar los elementos de una lista y confirmar que está vacía");
        System.out.println("9. Crear una lista y ordenarla por orden alfabético");
        System.out.println("10. Contar la cantidad de elemenos únicos de una lista");
        System.out.println("11. Verificar si una lista es el subconjunto de otra");
        System.out.println("12. Crear una lista con números aleatorios sin que no haya duplicados");
        System.out.println("13. Verificar si una palabra es anagrama de otra");
        System.out.println("14. Copiar una lista y pegarla en otra");
        System.out.println("15. Mostrar los elementos exclusivos de dos listas en una nueva");
        System.out.println("16. Salir");
        System.out.print("Elige una opción: ");

        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                Ejercicio_1.crearListaSet();
                break;
            case 2:
                Ejercicio_2.ordenarNumeros();
                break;
            case 3:
                Ejercicio_3.ordenarPalabras();
                break;
            case 4:
                Ejercicio_4.comprobar();
                break;
            case 5:
                Ejercicio_5.eliminar();
                break;
            case 6:
                Ejercicio_6.combinar();
                break;
            case 7:
                Ejercicio_7.comunes();
                break;
            case 8:
                Ejercicio_8.arbolVacio();
                break;
            case 9:
                Ejercicio_9.crearListaSet();
                break;
            case 10:
                Ejercicio_10.crearListaSet();
                break;
            case 11:
                Ejercicio_11.subconjunto();
                break;
            case 12:
                Ejercicio_12.numerosAleatorios();
                break;
            case 13:
                Ejercicio_13.verificarAnagrama();
                break;
            case 14:
                Ejercicio_14.combinar();
                break;
            case 15:
                Ejercicio_15.exclusivos();
                break;
            case 16:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida, intenta de nuevo.");
        }

    } while (opcion != 0);

    sc.close();
}
