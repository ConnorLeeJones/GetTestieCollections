package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class LinkedListTests {

    private LinkedList<Person> myList;
    private Person jack;
    private Person jill;
    private Person bonnie;
    private Person clyde;
    private Person james;

    @Before
    public void setUp() throws Exception {
        myList = new LinkedList<>();
        jack = new Person("Jack", 1990);
        jill = new Person("Jill", 1991);
        bonnie = new Person("Bonnie", 1900);
        clyde = new Person("Clyde", 1900);
        james = new Person("James", 1872);

        myList.add(jack);
        myList.add(jill);
        myList.add(bonnie);
        myList.add(clyde);

    }

    @After
    public void tearDown() throws Exception {
        myList.clear();
    }

    @Test
    public void testLL1() {
        myList.clear();
        assertEquals(true, myList.isEmpty());
    }

    @Test
    public void testLL2() {
        Integer expected = 4;
        Integer actual = myList.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL3() {
        Person expected = jack;
        Person actual = myList.get(0);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testLL4() {
        myList.addFirst(bonnie);
        Person expected = bonnie;
        Person actual = myList.get(0);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testLL5() {
        myList.removeFirst();
        Person expected = jill;
        Person actual = myList.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL6() {
        Person expected = jack;
        Person actual = myList.pop();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL7() {
        myList.pop();
        Integer expected = 3;
        Integer actual = myList.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL8() {
        Person expected = jack;
        Person actual = myList.pop();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL9() {
        Person twinPeeks = myList.peek();
        Person actual = jack;
        Assert.assertEquals(twinPeeks, actual);
    }

    @Test
    public void testLL10() {
        myList.peek();
        Integer expected = 4;
        Integer actual = myList.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL11() {
        myList.push(james);
        Integer expected = 5;
        Integer actual = myList.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL12() {
        myList.push(james);
        Person expected = james;
        Person actual = myList.get(0);
        Assert.assertEquals(expected, actual);
    }

}
