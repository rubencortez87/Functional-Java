import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {
        List<String> names = getNames();

    }

    Optional<List<String>> optionalNames = getOptionalNames();
    if(optionalNames.isPresent())

    {

    }

    optionalNames.ifPresent(namesValue ->namesValue.forEach(System.out::println));

    Optional<String> valuablePlayer = optionalValuePlayer();

    String valuablePlayerName = valuablePlayer.orElseGet(() -> "No Player");

    static List<String> getNames(){
        List<String> list = new LinkedList<>();

        return Collections.emptyList();
    }

    static String mostValuablePlayer(){
        //return "";
        return null;

    }

    static int mostExpensiveitem(){
        return -1;
    }

    static Optional<List<String>> getOptionalNames(){
        List<String> namesList = new LinkedList<>();
        return Optional.of(namesList);
    }

    static Optional<String> optionalValuePlayer(){
        //
        //return Optional.ofNullable()
        try {
            //Accesos
            return Optional.of("Sinuhe");
        }catch (Exception e){
            e.printStackTrace();
        }

        return Optional.empty();
    }
}
