package _2004_2005;
import java.io.*;
import java.util.*;

public class C1JR_Poker {
	public static void main(String [] args) {
		try {
			Scanner in = new Scanner(new File("0405c1jr.in"));
			for(int x = 0; x < 9; x++) {
				boolean four = false, three = false, two = false;
				String [] temp = in.nextLine().split(" ");
				int [] value = new int[5];
				for(int i = 0; i < 5; i++) {
					value[i] = Integer.parseInt(temp[i]);
					if(value[i] >= 40 && value[i] <= 52) {
						value[i] -= 39;
					} else if(value[i] >= 27) {
						value[i] -= 26;
					} else if(value[i] >= 14) {
						value[i] -= 13;
					} else {
						//value[i] stays the same
					}
				}
				int [] numRepeat = new int[5];
				for(int i = 0; i < 5; i++) {
					int count = 0;
					for(int j = 0; j < 5; j++) {
						if(value[i] == value[j] && i != j) {
							count++;
							numRepeat[i] = count;
						}
					}
				}
				
				Arrays.sort(numRepeat);
				if(numRepeat[1] == 3) {
					four = true;
				} else if(numRepeat[0] == 1 && numRepeat[2] == 2) {
					three = true;
					two = true;
				} else if(numRepeat[2] == 2){
					three = true;
				} else if(numRepeat[3] == 1) {
					two = true;
				} else {
					//none
				}
				
				if(four) {
					System.out.println("FOUR OF A KIND");
				} else if(three && two) {
					System.out.println("FULL HOUSE");
				} else if(three) {
					System.out.println("THREE OF A KIND");
				} else if(two) {
					System.out.println("PAIR");
				} else {
					System.out.println("NONE");
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}