void main() {
    Lavadora lavadoraAEG = new Lavadora(400, Colores.Plateado, "PK", 30, 7);
    Television tvSamsung = new Television();
    System.out.println(lavadoraAEG);
    System.out.println(lavadoraAEG.precioFinal());
    System.out.println(tvSamsung);
    System.out.println(tvSamsung.precioFinal());

    tvSamsung.setPrecioBase(190);
    tvSamsung.setColor(Colores.Negro);
    tvSamsung.setConsumoElectrico("A+");
    tvSamsung.setPeso(10);
    tvSamsung.setResolucion(24);
    tvSamsung.setNetflix(true);
    System.out.println(tvSamsung);
    System.out.println(tvSamsung.precioFinal());
}
