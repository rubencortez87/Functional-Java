package com.platzi.jobsearch.cli;

public class CLIHelpValidator implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
        boolean actualValue = Boolean.parseBoolean(value);
        if(actualValue){
            throw new ParameterException("Ayuda solicitada");
        }

    }
}
