
package jianye.algorithm.QuickSort;

import java.util.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class QuickSortTest {

    private QuickSort quickSort;

    @BeforeClass
    public void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void cleanUpAfterClass() throws Exception {

    }

    @BeforeMethod
    public void setUpBeforeMethod() throws Exception {
        quickSort = new QuickSort();
    }

    @AfterMethod
    public void cleanUpAfterMethod() throws Exception {

    }

    @Test
    public void testTrue() throws Exception {
        Assert.assertTrue(true);
    }

    @Test
    public void testRun() throws Exception {

    }

}

