import org.example.ClassTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.awt.geom.Area;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    @DisplayName("Факториал")
    public void getFactorial() {
        Assertions.assertEquals(24, ClassTests.getFactorial(4));

    }

    @Test
    @DisplayName("Площадь")
    public void testArea() {
        assertEquals(40, ClassTests.area(10, 8));
    }

    @Test
    @DisplayName("Сложение")
    public void testAdd() {
        assertEquals(10, ClassTests.add(8, 2));
    }

    @Test
    @DisplayName("Вычетание")
    public void testSubtract() {
        assertEquals(10, ClassTests.subtract(28, 18));
    }

    @Test
    @DisplayName("Умножение")
    public void testMultipy() {
        assertEquals(25, ClassTests.multipy(5, 5));
    }

    @Test
    @DisplayName("Деление")
    public void testDivide() {
        assertEquals(10, ClassTests.divide(30, 3));
    }

    @Test
    @DisplayName("Сравнение")
    public void testCompare() {
        assertEquals(-1, ClassTests.compare(5, 7));
    }

}


