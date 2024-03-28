package tests;

import model.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SimpleTests {
    @Test
    public void calcTest(){
        int a = 5;
        int b = 10;
        Assertions.assertEquals(18,a+b);
    }

    @Test
    @Tag("pets")
    public void lombokDogTest(){
        Dog dog = Dog.builder()
                .name("Tuzik")
                .breed("Doberman")
                .age(4)
                .build();
        System.out.println(dog.getName());

    }
}
