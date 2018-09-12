package com.example.lib;

public class Printer implements Runnable {

    private static int PRINT_COUNT = 6;
    private Object mFrontLock;
    private Object mThisLock;
    private String mPrintName;

    public Printer(Object mFrontLock, Object mThisLock, String mPrintName) {
        this.mFrontLock = mFrontLock;
        this.mThisLock = mThisLock;
        this.mPrintName = mPrintName;
    }

    @Override
    public void run() {

        while (PRINT_COUNT > 0) {
            synchronized (mFrontLock) {
                synchronized (mThisLock) {
                    System.out.println(mPrintName);
                    PRINT_COUNT--;
                    mThisLock.notifyAll();
                }
                try {
                    if (PRINT_COUNT == 0) {
                        mFrontLock.notifyAll();
                    } else {
                        mFrontLock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
