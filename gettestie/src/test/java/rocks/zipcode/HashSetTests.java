package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class HashSetTests {
    HashSet<Person> myHashSet;
    Person jack;
    Person jill;

    @Before
    public void setUp() throws Exception {
        myHashSet = new HashSet<>();
        jack = new Person("Jack", 1990);
        jill = new Person("Jill", 1991);
        myHashSet.add(jack);
        myHashSet.add(jill);
    }

    @After
    public void tearDown() throws Exception {
        myHashSet.clear();
    }

    @Test
    public void TestHashSet1() {
        myHashSet.clear();
        assertEquals(true, myHashSet.isEmpty());
    }

    @Test
    public void TestHashSet2() {
        assertEquals(false, myHashSet.isEmpty());
    }

    @Test
    public void TestHashSet3() {
        Integer expected = 2;
        Integer actual = myHashSet.size();

        assertEquals(expected, actual);
    }

    @Test
    public void TestHashSet4() {
        myHashSet.add(jack);
        Integer expected = 2;
        Integer actual = myHashSet.size();

        assertEquals(expected, actual);
    }

    @Test
    public void TestHashSet5() {
        HashSet<Person> myHashSetClone = (HashSet) myHashSet.clone();

        Integer expected = 2;
        Integer actual = myHashSetClone.size();

        assertEquals(expected, actual);
    }

    @Test
    public void TestHashSet6() {
        assertTrue(myHashSet.contains(jack));
    }

    @Test
    public void TestHashSet7() {
        myHashSet.remove(jack);
        assertFalse(myHashSet.contains(jack));
    }

    @Test
    public void TestHashSet8() {
        Person nullPerson = null;

        myHashSet.add(nullPerson);

        Integer expected = 3;
        Integer actual = myHashSet.size();

        assertEquals(expected, actual);
    }


}
