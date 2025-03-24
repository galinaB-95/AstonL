import org.example.ClassForTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.geom.Area;

public class Tests {
    @Test
    public void testGetFactorial (){
        Assert.assertEquals(24, ClassForTests.getFactorial(4) );
    }
    @Test
    public void testArea(){
        Area area = new Area();
        Assert.assertEquals(40, ClassForTests.area(10, 8));
    }
}
