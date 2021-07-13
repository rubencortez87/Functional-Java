import java.util.List;
import java.util.function.Function;

public class Inferencia {
    public static void main(String[] args) {
        Function<Integer, String> funcionConvertidora =
                int --> "Al doble" + (integer * 2);

        List<String> alumnos = NombresUtils.getList("HUgo", "Paco", "Luis");
        alumnos.forEach((String name --> System.out.println(name));
        alumnos.forEach(name --> System.out.println(name));
        alumnos.forEach(System.out::println);
    }
}
