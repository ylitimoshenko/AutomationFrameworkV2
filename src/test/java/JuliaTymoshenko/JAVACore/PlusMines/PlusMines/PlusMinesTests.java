package JuliaTymoshenko.JAVACore.PlusMines.PlusMines;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlusMinesTests {
    @Test
    public void plusTestPositive() {
        ClassPlusMinesMethod classPlusMinesMethod = new ClassPlusMinesMethod();
        Assert.assertTrue(20 == classPlusMinesMethod.plus(12, 8));
    }

    @Test
    public void plusTestNegative() {
        ClassPlusMinesMethod classPlusMinesMethod = new ClassPlusMinesMethod();
        Assert.assertTrue(25 == classPlusMinesMethod.plus(12, 8));
    }

    @Test
    public void minesTestPositive() {
        ClassPlusMinesMethod classPlusMinesMethod = new ClassPlusMinesMethod();
        Assert.assertTrue(4 == classPlusMinesMethod.mines(12, 8));
    }

    @Test
    public void minesTestNegative() {
        ClassPlusMinesMethod classPlusMinesMethod = new ClassPlusMinesMethod();
        Assert.assertFalse(5 == classPlusMinesMethod.mines(12, 8));
    }
}
