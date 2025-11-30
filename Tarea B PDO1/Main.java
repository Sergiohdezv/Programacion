void main() {
    Empleado e1 = new Empleado("Pedro", "Pérez", 1300, 2, 'B');
    Empleado e2 = new Empleado("Ana", "Díez");
    Empleado e3 = new Empleado("Carmen", "Lorenzo", 1250, 6, 'D');

    System.out.println(e1);
    System.out.println(e2);
    System.out.println(e3);
    System.out.println("Empleados: " + Empleado.getContadorEmpleados());

    System.out.println();
    System.out.println("Se ha aplicado una prima de bonificación a todos los empleados del 10%.");

    Empleado.setPrimaGlobal(10);
    e1.setCategoria('C');

    System.out.println(e1);
    System.out.println(e2);
    System.out.println(e3);
    System.out.println("Empleados: " + Empleado.getContadorEmpleados());
}
