package pl.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void testPoint() {
       Point p = new Point(1, 1);
        Assert.assertEquals(p.distance(), 0.0);
    }
}
