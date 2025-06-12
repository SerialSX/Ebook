import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConversorTemperaturaTest {

    @Test
    public void testConversaoCelsiusParaFahrenheit() {
        double entrada = 25.0;
        double esperado = 77.0;
        double resultado = ConversorTemperatura.celsiusParaFahrenheit(entrada);
        assertEquals(esperado, resultado, 0.01);
    }
}
