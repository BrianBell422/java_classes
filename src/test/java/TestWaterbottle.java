import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterbottle {

    Waterbottle bottle;

    @Before
    public void before(){
        bottle = new Waterbottle(100);
    }

    @Test
    public void hadVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drinkTaken(){
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void fillBottle(){
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }
}
