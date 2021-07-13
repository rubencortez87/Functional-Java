package com.platzi.jobsearch.api;

public interface ApiFunctions {
    static <T> T buildAPI(Class<T> clazz, String url) {
        return Feign.builder()
                .decoder(new GsonDEcoder())
                .target(clazz, url);

    }

}
