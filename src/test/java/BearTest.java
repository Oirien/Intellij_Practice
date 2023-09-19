import com.codebase.Bear;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {
    Bear bear;
    @Before
    public void before(){
        bear = new Bear("Jimmy", 25,2342.2);
    }
    @Test
    public void hasName(){
        assertEquals("Jimmy", bear.getName());
    }
    @Test
    public void hasAge(){
        assertEquals(25, bear.getAge());
    }
    @Test
    public void hasWeight(){
        assertEquals(2342.2, bear.getWeight(), 0.0);
    }
    @Test
    public void canSet(){
        bear.setAge(23);
        assertEquals(23, bear.getAge());
    }
    @Test
    public void canEatPeacock(){
        bear.eatPeacock(43.5);
        assertEquals(2385.7, bear.getWeight(), 0.0);
    }
}
