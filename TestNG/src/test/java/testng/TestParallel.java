package testng;

import org.testng.annotations.Test;

public class TestParallel {
    @Test
    public void method1() {
        System.out.println("Inside method1()");
        for (int i = 0;i<1000000;i++){
            System.out.println("From test 1 " + i);
        }
        //Assert.assertEquals(message, messageUtil.printMessage());
    }
    @Test
    public void method2() {
        System.out.println("Inside method2()");
        for (int i = 0;i<1000000;i++){
            System.out.println("From test 2 " + i);
        }
        //Assert.assertEquals(message, messageUtil.printMessage());
    }
}
