package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.*;

public class ArrayListTests {
    private ArrayList<Person> myArrayList;
    private Person jack;
    private Person jill;
    private ArrayList<Person> myArrayList2;
    private Person bonnie;
    private Person clyde;
    private ArrayList myArrayList3;

    @Before
    public void setUp() throws Exception {
        myArrayList = new ArrayList<>();
        jack = new Person("Jack", 1900);
        jill = new Person("Jill", 1991);
        myArrayList.add(jack);
        myArrayList.add(jill);

        myArrayList2 = new ArrayList<>();
        bonnie = new Person("Bonnie", 1900);
        clyde = new Person("Clyde", 1900);
        myArrayList2.add(bonnie);
        myArrayList2.add(clyde);

        myArrayList3 = new ArrayList<>();
        myArrayList3.addAll(myArrayList);
        myArrayList3.addAll(myArrayList2);
    }

    @After
    public void tearDown() throws Exception {
        myArrayList.clear();
        myArrayList2.clear();
        myArrayList3.clear();
    }

    @Test
    public void testArrList1() {
        myArrayList.clear();
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testArrList2() {
        Assert.assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void testArrList3() {
        Integer expected = 2;
        Integer actual = myArrayList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList4() {
        myArrayList.add(jack);
        Integer expected = 3;
        Integer actual = myArrayList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList5() {
        ArrayList myArrayListClone = (ArrayList) myArrayList.clone();

        Integer expected = 2;
        Integer actual = myArrayListClone.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList6() {
        Assert.assertTrue(myArrayList.contains(jack));
    }

    @Test
    public void testArrList7() {
        myArrayList.remove(jack);
        assertFalse(myArrayList.contains(jack));
    }

    @Test
    public void testArrList8() {
        myArrayList.addAll(myArrayList2);
        Integer expected = 4;
        Integer actual = myArrayList.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList9() {
        Person expected = jill;
        Person actual = myArrayList.get(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList10() {
        Integer expected = 1;
        Integer actual = myArrayList.indexOf(jill);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList11() {
        myArrayList.add(jack);
        Integer expected = 2;
        Integer actual = myArrayList.lastIndexOf(jack);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList12() {
        Integer expected = -1;
        Integer actual = myArrayList.lastIndexOf(bonnie);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList13() {
        myArrayList.add(jack);
        myArrayList.add(jack);
        myArrayList.add(bonnie);
        Integer expected = 5;
        Integer actual = myArrayList.size();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testArrList14() {
        myArrayList.add(jack);
        myArrayList.add(jack);
        myArrayList.add(bonnie);

        ArrayList<Person> peopleToRemove = new ArrayList<>();
        peopleToRemove.add(jack);
        peopleToRemove.add(bonnie);

        myArrayList.removeAll(peopleToRemove);
        Integer expected = 1;
        Integer actual = myArrayList.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList15() {
        myArrayList.add(bonnie);
        myArrayList.add(clyde);
        myArrayList.removeIf(n -> n.getYearOfBirth() == 1900);
        Integer expected = 1;
        Integer actual = myArrayList.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList16() {
        Integer expected = 4;
        Integer actual = myArrayList3.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList17() {
        Person[] testArray;
        testArray = (Person[]) myArrayList3.toArray(new Person[0]);
        Integer expected = 4;
        Integer actual = testArray.length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList18() {
        myArrayList3.set(3, jack);
        Person expected = jack;
        Person actual = (Person) myArrayList3.get(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList19() {
        List<Person> arrSublist;
        arrSublist = myArrayList3.subList(0, 1);
        Integer expected = 1;
        Integer actual = arrSublist.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList20() {
        List<Person> arrSublist;
        arrSublist = myArrayList3.subList(0, 1);
        Person expected = jack;
        Person actual = arrSublist.get(0);
        Assert.assertEquals(expected, actual);
    }





}
