import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Boundary Value Analysis Testing.
 */
public class C2Test {

    @Test
    public void test1() {
        int h = 0;
        int age = 100;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, 51000);
    }

    @Test
    public void test2() {
        int h = 9;
        int age = 100;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, 34000);
    }

    @Test
    public void test3() {
        int h = 17;
        int age = 100;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, 51000);
    }

    @Test
    public void test4() {
        int h = 19;
        int age = 100;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, 34000);
    }

    @Test
    public void test5() {
        int h = 24;
        int age = 100;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, -1);
    }

    @Test
    public void test6() {
        int h = 12;
        int age = 0;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, 0);
    }

    @Test
    public void test7() {
        int h = 12;
        int age = 6;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, 30000);
    }

    @Test
    public void test8() {
        int h = 12;
        int age = 10;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, 30000);
    }

    @Test
    public void test9() {
        int h = 12;
        int age = 60;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, 34000);
    }

    @Test
    public void test10() {
        int h = 12;
        int age = 200;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        Assert.assertEquals(price, 34000);
    }
}