import java.util.Map;

public class Ejercicio_5 {
    public static void agregarPalabras(Map<String,String> diccionario){
        diccionario.put("hola","hello");
        diccionario.put("pelota","ball");
        diccionario.put("casa","house");
        diccionario.put("silla","chair");
        diccionario.put("ventana","window");
        diccionario.put("hamburguesa","hamburger");
    }

    public static void traducir(Map<String,String> diccionario, String palabra){
        if(diccionario.containsKey(palabra)){
            System.out.println("La traducción de " + palabra + " es: " + diccionario.get(palabra));
        } else {
            System.out.println("La palabra no está en el diccionario");
        }
    }
}