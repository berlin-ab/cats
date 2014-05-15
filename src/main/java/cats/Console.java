package cats;

import groovy.lang.Binding;
import org.codehaus.groovy.tools.shell.Groovysh;
import org.codehaus.groovy.tools.shell.IO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Console {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Console.class, args);
        Binding binding = new Binding();
        binding.setProperty("app", context);
        new Groovysh(binding, new IO()).run((String) null);
    }
}