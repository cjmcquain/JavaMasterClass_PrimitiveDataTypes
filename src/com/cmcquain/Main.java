package com.cmcquain;

public class Main {

    public static void main(String[] args) {
	    byte myByte = 24;
	    short myShort = 1;
	    int myInt = 100000;
	    long myLong = (long) 50000L + 10L * (myByte + myShort + myInt);
	    System.out.println("myLong = " + myLong);
	    short shortTotal = (short) (1000 * 10 * (myByte + myInt + myShort));
	    System.out.println("shortTotal = " + shortTotal);
    }
}
