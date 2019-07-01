package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class ArrayDequeTests {

    private ArrayDeque<Person> myDeque;
    private Person jack;
    private Person jill;
    private Person bonnie;
    private Person clyde;
    private Person james;

    @Before
    public void setUp() throws Exception {
        myDeque = new ArrayDeque<>();
        jack = new Person("Jack", 1990);
        jill = new Person("Jill", 1991);
        bonnie = new Person("Bonnie", 1900);
        clyde = new Person("Clyde", 1900);
        james = new Person("James", 1872);

        myDeque.add(jack);
        myDeque.add(jill);
        myDeque.add(bonnie);
        myDeque.add(clyde);

    }

    @After
    public void tearDown() throws Exception {
        myDeque.clear();
    }

    @Test
    public void testLL1() {
        myDeque.clear();
        assertEquals(true, myDeque.isEmpty());
    }

    @Test
    public void testLL2() {
        Integer expected = 4;
        Integer actual = myDeque.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL3() {
        Person expected = jack;
        Person actual = myDeque.peek();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testLL4() {
        myDeque.addFirst(bonnie);
        Person expected = bonnie;
        Person actual = myDeque.peek();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testLL5() {
        myDeque.removeFirst();
        Person expected = jill;
        Person actual = myDeque.peek();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL6() {
        Person expected = jack;
        Person actual = myDeque.pop();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL7() {
        myDeque.pop();
        Integer expected = 3;
        Integer actual = myDeque.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL8() {
        Person expected = jack;
        Person actual = myDeque.pop();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL9() {
        Person twinPeeks = myDeque.peek();
        Person actual = jack;
        Assert.assertEquals(twinPeeks, actual);
    }

    @Test
    public void testLL10() {
        myDeque.peek();
        Integer expected = 4;
        Integer actual = myDeque.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL11() {
        myDeque.push(james);
        Integer expected = 5;
        Integer actual = myDeque.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL12() {
        myDeque.offerFirst(james);
        Person expected = james;
        Person actual = myDeque.peek();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL13() {
        myDeque.offerLast(james);
        Person expected = james;
        Person actual = myDeque.peekLast();
        Assert.assertEquals(expected, actual);
    }


}
