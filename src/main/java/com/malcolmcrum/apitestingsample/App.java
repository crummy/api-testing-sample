package com.malcolmcrum.apitestingsample;

import static spark.Spark.*;

public class App {
    public static void main( String[] args ) {
        get("/hello/:name", (req, res) -> {
            String name = req.params(":name");
            return "Hello " + name + "!";
        });
    }
}
