package bacit.junit;
import static org.junit.Assert.*;
import org.junit.Test;

public class ValutaAssertionTest {
    @Test
    public void testMultiplication() {
        NorskKrone fem = new NorskKrone(5);
        fem.ganger(2); // eller multiplisertMed(2) ?
        assertEquals(10, fem.belop);
    };
}