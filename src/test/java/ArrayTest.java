import Lesson_6.DZ.CheckArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArrayTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Integer[][][] {
                {{1,5,3,8,4,79,6}, {79,6}},
                {{2,2,4}, {}},
                {{1,2,4,8,9,4,3}, {3}},
                {{3,2,8,9,}, {}}
        });
    }

    private CheckArray arr;
    private Integer[] a;
    private Integer[] b;


    public ArrayTest(Integer[] a, Integer[] b) {
        this.a = a;
        this.b = b;
    }

    @Before
    public void init() {
        arr = new CheckArray();
    }

    @Test
    public void massTest() {
        Assert.assertArrayEquals(b,arr.checkN(a));
    }

    @Test
    public void massTest2() {
        Assert.assertTrue(arr.check14(a));
    }
}
