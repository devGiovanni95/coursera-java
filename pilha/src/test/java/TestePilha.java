import org.example.Pilha;
import org.junit.Test;

import static  org.junit.Assert.*;
public class TestePilha {

    @Test
    public void pilhaVazia(){
        Pilha p = new Pilha();
        assertTrue(p.estaVazia());
        assertEquals(0, p.tamanho());
    }
}
