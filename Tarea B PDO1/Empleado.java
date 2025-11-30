public class Empleado {
    private String nombre;
    private String apellidos;
    private double sueldoBase;
    private double retenciones;
    private char categoria;
    private static int contadorEmpleados;
    private static double primaGlobal;

    public Empleado(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldoBase = 1500;
        this.retenciones = 5;
        this.categoria = 'A';
        contadorEmpleados++;
    }

    public Empleado(String nombre, String apellidos, double sueldoBase, double retenciones, char categoria) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldoBase = sueldoBase;
        this.retenciones = retenciones;
        this.categoria = categoria;
        contadorEmpleados++;
    }

    public double calcularSueldo() {
        double sueldoFinal = 0;
        switch (this.categoria) {
            case 'A':
                sueldoFinal = this.sueldoBase + 100 + (primaGlobal * this.sueldoBase / 100) - (this.retenciones * this.sueldoBase / 100);
                break;
            case 'B':
                sueldoFinal = this.sueldoBase + 200 + (primaGlobal * this.sueldoBase / 100) - (this.retenciones * this.sueldoBase / 100);
                break;
            case 'C':
                sueldoFinal = this.sueldoBase + 300 + (primaGlobal * this.sueldoBase / 100) - (this.retenciones * this.sueldoBase / 100);
                break;
            case 'D':
                sueldoFinal = this.sueldoBase + 500 + (primaGlobal * this.sueldoBase / 100) - (this.retenciones * this.sueldoBase / 100);
                break;
            default:
                System.out.println("Caso erróneo");
        }
        return sueldoFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getRetenciones() {
        return retenciones;
    }

    public void setRetenciones(double retenciones) {
        this.retenciones = retenciones;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }

    public static void setPrimaGlobal(double primaGlobal) {
        Empleado.primaGlobal = primaGlobal;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " " + calcularSueldo() + "€";
    }
}
