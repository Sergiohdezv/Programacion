import java.util.Scanner;

public class Gato extends  Animal {
    private boolean tieneCola;
    private int vidasRestantes;

    public Gato(String nombre, String especie, int edad, boolean tieneCola, int vidasRestantes) {
        super(nombre, especie, edad);
        this.tieneCola = tieneCola;
        this.vidasRestantes = vidasRestantes;
    }

    public Gato() {
        this.tieneCola = true;
        this.vidasRestantes = 7;
    }

    @Override
    public void hacerSonido() {
        System.out.println("miau miau");
    }

    @Override
    public void alimentarse() {
        System.out.println("El gato come pescado");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        if (tieneCola) {
            System.out.println("El gato tiene cola.");
        } else {
            System.out.println("El gato no tiene cola.");
        }
        System.out.println("Vidas restantes: " + vidasRestantes);
    }

    public void saltar(int veces) {
        for (int i = 1; i <= veces; i++) {
            System.out.println("El perro está saltando. (" + i + ")");
        }
    }

    public static Gato crearGatoPorConsola() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a crear un gato.");
        System.out.println("Introduce el nombre de tu gato:");
        String nombre = sc.nextLine();
        System.out.println("Introduce la especie:");
        String especie = sc.nextLine();
        System.out.println("Introduce la edad de tu gato:");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce las vidas de tu gato:");
        int vidasRestantes = sc.nextInt();
        System.out.println("¿El gato tiene cola? (Escribe true si tiene cola / Escribe false si no tiene cola) ");
        boolean tieneCola = sc.nextBoolean();
        return new Gato(nombre, especie, edad, tieneCola, vidasRestantes);
    }
}
