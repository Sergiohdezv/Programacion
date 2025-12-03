public class Television extends Electrodomestico {
    private double resolucion;
    private boolean netflix;

    public Television() {
        super();
        this.resolucion = 20;
        this.netflix = false;
    }

    public Television(double precioBase, Colores color, String consumoElectrico, double peso, double resolucion, boolean netflix) {
        super(precioBase, color, consumoElectrico, peso);
        this.resolucion = resolucion;
        this.netflix = netflix;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isNetflix() {
        return netflix;
    }

    public void setNetflix(boolean netflix) {
        this.netflix = netflix;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (this.resolucion > 20) {
            precio += getPrecioBase() * 30 / 100;
        }
        if (this.netflix) {
            precio += 60;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Television{" +
                "precioBase=" + getPrecioBase() +
                ", consumoElectrico='" + getConsumoElectrico() + '\'' +
                ", peso=" + getPeso() +
                ", resolucion=" + resolucion +
                ", netflix=" + netflix +
                '}';
    }
}
