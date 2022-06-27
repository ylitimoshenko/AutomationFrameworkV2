package JuliaTymoshenko.JAVACore.MultiplicationDevision;

import JuliaTymoshenko.JAVACore.ClassPlusMinesMethod;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyltiplicationDevisionTest {

    @Test
    public void multTestPositive() {
        MultiplicationDivisionMethod multiplicationDivisionMethod = new MultiplicationDivisionMethod();
        Assert.assertTrue(18 == multiplicationDivisionMethod.multiplication(6, 3));
    }

    @Test
    public void multTestNegative() {
        MultiplicationDivisionMethod multiplicationDivisionMethod = new MultiplicationDivisionMethod();
        Assert.assertFalse(5 == multiplicationDivisionMethod.multiplication(2, 3));
    }

    @Test
    public void multFloatPositive() {
        MultiplicationDivisionMethod multiplicationDivisionMethod = new MultiplicationDivisionMethod();
        Assert.assertEquals(0.875, multiplicationDivisionMethod.multiplication(0.7, 1.25));
    }

    @Test
    public void multDoublePositive() {
        MultiplicationDivisionMethod multiplicationDivisionMethod = new MultiplicationDivisionMethod();
        Assert.assertTrue(0.875 == multiplicationDivisionMethod.multiplication(0.7, 1.25));
    }

    @Test
    public void devisionDoublePositive() {
        MultiplicationDivisionMethod multiplicationDivisionMethod = new MultiplicationDivisionMethod();
        Assert.assertEquals(4.5, multiplicationDivisionMethod.devision(14.4, 3.2));
    }

    @Test
    public void devisionDoublPositive() {
        MultiplicationDivisionMethod multiplicationDivisionMethod = new MultiplicationDivisionMethod();
        Assert.assertTrue(4.5 == multiplicationDivisionMethod.devision(14.4, 3.2));
    }

    @Test
    public void devisionDoubleNegative() {
        MultiplicationDivisionMethod multiplicationDivisionMethod = new MultiplicationDivisionMethod();
        Assert.assertFalse(4.1 == multiplicationDivisionMethod.devision(14.4, 3.2));
    }

    @Test
    public void devisionTestPositive() {
        MultiplicationDivisionMethod multiplicationDivisionMethod = new MultiplicationDivisionMethod();
        Assert.assertTrue(9 == multiplicationDivisionMethod.devision(45, 5));
    }

    @Test
    public void devisionTestNegative() {
        MultiplicationDivisionMethod multiplicationDivisionMethod = new MultiplicationDivisionMethod();
        Assert.assertFalse(64 == multiplicationDivisionMethod.devision(100, 5));
    }
}
