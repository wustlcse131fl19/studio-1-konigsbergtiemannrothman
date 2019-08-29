package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("The first of 2 numbers to be averaged?");
        int n2 = ap.nextInt("The second number?");

        System.out.println( (double)(n1 + n2)/2 );


    }
}
