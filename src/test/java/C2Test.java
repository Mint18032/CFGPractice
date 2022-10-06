import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * CFG Testing.
 */
public class C2Test {

    @Test
    public void test1() {
        int h = 24;
        int age = 5;
        int EO = -1;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        System.out.println("h\t\tage\t\tEO\t\t\tAO");
        System.out.println(h + "\t\t" + age + "\t\t" + EO + "\t\t\t" + price);
        Assert.assertEquals(price, EO);
    }

    @Test
    public void test2() {
        int h = 5;
        int age = 2;
        int EO = 0;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        System.out.println(h + "\t\t" + age + "\t\t" + EO + "\t\t\t" + price);
        Assert.assertEquals(price, EO);
    }

    @Test
    public void test3() {
        int h = 8;
        int age = 8;
        int EO = 45000;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        System.out.println(h + "\t\t" + age + "\t\t" + EO + "\t\t" + price);
        Assert.assertEquals(price, EO);
    }

    @Test
    public void test4() {
        int h = 8;
        int age = 36;
        int EO = 60000;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        System.out.println(h + "\t\t" + age + "\t\t" + EO + "\t\t" + price);
        Assert.assertEquals(price, EO);
    }

    @Test
    public void test5() {
        int h = 8;
        int age = 67;
        int EO = 51000;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        System.out.println(h + "\t\t" + age + "\t\t" + EO + "\t\t" + price);
        Assert.assertEquals(price, EO);
    }

    @Test
    public void test6() {
        int h = 16;
        int age = 8;
        int EO = 30000;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        System.out.println(h + "\t\t" + age + "\t\t" + EO + "\t\t" + price);
        Assert.assertEquals(price, EO);
    }

    @Test
    public void test7() {
        int h = 16;
        int age = 67;
        int EO = 34000;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        System.out.println(h + "\t\t" + age + "\t\t" + EO + "\t\t" + price);
        Assert.assertEquals(price, EO);
    }

    @Test
    public void test8() {
        int h = 16;
        int age = 36;
        int EO = 40000;
        int price = trainFareCalculating.trainFareCalculate(h, age);
        System.out.println(h + "\t\t" + age + "\t\t" + EO + "\t\t" + price);
        Assert.assertEquals(price, EO);
    }
}