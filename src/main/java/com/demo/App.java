package com.demo;

import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
        // Inicia un servidor web en el puerto 8080
        Javalin app = Javalin.create().start(8080);
        
        app.get("/", ctx -> ctx.result("¡Hola Munod!"));
        
        System.out.println("Aplicación iniciada en puerto 8080...");
    }
}
