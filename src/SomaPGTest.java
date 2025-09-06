import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SomaPGTest {

    @Test
    void testePGCrescente_comAssertEquals() {

        SomaPG pg = new SomaPG();
        double resultado = pg.somarPG(2, 2, 3);
        assertEquals(14.0, resultado); // confere se é igual a 14

    }
    @Test
    void testePGConstante_comAssertTrue() {

        SomaPG pg = new SomaPG();
        double resultado = pg.somarPG(5, 1, 3);
        assertTrue(resultado == 15.0); // confere se a condição é verdadeira

    }
    @Test
    void testePGDecrescente_comAssertNotEquals() {

        SomaPG pg = new SomaPG();
        double resultado = pg.somarPG(10, 0.5, 3);
        assertNotEquals(20.0, resultado); // confere que NÃO é 20

    }
    @Test
    void testeEntradaInvalida_comAssertThrows() {
        SomaPG pg = new SomaPG();
        assertThrows(IllegalArgumentException.class, () -> {
            pg.somarPG(7, 2, -1); // termos negativos
        });
    }
}
