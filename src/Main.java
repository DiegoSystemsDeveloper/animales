import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Animal> animales = new ArrayList<>();

    public static void main(String[] args) {
        String menu = "Bienvenido al programa para registrar animales\n" +
                "Seleccione una opción:\n" +
                "1. Registrar Perro.\n" +
                "2. Registrar Gato.\n" +
                "3. Registrar Humano.\n" +
                "4. Registrar Ave.\n" +
                "5. Registrar Ardilla.\n" +
                "6. Ver información.\n" +
                "7. Salir.";

        String opcion = "";
        Scanner lector = new Scanner(System.in);
        do {
            System.out.println(menu);
            opcion = lector.next();

            switch (opcion) {
                case "1":
                    String nombre = lector.next();
                    Perro p = new Perro(nombre);
                    animales.add(p);
                    break;
                case "2":
                    nombre = lector.next();
                    Gato g = new Gato(nombre);
                    animales.add(g);
                    break;
                case "3":
                    nombre = lector.next();
                    String id = lector.next();
                    String eps = lector.next();
                    Humano h = new Humano(id, nombre, eps);
                    animales.add(h);
                    break;
                case "4":
                    nombre = lector.next();
                    Ave a = new Ave(nombre);
                    animales.add(a);
                    break;
                case "5":
                    nombre = lector.next();
                    Ardilla ardilla = new Ardilla(nombre);
                    animales.add(ardilla);
                    break;
                case "6":
                    break;
                case "7":
                    System.out.println("Hasta luego");
                default:
                    System.out.println("Opción incorrecta ");
            }

        } while (!"6".equals(opcion));

    }
}