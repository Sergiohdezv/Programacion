public class Electrodomestico {
    private double precioBase;
    private Colores color;
    private String consumoElectrico;
    private double peso;

    public Electrodomestico() {
        this.precioBase = 100;
        this.color = Colores.Blanco;
        this.consumoElectrico = "A";
        this.peso = 10;
    }

    public Electrodomestico(double precioBase, Colores color, String consumoElectrico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoElectrico = comprobarConsumoEnergetico(consumoElectrico);
        this.peso = peso;
    }

    private String comprobarConsumoEnergetico(String letra) {
        if (letra.equals("A+") || letra.equals("A") || letra.equals("B")
            || letra.equals("C") || letra.equals("D") || letra.equals("E")
            || letra.equals("F")) {
            return letra;
        } else {
            return "A";
        }
    }

    private double precioPeso() {
        if (peso >= 0 && peso <= 19) {
            return 10;
        } else if (peso >= 20 && peso <= 49) {
            return 30;
        } else if (peso >= 50 && peso <= 79) {
            return 50;
        } else return 100;
    }

    public double precioFinal() {
            double precioConsumoElectrico = 0;
            switch (consumoElectrico) {
                case "A+":
                    precioConsumoElectrico = 120;
                    break;
                case "A":
                    precioConsumoElectrico = 100;
                    break;
                case "B":
                    precioConsumoElectrico = 80;
                    break;
                case "C":
                    precioConsumoElectrico = 60;
                    break;
                case "D":
                    precioConsumoElectrico = 50;
                    break;
                case "E":
                    precioConsumoElectrico = 30;
                    break;
                case "F":
                    precioConsumoElectrico = 10;
                    break;
            }
            return precioBase + precioConsumoElectrico + precioPeso();
        }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public String getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(String consumoElectrico) {
        this.consumoElectrico = comprobarConsumoEnergetico(consumoElectrico);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", consumoElectrico='" + consumoElectrico + '\'' +
                ", peso=" + peso +
                '}';
    }
}
