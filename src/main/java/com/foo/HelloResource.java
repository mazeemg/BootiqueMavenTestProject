package com.foo;

import io.bootique.annotation.Args;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/")
public class HelloResource {

    @Inject
    @Args
    private String[] args;

    @GET
    public String hello() {
        String allArgs = String.join(" ", args);
        return "Hello, world! The app was started with these args: " + allArgs;
    }
}