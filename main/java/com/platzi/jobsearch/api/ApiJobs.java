package com.platzi.jobsearch.api;

import java.util.List;

@Headers("Accept: application/json")
public class ApiJobs {

    @RequestLine("GET /position.json")
    List<JobPosition> jobs(@QueryMap<String, Object> queryMap);
}
