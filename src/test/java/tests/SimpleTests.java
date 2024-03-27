package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTests {
    @Test
    public void calcTest(){
        int a = 5;
        int b = 10;
        Assertions.assertEquals(18,a+b);
    }
}
