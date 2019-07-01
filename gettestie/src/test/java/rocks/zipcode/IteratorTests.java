package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTests {
    private ArrayList<Person> myArrayList;
    private Person jack;
    private Person jill;
    private Person bonnie;
    private Person clyde;
    private Iterator iterator;

    @Before
    public void setUp() {
        myArrayList = new ArrayList<>();
        jack = new Person("Jack", 1900);
        jill = new Person("Jill", 1991);
        bonnie = new Person("Bonnie", 1900);
        clyde = new Person("Clyde", 1900);

        myArrayList.add(jack);
        myArrayList.add(jill);
        myArrayList.add(bonnie);
        myArrayList.add(clyde);

        iterator = myArrayList.iterator();
    }


    @Test
    public void iteratorTest1(){
        Assert.assertTrue(iterator.hasNext());
    }


    @Test
    public void iteratorTest2(){
        Assert.assertEquals(iterator.next(), jack);
    }

    @Test
    public void iteratorTest3(){
        while (iterator.hasNext()){
            if (iterator.next().equals(bonnie)){
                iterator.remove();
            }
        }
        Assert.assertFalse(myArrayList.contains(bonnie));
    }

    @Test
    public void iteratorTest4(){
        iterator.next();
        iterator.next();

        StringBuilder builder = new StringBuilder();

        iterator.forEachRemaining(builder::append);

        String actual = builder.toString();

        String expected = "Name: Bonnie\n" +
            "Year of birth: 1900\n" +
            "Name: Clyde\n" +
            "Year of birth: 1900\n";

        Assert.assertEquals(expected, actual);
    }


}
