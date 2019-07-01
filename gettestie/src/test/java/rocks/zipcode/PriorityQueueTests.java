package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class PriorityQueueTests {
    private PriorityQueue<Person> myQueue;
    private Person jack;
    private Person jill;

    @Before
    public void setUp() {
        myQueue = new PriorityQueue<>();
        jack = new Person("Jack", 1990);
        jill = new Person("Jill", 1991);
        myQueue.add(jack);
        myQueue.add(jill);
    }

    @After
    public void tearDown() throws Exception {
        myQueue.clear();
    }

    @Test
    public void TestQueue1() {
        myQueue.clear();
        assertEquals(true, myQueue.isEmpty());
    }

    @Test
    public void TestQueue2() {
        assertEquals(false, myQueue.isEmpty());
    }

    @Test
    public void TestQueue3() {
        Integer expected = 2;
        Integer actual = myQueue.size();

        assertEquals(expected, actual);
    }

    @Test
    public void TestQueue4() {
        myQueue.add(jack);
        Integer expected = 3;
        Integer actual = myQueue.size();

        assertEquals(expected, actual);
    }

    @Test
    public void TestQueue5() {
        myQueue.offer(jack);
        Integer expected = 3;
        Integer actual = myQueue.size();

        assertEquals(expected, actual);
    }


    @Test
    public void TestQueue6() {
        assertTrue(myQueue.contains(jack));
    }

    @Test
    public void TestQueue7() {
        myQueue.remove(jack);
        assertFalse(myQueue.contains(jack));
    }

    @Test
    public void TestTQueue8() {
        Person nullPerson = null;

        boolean canAddNull = true;

        try {
            myQueue.add(nullPerson);
        } catch (NullPointerException e){
            canAddNull = false;
        }

        assertFalse(canAddNull);
    }

    @Test
    public void TestQueue9() {
        Person nullPerson = null;
        boolean canAddNull = true;

        try {
            myQueue.add(nullPerson);
        } catch (NullPointerException e){
            canAddNull = false;
        }
        assertFalse(canAddNull);
    }

    @Test
    public void TestQueue10() {
        Person zurg = new Person("Zurg", 2050);
        Person george = new Person("George", 1800);
        Person al = new Person("Al", 1942);

        myQueue.add(zurg);
        myQueue.add(george);
        myQueue.add(al);

        Person expectedFirst = myQueue.peek();
        Assert.assertEquals(expectedFirst, al);
    }

    @Test
    public void testQueue11() {
        Person zurg = new Person("Zurg", 2050);
        Person george = new Person("George", 1800);
        Person al = new Person("Al", 1942);

        myQueue.add(zurg);
        myQueue.add(george);
        myQueue.add(al);

        Person polled = myQueue.poll();

        assertEquals(polled, al);
        assertEquals(4, myQueue.size());
    }







}
