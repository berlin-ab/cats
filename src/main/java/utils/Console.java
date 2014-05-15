package utils;

import groovy.lang.Binding;
import org.codehaus.groovy.tools.shell.Groovysh;
import org.codehaus.groovy.tools.shell.IO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cats")
@EnableAutoConfiguration
public class Console {
    public static void main(String[] args) {
        ApplicationContext context = new SpringApplicationBuilder()
                .main(Console.class)
                .sources(Console.class, cats.Application.class)
                .showBanner(false)
                .headless(true)
                .web(false)
                .run();


        Binding binding = new Binding();
        binding.setProperty("app", context);
        new Groovysh(binding, new IO()).run((String) null);
    }
}