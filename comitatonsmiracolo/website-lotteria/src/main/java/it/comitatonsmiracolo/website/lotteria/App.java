package it.comitatonsmiracolo.website.lotteria;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplicationBuilder app = new SpringApplicationBuilder(App.class);
        app.run(args);
    }

}
