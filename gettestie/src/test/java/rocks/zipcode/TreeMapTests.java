package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class TreeMapTests {
    private TreeMap<String, Integer> myTreeMap;
    private Person jack;
    private Person jill;
    private Person back;
    private Person bill;
    private Person phack;
    private Person phil;


    @Before
    public void setUp() throws Exception {
        myTreeMap = new TreeMap<>();
        jack = new Person("Jack", 1990);
        jill = new Person("Jill", 1991);
        back = new Person("Back", 1992);
        bill = new Person("Bill", 1993);
        phack = new Person("Phack", 1994);
        phil = new Person("Phil", 1995);
        myTreeMap.put(jack.getName(), jack.getYearOfBirth());
        myTreeMap.put(jill.getName(), jill.getYearOfBirth());
    }

    @After
    public void tearDown() throws Exception {
        myTreeMap.clear();
    }

    @Test
    public void TestTreeMap1() {
        myTreeMap.clear();
        Assert.assertTrue(myTreeMap.isEmpty());
    }

    @Test
    public void TestTreeMap2() {
        Assert.assertFalse(myTreeMap.isEmpty());
    }

    @Test
    public void TestTreeMap3() {
        Integer expected = 2;
        Integer actual = myTreeMap.size();

        assertEquals(expected, actual);
    }

    @Test
    public void TestTreeMap4() {
        myTreeMap.put(jack.getName(), jack.getYearOfBirth());
        Integer expected = 2;
        Integer actual = myTreeMap.size();

        assertEquals(expected, actual);
    }

    @Test
    public void TestTreeMap5() {
        Assert.assertTrue(myTreeMap.containsKey(jack.getName()));
    }

    @Test
    public void TestTreeMap6() {
        Assert.assertTrue(myTreeMap.containsValue(1991));
    }

    @Test
    public void TestTreeMap7() {
        Integer expected = 1990;
        Integer actual = myTreeMap.get(jack.getName());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestTreeMap8() {
        myTreeMap.remove(jack.getName());
        Integer expected = 1;
        Integer actual = myTreeMap.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestTreeMap9() {
        myTreeMap.remove(jack.getName(), 100);
        Integer expected = 2;
        Integer actual = myTreeMap.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestTreeMap10() {
        myTreeMap.replace(jack.getName(), 100);
        Integer expected = 100;
        Integer actual = myTreeMap.get(jack.getName());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestTreeMap11() {
        TreeMap<Integer, String> thisMap = new TreeMap<>();
        thisMap.put(bill.getYearOfBirth(), bill.getName());
        thisMap.put(jill.getYearOfBirth(), jill.getName());
        thisMap.put(phil.getYearOfBirth(), phil.getName());
        thisMap.put(back.getYearOfBirth(), back.getName());
        thisMap.put(phack.getYearOfBirth(), phack.getName());
        thisMap.put(jack.getYearOfBirth(), jack.getName());

        assertEquals((int) thisMap.firstEntry().getKey(), jack.getYearOfBirth());
        assertEquals((int) thisMap.lastEntry().getKey(), phil.getYearOfBirth());

    }




}
