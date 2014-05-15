package cats;

import groovy.lang.Binding;
import org.codehaus.groovy.tools.shell.Groovysh;
import org.codehaus.groovy.tools.shell.IO;

/**
 * Created by pivotal on 5/15/14.
 */
public class Console {
    public static void main(String[] args) {
        Binding binding = new Binding();
        new Groovysh(binding, new IO());
    }
}
