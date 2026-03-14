public class Ejercicio_9_Empleado {

    private String nombre;
    private double salario;

    public Ejercicio_9_Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Ejercicio_9{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }
}
