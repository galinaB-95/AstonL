import org.example.AreaTriangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.geom.Area;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    @DisplayName("Факториал")
    public void getFactorial() {
        System.out.println();
    }

    @Test
    @DisplayName("Площадь")
    public  void testArea(){
        Area area = new Area();
        assertEquals(20, AreaTriangle.area(10,8) );
    }
}

