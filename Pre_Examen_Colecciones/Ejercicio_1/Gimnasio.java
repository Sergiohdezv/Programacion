import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Gimnasio {
    public static ArrayList <Socio> listaSocios = new ArrayList<>();

    public static void hacerListaSocios(ArrayList<Socio> socios) {
        listaSocios = socios;
    }

    public static void aniadirSocio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del socio:");
        String nombre = sc.nextLine();
        System.out.println("Introduce el dni del socio:");
        String dni = sc.nextLine();

        for (Socio s : listaSocios) {
            if (s.getDni().equalsIgnoreCase(dni)) {
                System.out.println("Error: ya existe un socio con ese DNI.");
                return;
            }
        }

        System.out.println("Introduce la edad del socio:");
        int edad = sc.nextInt();
        System.out.println("Introduce la fecha de hoy:");
        sc.nextLine();
        String fecha = sc.nextLine();

        Socio nuevo = new Socio(nombre, dni, edad, fecha, true);
        listaSocios.add(nuevo);

        System.out.println("Socio añadido.");
    }

    public static void darDeBaja() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu DNI: ");
        String dni = sc.nextLine();

        for (Socio s: listaSocios) {
            if (s.getDni().equals(dni)) {
                s.setActivo(false);
                System.out.println("Socio dado de baja");
                return;
            }
        }
        System.out.println("Dni no encontrado");
    }

    public static void listaSociosActivos() {

        ArrayList<Socio> listaActivos = new ArrayList<>();

        for (Socio s : listaSocios) {
            if (s.isActivo()) {
                listaActivos.add(s);
            }
        }
        Collections.sort(listaActivos, new Comparator<Socio>() {
            @Override
            public int compare(Socio o1, Socio o2) {
                return o1.getNombre().compareToIgnoreCase(o2.getNombre());
            }
        });

        for (Socio s : listaActivos) {
            System.out.println(s);
        }
    }

    public static void listaSociosInactivos() {

        ArrayList<Socio> listaInactivos = new ArrayList<>();

        for (Socio s : listaSocios) {
            if (!s.isActivo()) {
                listaInactivos.add(s);
            }
        }
        Collections.sort(listaInactivos, new Comparator<Socio>() {
            @Override
            public int compare(Socio o1, Socio o2) {
                return o1.getDni().compareToIgnoreCase(o2.getDni());
            }
        });

        for (Socio s : listaInactivos) {
            System.out.println(s);
        }
    }

    public static void borrarSocio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu DNI: ");
        String dni = sc.nextLine();

        for (Socio s: listaSocios) {
            if (s.getDni().equals(dni)) {
                listaSocios.remove(s);
                System.out.println("Socio borrado");
                return;
            }
        }
        System.out.println("Dni no encontrado");
    }
}
