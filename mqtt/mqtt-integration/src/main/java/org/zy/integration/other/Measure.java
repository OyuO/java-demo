package org.zy.integration.other;


public class Measure {
    private Object lock = new Object();


    private long packageNumber;

    private long startTime;

    private long stopTime;

    public void record() {
        synchronized (lock) {
            if (packageNumber == 0) {
                startTime = System.currentTimeMillis();
            } else {
                stopTime = System.currentTimeMillis();
            }
            packageNumber++;
        }
    }


    public long result() {
        return (packageNumber * 1000 /(stopTime - startTime));
    }
}
