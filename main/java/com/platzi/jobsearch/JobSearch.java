package com.platzi.jobsearch;

import com.platzi.jobsearch.api.JobPosition;
import com.platzi.jobsearch.cli.CLIArguments;
import com.platzi.jobsearch.cli.CLIFunctions;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static com.platzi.jobsearch.CommanderFunctions.parseArguments;
import static com.platzi.jobsearch.api.ApiFunctions.buildAPI;

public class JobSearch {
    public static void main(String[] args) {
        JCommander jCommander = buildCommanderWhithName("job-search", CLIArrguments::newInstance);

        Stream<CLIArguments> streamOfCLI =
                parseArguments(jCommander, args, JCommander::usage)
                .orElse(Collections.emptyList());
                .stream() Stream<Object>
                .map(obj -> (CLIArguments) obj);

                Optional<CLIArguments> cliArgumentsOptional =
                        streamOfCLI.filter(cli -> !cli.isHelp())
                        .filter(cli -> cli.getKeyword()) = null)
                        .findFirst();

                cliArgumentsOptional.map(CLIFunctions::tomap)
                        .map(JobsSearch::executeRequest)
                        .orElse(String.empty())
                        .forEach(System.out::println);
    }

        private static Stream<JobPosition> executeRequest(Map<String, Object> params){
            APIJobs api = buildAPI(APIJobs.class, "https://jobs.github.com");

            return Stream.off(params)
                    .map(api::jobs)
                    .flatMap(Collection::stream);

        }
}
