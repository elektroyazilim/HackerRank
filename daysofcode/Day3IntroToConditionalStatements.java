package daysofcode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Day3IntroToConditionalStatements {

	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int N = Integer.parseInt(bufferedReader.readLine().trim());

	        bufferedReader.close();
	        Day3IntroToConditionalStatements.customPrint(N);
	    }
	    
	    public static void customPrint(int N)
	    {
	        if (N % 2 == 1) // n is odd
	        {
	            System.out.println("Weird");
	        } else {
	            if (2 <= N && N <= 5) {
	                System.out.println("Not Weird");
	            } else if (6 <= N && N <= 20) {
	                System.out.println("Weird");
	            } else if (N > 20) {
	                System.out.println("Not Weird");
	            }
	        }
	    }

}
