public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(double precioBase, Colores color, String consumoElectrico, double peso, double carga) {
        super(precioBase, color, consumoElectrico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (this.carga > 6) {
            precio += 50;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precioBase=" + getPrecioBase() +
                ", consumoElectrico='" + getConsumoElectrico() + '\'' +
                ", peso=" + getPeso() +
                ", carga=" + carga +
                '}';
    }
}
