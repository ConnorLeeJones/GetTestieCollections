package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class TreeSetTests {
    private TreeSet<Person> myTreeSet;
    private Person jack;
    private Person jill;

    @Before
    public void setUp() throws Exception {
        myTreeSet = new TreeSet<>();
        jack = new Person("Jack", 1990);
        jill = new Person("Jill", 1991);
        myTreeSet.add(jack);
        myTreeSet.add(jill);
    }

    @After
    public void tearDown() throws Exception {
        myTreeSet.clear();
    }

    @Test
    public void TestTreeSet1() {
        myTreeSet.clear();
        assertEquals(true, myTreeSet.isEmpty());
    }

    @Test
    public void TestTreeSet2() {
        assertEquals(false, myTreeSet.isEmpty());
    }

    @Test
    public void TestTreeSet3() {
        Integer expected = 2;
        Integer actual = myTreeSet.size();

        assertEquals(expected, actual);
    }

    @Test
    public void TestTreeSet4() {
        myTreeSet.add(jack);
        Integer expected = 2;
        Integer actual = myTreeSet.size();

        assertEquals(expected, actual);
    }

    @Test
    public void TestTreeSet5() {
        TreeSet<Person> myTreeSetClone = (TreeSet<Person>) myTreeSet.clone();

        Integer expected = 2;
        Integer actual = myTreeSetClone.size();

        assertEquals(expected, actual);
    }

    @Test
    public void TestTreeSet6() {
        assertTrue(myTreeSet.contains(jack));
    }

    @Test
    public void TestTreeSet7() {
        myTreeSet.remove(jack);
        assertFalse(myTreeSet.contains(jack));
    }

    @Test
    public void TestTreeSet8() {
        Person nullPerson = null;

        boolean canAddNull = true;

        try {
            myTreeSet.add(nullPerson);
        } catch (NullPointerException e){
            canAddNull = false;
        }

        assertFalse(canAddNull);
    }

    @Test
    public void TestTreeSet9() {
        Person nullPerson = null;
        boolean canAddNull = true;

        try {
            myTreeSet.add(nullPerson);
        } catch (NullPointerException e){
            canAddNull = false;
        }
        assertFalse(canAddNull);
    }

    @Test
    public void TestTreeSetSort() {
        Person zurg = new Person("Zurg", 2050);
        Person george = new Person("George", 1800);
        Person al = new Person("Al", 1942);

        myTreeSet.add(zurg);
        myTreeSet.add(george);
        myTreeSet.add(al);

        Person expectedFirst = myTreeSet.pollFirst();
        Assert.assertEquals(expectedFirst, al);
    }

    @Test
    public void testTreeSetSort2() {
        Person zurg = new Person("Zurg", 2050);
        Person george = new Person("George", 1800);
        Person al = new Person("Al", 1942);

        myTreeSet.add(zurg);
        myTreeSet.add(george);
        myTreeSet.add(al);

        Person expectedLast = myTreeSet.pollLast();
        Assert.assertEquals(expectedLast, zurg);
    }

    @Test
    public void testDescending() {
        Person zurg = new Person("Zurg", 2050);
        Person george = new Person("George", 1800);
        Person al = new Person("Al", 1942);

        myTreeSet.add(zurg);
        myTreeSet.add(george);
        myTreeSet.add(al);

        TreeSet<Person> descendingSet = (TreeSet<Person>) myTreeSet.descendingSet();

        Person expectedFirst = descendingSet.pollFirst();
        Assert.assertEquals(expectedFirst, zurg);
    }

    @Test
    public void subSetTest() {
        Person zurg = new Person("Zurg", 2050);
        Person george = new Person("George", 1800);
        Person al = new Person("Al", 1942);

        myTreeSet.add(zurg);
        myTreeSet.add(george);
        myTreeSet.add(al);

        TreeSet<Person> subSet = (TreeSet<Person>) myTreeSet.subSet(jack, zurg);

        Integer expected = 2;
        Integer actual = subSet.size();

        Assert.assertEquals(expected, actual);
    }


}
