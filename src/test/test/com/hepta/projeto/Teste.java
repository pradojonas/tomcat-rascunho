package test.com.hepta.projeto;

import org.junit.jupiter.api.Test;

import main.Application;

public class Teste {
    
    String env = Application.getApplicationEnvProperty();
    
    @Test
    public final void testAssert() {
        System.out.println(env);
    }

}
