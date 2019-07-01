package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


import static org.junit.Assert.*;

public class VectorTests {
    private Vector<Person> myVector;
    private Person jack;
    private Person jill;
    private Vector<Person> myVector2;
    private Person bonnie;
    private Person clyde;
    private Vector myVector3;

    @Before
    public void setUp() throws Exception {
        myVector = new Vector<>();
        jack = new Person("Jack", 1900);
        jill = new Person("Jill", 1991);
        myVector.add(jack);
        myVector.add(jill);

        myVector2 = new Vector<>();
        bonnie = new Person("Bonnie", 1900);
        clyde = new Person("Clyde", 1900);
        myVector2.add(bonnie);
        myVector2.add(clyde);

        myVector3 = new Vector<>();
        myVector3.addAll(myVector);
        myVector3.addAll(myVector2);
    }

    @After
    public void tearDown() throws Exception {
        myVector.clear();
        myVector2.clear();
        myVector3.clear();
    }

    @Test
    public void testArrList1() {
        myVector.clear();
        assertTrue(myVector.isEmpty());
    }

    @Test
    public void testArrList2() {
        Assert.assertFalse(myVector.isEmpty());
    }

    @Test
    public void testArrList3() {
        Integer expected = 2;
        Integer actual = myVector.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList4() {
        myVector.add(jack);
        Integer expected = 3;
        Integer actual = myVector.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList5() {
        Vector myVectorClone = (Vector) myVector.clone();

        Integer expected = 2;
        Integer actual = myVectorClone.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList6() {
        Assert.assertTrue(myVector.contains(jack));
    }

    @Test
    public void testArrList7() {
        myVector.remove(jack);
        assertFalse(myVector.contains(jack));
    }

    @Test
    public void testArrList8() {
        myVector.addAll(myVector2);
        Integer expected = 4;
        Integer actual = myVector.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList9() {
        Person expected = jill;
        Person actual = myVector.get(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList10() {
        Integer expected = 1;
        Integer actual = myVector.indexOf(jill);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList11() {
        myVector.add(jack);
        Integer expected = 2;
        Integer actual = myVector.lastIndexOf(jack);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList12() {
        Integer expected = -1;
        Integer actual = myVector.lastIndexOf(bonnie);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList13() {
        myVector.add(jack);
        myVector.add(jack);
        myVector.add(bonnie);
        Integer expected = 5;
        Integer actual = myVector.size();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testArrList14() {
        myVector.add(jack);
        myVector.add(jack);
        myVector.add(bonnie);

        ArrayList<Person> peopleToRemove = new ArrayList<>();
        peopleToRemove.add(jack);
        peopleToRemove.add(bonnie);

        myVector.removeAll(peopleToRemove);
        Integer expected = 1;
        Integer actual = myVector.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList15() {
        myVector.add(bonnie);
        myVector.add(clyde);
        myVector.removeIf(n -> n.getYearOfBirth() == 1900);
        Integer expected = 1;
        Integer actual = myVector.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList16() {
        Integer expected = 4;
        Integer actual = myVector3.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList17() {
        Person[] testArray;
        testArray = (Person[]) myVector3.toArray(new Person[0]);
        Integer expected = 4;
        Integer actual = testArray.length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList18() {
        myVector3.set(3, jack);
        Person expected = jack;
        Person actual = (Person) myVector3.get(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList19() {
        List<Person> arrSublist;
        arrSublist = myVector3.subList(0, 1);
        Integer expected = 1;
        Integer actual = arrSublist.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrList20() {
        List<Person> arrSublist;
        arrSublist = myVector3.subList(0, 1);
        Person expected = jack;
        Person actual = arrSublist.get(0);
        Assert.assertEquals(expected, actual);
    }





}
