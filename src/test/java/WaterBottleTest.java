import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());

    }
    @Test
    public void reducedVolume(){
        assertEquals(90, waterBottle.reduceVolume());
    }

    @Test
    public void emptiedBottle(){
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void filledBottle(){
        assertEquals(100, waterBottle.fillBottle());
    }
}
