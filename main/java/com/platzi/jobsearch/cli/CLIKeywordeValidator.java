package com.platzi.jobsearch.cli;

public class CLIKeywordeValidator implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
        if(!value.matches("^[a-zA-Z]+[0-9]*$")){
            System.err.print("El criterio de busqueda no es valido.");
            throw new ParameterException("Unicamente letras y numeros");
        }
    }
}
