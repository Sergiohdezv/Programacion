public class ZooApp {
    public static void main() {
        Perro p1 = Perro.crearPerroPorConsola();
        Gato g1 = Gato.crearGatoPorConsola();
        Loro l1 = new Loro("Paquito", "Loro albino", 30, "Blanco", true);

        System.out.println();
        p1.mostrarDetalles();
        System.out.println();
        g1.mostrarDetalles();
        System.out.println();
        l1.mostrarDetalles();

        System.out.println();
        p1.esMayor(g1);
        p1.esMayor(l1);
        g1.esMayor(l1);

        System.out.println();
        p1.hacerSonido();
        p1.alimentarse();
        p1.moverCola(3);

        System.out.println();
        g1.hacerSonido();
        g1.alimentarse();
        g1.saltar(3);

        System.out.println();
        l1.hacerSonido();
        l1.alimentarse();
    }
}