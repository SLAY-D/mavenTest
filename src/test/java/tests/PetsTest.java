package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("petsall")
public class PetsTest {
    @Test
    public void successTest(){
        Assertions.assertTrue(true);
    }

    @Test
    public void unsuccessTest(){
        Assertions.assertTrue(false);
    }
}
