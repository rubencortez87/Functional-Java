import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {

    static void showHelp(CLIAArguments cliArguments){
        Consumer<CLIAArguments> consumerHelper = cliArguments1 -> {
            if(cliArguments1.isHelp()){
                System.out.println("Manual solicitado");
            }

        };

        consumerHelper.accept(cliArguments);
    }

    static CLIAArguments generateCLI(){
        Supplier<CLIAArguments> generator = () -> new CLIAArguments();

        return generator.get();
    }
}
