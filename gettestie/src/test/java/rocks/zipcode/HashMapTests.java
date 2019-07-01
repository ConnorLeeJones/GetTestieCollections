package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HashMapTests {
    HashMap<Person, Integer> myHashMap;
    Person jack;
    Person jill;

    @Before
    public void setUp() throws Exception {
        myHashMap = new HashMap<>();
        jack = new Person("Jack", 1990);
        jill = new Person("Jill", 1991);
        myHashMap.put(jack, jack.getYearOfBirth());
        myHashMap.put(jill, jill.getYearOfBirth());
    }

    @After
    public void tearDown() throws Exception {
        myHashMap.clear();
    }

    @Test
    public void TestHashSet1() {
        myHashMap.clear();
        Assert.assertTrue(myHashMap.isEmpty());
    }

    @Test
    public void TestHashSet2() {
        Assert.assertFalse(myHashMap.isEmpty());
    }

    @Test
    public void TestHashSet3() {
        Integer expected = 2;
        Integer actual = myHashMap.size();

        assertEquals(expected, actual);
    }

    @Test
    public void TestHashSet4() {
        myHashMap.put(jack, jack.getYearOfBirth());
        Integer expected = 2;
        Integer actual = myHashMap.size();

        assertEquals(expected, actual);
    }

    @Test
    public void TestHashSet5() {
        Assert.assertTrue(myHashMap.containsKey(jack));
    }

    @Test
    public void TestHashSet6() {
        Assert.assertTrue(myHashMap.containsValue(1991));
    }

    @Test
    public void TestHashSet7() {
        Integer expected = 1990;
        Integer actual = myHashMap.get(jack);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestHashSet8() {
        myHashMap.remove(jack);
        Integer expected = 1;
        Integer actual = myHashMap.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestHashSet9() {
        myHashMap.remove(jack, 100);
        Integer expected = 2;
        Integer actual = myHashMap.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestHashSet10() {
        myHashMap.replace(jack, 100);
        Integer expected = 100;
        Integer actual = myHashMap.get(jack);
        Assert.assertEquals(expected, actual);
    }




}
