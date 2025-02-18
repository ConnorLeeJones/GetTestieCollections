package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Stack;

public class TestStack {

    private Stack<Person> myStack;
    private Person jack;
    private Person jill;
    private Person bonnie;
    private Person clyde;
    private Person james;

    @org.junit.Before
    public void setUp() throws Exception {
        myStack = new Stack<>();
        jack = new Person("Jack", 1990);
        jill = new Person("Jill", 1991);
        bonnie = new Person("Bonnie", 1900);
        clyde = new Person("Clyde", 1900);
        james = new Person("James", 1872);

        myStack.add(jack);
        myStack.add(jill);
        myStack.add(bonnie);
        myStack.add(clyde);

    }

    @org.junit.After
    public void tearDown() throws Exception {
        myStack.clear();
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....


    @Test
    public void testLL1() {
        myStack.clear();
        assertEquals(true, myStack.isEmpty());
    }

    @Test
    public void testLL2() {
        Integer expected = 4;
        Integer actual = myStack.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL3() {
        Person expected = jack;
        Person actual = myStack.get(0);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testLL4() {
        myStack.push(bonnie);
        Person expected = bonnie;
        Person actual = myStack.get(4);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testLL5() {
        myStack.pop();
        Integer expected = 3;
        Integer actual = myStack.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL6() {
        Person expected = clyde;
        Person actual = myStack.pop();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL7() {
        myStack.pop();
        Integer expected = 3;
        Integer actual = myStack.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL8() {
        Person expected = clyde;
        Person actual = myStack.pop();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL9() {
        Person expected = clyde;
        Person twinPeeks = myStack.peek();
        Assert.assertEquals(expected, twinPeeks);
    }

    @Test
    public void testLL10() {
        myStack.peek();
        Integer expected = 4;
        Integer actual = myStack.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL11() {
        myStack.push(james);
        Integer expected = 5;
        Integer actual = myStack.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLL12() {
        myStack.push(james);
        Person expected = jack;
        Person actual = myStack.get(0);
        Assert.assertEquals(expected, actual);
    }
}
