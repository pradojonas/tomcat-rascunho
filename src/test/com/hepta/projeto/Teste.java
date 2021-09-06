package com.hepta.projeto;

import org.junit.jupiter.api.Test;

import com.projeto.Application;

public class Teste {
    
    String env = Application.getApplicationEnvProperty();
    
    @Test
    public final void testAssert() {
        System.out.println(env);
    }

}
