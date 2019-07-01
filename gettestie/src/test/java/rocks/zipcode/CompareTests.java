package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeSet;

public class CompareTests {

    private Person bonnie;
    private Person bonnie2;
    private Person clyde;


    @Before
    public void setUp() {
        bonnie = new Person("Bonnie", 1900);
        clyde = new Person("Clyde", 1900);
        bonnie2 = new Person("Bonnie", 1900);

    }

//    @After
//    public void tearDown() throws Exception {
//    }

    @Test
    public void CompareTest1(){
        Assert.assertTrue(bonnie instanceof Comparable);
    }

    @Test
    public void CompareTest2(){
       Assert.assertTrue(bonnie.compareTo(clyde) < 0);
    }

    @Test
    public void CompareTest3(){
        Assert.assertEquals(0, bonnie.compareTo(bonnie2));
    }

}
