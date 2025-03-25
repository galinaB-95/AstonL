import org.example.ClassTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.geom.Area;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    @DisplayName("Факториал")
    public void getFactorial() {
        assertEquals(24, ClassTests.getFactorial(4));
        ;
    }

    @Test
    @DisplayName("Площадь")
    public  void testArea(){
        Area area = new Area();
        assertEquals(20, ClassTests.area(10,8) );
    }
}

