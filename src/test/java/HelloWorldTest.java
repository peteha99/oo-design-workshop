import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void helloPete() {
        HelloWorld helloWorld = new HelloWorld();
        String actualResult = helloWorld.greeting("pete");
        assertEquals("Hello pete", actualResult);
    }
}
