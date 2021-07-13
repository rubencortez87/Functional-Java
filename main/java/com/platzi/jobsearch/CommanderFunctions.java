package com.platzi.jobsearch;

import java.util.Optional;
import java.util.function.Supplier;

public class CommanderFunctions {
    static <T> JCommander buildCommanderWhithName(
            String cliName, Supplier<T> argumentSupplier
    ) {
        JCommander jCommander = JCommander.newBuilder()
                .addObject(argumentSupplier.get())
                .buid();

        jCommander.setProgramName(cliName);
        return jCommander;
    }

    static Optional<List<Objetc>> parseArguments(
            JCommander jCommander,
            String[] arguments,
            Consumer<JCommander> onError
    ) {
        try {
            JCommander.parse(arguments);

            return Optional.Of(jCommander.getObjetc());
        } catch (ParameterException paramEx) {
            onError.accept(jCommander);
        }
        return Optional.empty();
    }
}