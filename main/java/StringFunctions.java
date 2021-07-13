

public class StringFunctions {
    @FunctionalInterface
    interface StringOperation {
        int getAmount();

        default void operate(String text) {
            int x = getAmount();
            while(x-- > 0){
                System.out.println(text);
            }
        }
    }

    @FunctionalInterface
    interface DoOperation {
        void take(String text);

        default void execute(int x, String text){
            while(x-- > 0){
                take(text);
            }
        }
    }

    public static void main(String[] args) {
        StringOperation six = () -> 6;
        six.operate("Alumno");

        DoOperation operationFive = text -> System.out.println(text);
        operationFive.execute(5,"Platzi");
    }

}
