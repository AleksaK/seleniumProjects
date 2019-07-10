package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG {


   @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }


    @Test
    public void test1(){
        System.out.println("test1");
    }




    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }

}
