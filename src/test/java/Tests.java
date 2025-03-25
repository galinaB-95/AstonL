import com.beust.ah.A;
import org.example.ClassForTests;
import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.geom.Area;


public class Tests {
    @Test
    public void testGetFactorial() {
        Assert.assertEquals(24, ClassForTests.getFactorial(4));
    }

    @Test
    public void testArea() {
        Assert.assertEquals(40, ClassForTests.area(10, 8));
    }

    @Test(groups = "Калькулятор")
    public void testAdd() {
        Assert.assertEquals(10, ClassForTests.add(6, 4));
    }

    @Test(groups = "Калькулятор")
    public void testSubtract() {
        Assert.assertEquals(10, ClassForTests.subtract(30, 20));
    }

    @Test(groups = "Калькулятор")
    public void testMultipy() {
        Assert.assertEquals(32, ClassForTests.multipy(16, 2));
    }

    @Test(groups = "Калькулятор")
    public void testDivide() {
        Assert.assertEquals(15, ClassForTests.divide(30, 2));
    }

    @BeforeGroups("Калькулятор")
    public void calculator() {
        System.out.println("Тесты калькулятора");
    }

    @DataProvider
    public Object[][] testComparing() {
        return new Object[][]{
                {2, 2},
                {2, 1},
                {4, 5},
        };
    }

    @Test(dataProvider = "testComparing")
    public void testComparing(int a, int b) {
        Assert.assertEquals(a, b);
    }
}
