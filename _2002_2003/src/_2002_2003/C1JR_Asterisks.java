package _2002_2003;
import java.util.*;
import java.io.*;

public class C1JR_Asterisks {
	public static void main(String [] args){
		try {
			Scanner in = new Scanner(new File("0203c1jr.in"));
			
			//giant for-loop
			for(int x = 0; x < 9; x++) {
				String [] temp = in.nextLine().split(" ");
				char fig = temp[0].charAt(0);
				int [] nums = new int[2];
				nums[0] = Integer.parseInt(temp[1]);
				nums[1] = fig == 'B'? Integer.parseInt(temp[2]) : nums[0];
				if(fig == 'S') {
					figureS(nums[0]);
				} else if(fig == 'H') {
					figureH(nums[0]);
				} else if(fig == 'L') {
					figureL(nums[0]);
				} else {
					figureB(nums[0], nums[1]);
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	//methods
	public static void figureS(int height) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < height; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
	}
	public static void figureH(int height) {
		for(int i = 0; i < height; i++) {
		    for (int j = 0; j < i; j++) {    
		        System.out.print(" ");
		    }
		    for (int j = i; j < height; j++) {   
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
	public static void figureL(int height) {
		 for(int i = 0; i <= height; i++) {
			 for (int j = 0; j < i; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 System.out.println();
	}
	public static void figureB(int length, int width) {
		for(int i = 0; i < width; i++) {
			for(int j = 0; j < length; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
	}
}