package _2001_2002;
import java.util.*;
import java.io.*;

public class C1JR_Code {
	public static void main(String [] args) {
		try {
			Scanner in = new Scanner(new File("0102c1jr.in"));
			char ans;
			
			//giant for-loop
			for(int x = 0; x < 10; x++) {
				String temp = in.nextLine();
				int value = temp.charAt(0) - 'A' + 1;
				
				if(value <= 5) {
					value *= 2;
				} else if(value <= 10) {
					value = (value % 3) * 5;
				} else if(value <= 15) {
					value = (value / 4) * 8;
				} else if(value <= 20) {
					value = ((value / 10) + (value % 10)) * 10;
				} else {
					//using method 'multiple'
					value = multiple(value) * 12;
				}
				
				if(value == 0) {
					ans = '#';
				} else {
					value = value % 26;
					if(value == 0) {
						value += 26;
					}
					ans = (char)(value + 'A' - 1);
									}
				System.out.println(ans);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static int multiple(int value) {
		for(int i = value / 2; i > 1; i--) {
			if(value % i == 0) {
				return i;
			}
		}
		return 1;
	}
}