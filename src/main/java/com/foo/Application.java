package com.foo;

import io.bootique.Bootique;
import io.bootique.di.BQModule;
import io.bootique.jersey.JerseyModule;

public class Application {

    public static void main(String[] args) {
        BQModule module = binder ->
                JerseyModule.extend(binder).addResource(HelloResource.class);
        Bootique
                .app(args)
                .module(module)
                .autoLoadModules()
                .exec()
                .exit();
    }
}