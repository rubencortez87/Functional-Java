import java.util.function.Function;

public class MathOperations2 {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy3 = x -> x * 3;
        System.out.println("Multiplicando x: " + x + " por 3");
        return x * 3;

        Function<Integer, Integer> addMultiplyBy3;
        addMultiplyBy3 = multiplyBy3.compose(y -> {
                System.out.println("Le agregare 1 a:" + y));
                return y + 1;
        });

        Function<Integer, Integer> andSquare =
                addMultiplyBy3.andThen(x -> {
                    System.out.println("Estoy elevando " + x + " al cuadrado");
                    return x * x;
                });

        System.out.println(
            addMultiplyBy3.apply(5));

        System.out.println(andSquare.apply(3));

    }
}
