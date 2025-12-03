import java.util.Scanner;

public class Perro extends Animal {
    private String raza;
    private boolean entrenado;

    public Perro(String nombre, String especie, int edad, String raza, boolean entrenado) {
        super(nombre, especie, edad);
        this.raza = raza;
        this.entrenado = entrenado;
    }

    public Perro() {
        this.raza = "";
        this.entrenado = true;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau, guau!");
    }

    @Override
    public void alimentarse() {
        System.out.println("El perro está comiendo pienso.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Raza: " + raza);
        if (entrenado) {
            System.out.println("Está entrenado.");
        } else {
            System.out.println("No está entrenado.");
        }
    }

    public void moverCola(int veces) {
        for (int i = 1; i <= veces; i++) {
            System.out.println("El perro está moviendo la cola. (" + i + ")");
        }
    }

    public static Perro crearPerroPorConsola() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a crear un perro.");
        System.out.println("Introduce el nombre de tu perro:");
        String nombre = sc.nextLine();
        System.out.println("Introduce la especie:");
        String especie = sc.nextLine();
        System.out.println("Introduce la edad de tu perro:");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce la raza de tu perro:");
        String raza = sc.nextLine();
        System.out.println("¿El perro está entrenado? (Escribe true si está entrenado / Escribe false si no está entrenado) ");
        boolean entrenado = sc.nextBoolean();
        return new Perro(nombre, especie, edad, raza, entrenado);
    }
}
