package main;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger firstBinary = sc.nextBigInteger();
        BigInteger secondBinary = sc.nextBigInteger();

        String firstBinaryToString = firstBinary.toString();
        String secondBinaryToString = secondBinary.toString();

        BigInteger p = new BigInteger(firstBinaryToString, 2);
        BigInteger q = new BigInteger(secondBinaryToString, 2);

        BigInteger sum = p.add(q);

        String res = sum.toString(2);
        System.out.println(res);

    }
}
