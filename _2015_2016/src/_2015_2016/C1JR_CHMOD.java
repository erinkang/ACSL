package _2015_2016;
import java.util.*;
import java.io.*;

public class C1JR_CHMOD {
	public static void main(String [] args) {
		try {
			Scanner in = new Scanner(new File("1516c1jr.in"));
			for(int x = 0; x < 10; x++) {
				String [] binary = {"000", "001", "010", "011", "100", "101", "110", "111"};
				int [] newNumbers = new int[3];
				String [] temp = in.nextLine().split(" ");
				for(int i = 0; i < temp.length; i++) {
					newNumbers[i] = Integer.parseInt(temp[i]);
				}
				String first = binary[newNumbers[0]] + " ";
				for(int i = 1; i < newNumbers.length; i++) {
					first += binary[newNumbers[i]] + " ";
				}
				
				String [] second = new String[11];
				for(int i = 0; i < second.length; i += 4) {
					if(first.charAt(i) == '1') {
						second[i] = "r";
					} else {
						second[i] = "-";
					}
				}
				for(int i = 1; i < second.length; i += 4) {
					if(first.charAt(i) == '1') {
						second[i] = "w";
					} else {
						second[i] = "-";
					}
				}
				for(int i = 2; i < second.length; i += 4) {
					if(first.charAt(i) == '1') {
						second[i] = "x";
					} else {
						second[i] = "-";
					}
				}
				for(int i = 3; i < second.length; i += 4) {
					second[i] = " ";
				}
				String combineSecond = "";
				for(int i = 0; i < second.length; i++) {
					combineSecond += second[i];
				}
				
				System.out.print(first + "and " + combineSecond);
				System.out.println();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}