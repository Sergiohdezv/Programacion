import java.util.Map;
import java.util.TreeMap;

public class Ejercicio_9 {
    public static void agregarEmpleado(TreeMap<Integer,Ejercicio_9_Empleado> mapa, int id, String nombre, double salario){
        mapa.put(id, new Ejercicio_9_Empleado(nombre, salario));
    }

    public static void buscarEmpleado(TreeMap<Integer,Ejercicio_9_Empleado> mapa, int id){
        if(mapa.containsKey(id)){
            System.out.println(id + ": " + mapa.get(id));
        } else {
            System.out.println("Empleado no encontrado");
        }
    }

    public static void listarEmpleados(TreeMap<Integer,Ejercicio_9_Empleado> mapa){
        for(Map.Entry<Integer,Ejercicio_9_Empleado> entry : mapa.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}