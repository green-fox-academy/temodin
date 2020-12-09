package Animal;

import static org.junit.Assert.*;

public class FarmTest {
    Farm farm = new Farm();


    @org.junit.Test
    public void testConstructor() {
        assertEquals(10,farm.slots);
    }

    @org.junit.Test
    public void testConstructor2() {
        assertEquals(0,farm.animals.size());}

    @org.junit.Test
    public void testBreed() {
        farm.breed();
        assertEquals(1,farm.animals.size());
    }
    @org.junit.Test
    public void testBreed11() {
        for (int i = 0; i < 10; i++) {
            farm.breed();
        }
        assertEquals(10,farm.animals.size());
    }

    @org.junit.Test
    public void slaughter3() {
        farm.breed();
        farm.breed();
        farm.breed();
        farm.animals.get(0).hunger=30;
        farm.animals.get(1).hunger=48;
        farm.animals.get(2).hunger=47;
        farm.slaughter();
        assertEquals(48,farm.animals.get(0).hunger);

    }
    @org.junit.Test
    public void slaughter3withSameHunger() {
        farm.breed();
        farm.breed();
        farm.breed();
        farm.animals.get(0).hunger=30;
        farm.animals.get(1).hunger=48;
        farm.animals.get(2).hunger=30;
        farm.slaughter();
        assertEquals(48,farm.animals.get(0).hunger);

    }
}