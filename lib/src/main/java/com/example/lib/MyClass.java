package com.example.lib;

public class MyClass {

    public static void main(String args[]) throws InterruptedException {
//        twoLockPrint();
//        System.out.print(CalculatorUtils.fibonacci(6));
        System.out.print(CalculatorUtils.moreThanHalfNum(new int[]{3,3,2,2,3,1,4,4,4,4,4}));

    }

    private static void twoLockPrint() throws InterruptedException {
        Object lockA = new Object();
        Object lockB = new Object();
        Object lockC = new Object();

        Thread threadA = new Thread(new Printer(lockC,lockA,"A"));
        Thread threadB = new Thread(new Printer(lockA,lockB,"B"));
        Thread threadC = new Thread(new Printer(lockB,lockC,"C"));

        threadA.start();
        Thread.sleep(100);
        threadB.start();
        Thread.sleep(100);
        threadC.start();
        Thread.sleep(100);

    }
}
