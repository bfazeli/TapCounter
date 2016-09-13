package edu.orangecoastcollege.cs273.bfazeli.tapcounter;

/**
 * Created by bijanfazeli on 9/12/16.
 */
public class Counter {
    private int mCount;

    /**
     * getCount:    Returns the count variable.
     *
     * @return:     Returns the current count variable when called.
     */
    public int getCount() {
        return mCount;
    }

    /**
     * incrementCount:  Increments the count variable by one when called
     */
    public void incrementCount() {
        mCount++;
    }
}
