package cats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import static spark.Spark.get;

@EnableAutoConfiguration
@ComponentScan
public class Application {
    public static void main(String[] args){


        SpringApplication.run(Application.class, args);

        get("/hello",(request, response) -> {
            return "Hello World!";
        });
    }
}
