package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    private Calcul calcul;

    @Test
    public void testSomme () {
        calcul = new Calcul();
        double a = 19;
        double b = 7;
        double expected = 26;
        double res = calcul.somme(a, b);
        Assert.assertEquals(res, expected, 0.0);
    }
}
