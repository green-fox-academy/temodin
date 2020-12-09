package Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal zebra = new Animal();

    @Test
    void eat() {
        zebra.eat();
        zebra.eat();
        zebra.eat();
        assertEquals(47,zebra.hunger);
    }

    @Test
    void drink() {
        zebra.drink();
        zebra.drink();
        zebra.drink();
        zebra.drink();
        assertEquals(46,zebra.thirst);
    }

    @Test
    void play() {
        zebra.play();
        zebra.play();
        assertEquals(52,zebra.hunger);
    }
}