import groovy.lang.Binding;
import org.codehaus.groovy.tools.shell.Groovysh;
import org.codehaus.groovy.tools.shell.IO;

import java.io.IOException;

public class Console {
    public static void main(String[] args) throws IOException {
        Binding binding = new Binding();
        binding.setVariable("foo", new Integer(2));
        new Groovysh(binding, new IO());
        System.out.println("I'm here");
    }
}
